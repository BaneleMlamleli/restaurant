package com.restaurant.Domain.DatabaseCon;

import java.sql.*;

public class Database {
    public static Statement statement = null;
    public static ResultSet resultset = null;
    public static Connection connection = null;
    public static PreparedStatement prepStatement = null;

    /**
     * This method will connect to the local MySQL database
     * It will also insert the individual stock items into the stock database table
     * @throws SQLException
     */
    public static void connection() throws SQLException{
        try{
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurant", "root", "B!n@ryM@n01");
            System.out.println("DatabaseFactory connection successfully established");
            /**
             * The purpose of this selection is to check if the stock table is
             * populated. If the variable 'availableData' is zero that means the
             * table is empty and can be populated with default data.
             */
            statement = connection.createStatement();
            resultset = statement.executeQuery("SELECT * FROM restaurant.stock");
            int availableData = 0;
            while(resultset.next()){
                availableData++;
            }
            if(availableData == 0){
                // inserting all the individual menu items into the stock table and initialising the stock to zero
                String itemName[] = {"White cheese", "Parmesan cheese", "Cheese", "Beef", "Beef patty",
                        "Chicken breast", "Chicken patty", "Chicken strips", "Calamari", "Blue point oyster", "Shrimp",
                        "Crawfish", "Garlic bread", "Crouton", "Green leaf lettuce", "Red leaf lettuce", "Lemon",
                        "Romaine lettuce", "Gherkins", "Caesar dressing", "Cucumber", "Carrot", "Red onion",
                        "White onion", "Roma tomatoes", "Black-eyed peas", "Black pepper", "canola oil", "Flour"};

                for (int a = 0; a < itemName.length; a++) {
                    // create a prepared statement
                    prepStatement = connection.prepareStatement("INSERT INTO restaurant.stock (restaurant.stock.item_name, restaurant.stock.usage)\n" +
                            "VALUES (?, ?);");

                    // Execute SQL query
                    prepStatement.setString(1, itemName[a]);
                    prepStatement.setInt(2, 0);
                    prepStatement.execute();
                }
                System.out.println("Default stock items have been inserted into the stock database table");
            }
        }catch(SQLSyntaxErrorException see){
            see.printStackTrace();
        }catch(SQLException ex){
            ex.printStackTrace();
        }finally{
            if(resultset != null){
                resultset.close();
            }
            if(statement != null){
                statement.close();
            }
            if(prepStatement != null){
                prepStatement.close();
            }
        }
    }
}
