/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.restaurant.Domain.DatabaseCon;

/**
 *
 * @author Banele
 */
import com.restaurant.Domain.Order.Order;
import com.restaurant.Domain.Stock.Stock;
import com.restaurant.Domain.Table.Table;

import java.io.*;
import java.sql.*;
import java.util.*;

import static com.restaurant.Domain.DatabaseCon.Database.*;

public class DatabaseConnection {

    /**
     * This method will read the restaurant.sql scrip that contains all the code
     * for creating database, tables and relationships
     * @return 
     */ 
    public String getSqlScript(){
        String script = "";
        InputStream fileReader = this.getClass().getResourceAsStream("restaurant.sql");
        Scanner scn = new Scanner(fileReader);
        while(scn.hasNext()){
            script += scn.nextLine()+"\n";
        }
        return script;
    }
    
    /**
     * This method will record all the data for all users who are registering into the application
     * I will use the Variable Arguments (Varargs) as there maybe an arbitrary number of values in some methods
     * and I am actually lazy to type all of the arguments in this method.
     * @param newUser
     * @throws SQLException
     */
    public static void registerUser(String... newUser) throws SQLException{
        try{
            prepStatement = connection.prepareStatement("INSERT INTO restaurant.user (name, surname, title, username, password) VALUES(?, ?, ?, ?, ?)");
            prepStatement.setString(1, newUser[0]);
            prepStatement.setString(2, newUser[1]);
            prepStatement.setString(3, newUser[2]);
            prepStatement.setString(4, newUser[3]);
            prepStatement.setString(5, newUser[4]);
            prepStatement.execute();
            System.out.println(newUser[0]+" has been registered successfully");
        }catch(SQLSyntaxErrorException see){
            see.printStackTrace();
        }catch(SQLException ex){
            ex.printStackTrace();
        }catch(Exception e){
            e.printStackTrace();
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
    
    /**
     * This method will verify the log in details of the user
     * @param username
     * @param password
     * @param title
     * @return 
     * @throws SQLException
     */
    public static boolean verifyUser(String username, String password, String title) throws SQLException{
        boolean verify = false;
        try{
            // creating the statement
            statement = connection.createStatement();
            // execute the sql query
            resultset=  statement.executeQuery("SELECT username, password, title FROM restaurant.user;");
            // processing the results to very the entered login details
            while(resultset.next()){
                verify = ((resultset.getString("username").equals(username)) &&
                        (resultset.getString("password").equals(password)) &&
                        (resultset.getString("title").equals(title)));
            }
            System.out.println("UserImplementation verification executed");
        }catch(SQLSyntaxErrorException see){
            see.printStackTrace();
        }catch(SQLException ex){
            ex.printStackTrace();
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            if(resultset != null){
                resultset.close();
            }
            if(statement != null){
                statement.close();
            }
        }
        return verify;
    }

    /**
     * This method will return all the amount of users that exist in the user database table
     * @return 
     * @throws SQLException
     */
    public static int howManyUsers() throws SQLException{
        int totalUsers = 0;
        try{
            // creating the statement
            statement = connection.createStatement();
            // execute the sql query
            resultset=  statement.executeQuery("SELECT * FROM restaurant.user");
            // processing the results to very the entered login details
            while(resultset.next()){
                totalUsers++;
            }
            System.out.println("total user calculation executed");
        }catch(SQLSyntaxErrorException see){
            see.printStackTrace();
        }catch(SQLException ex){
            ex.printStackTrace();
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            if(resultset != null){
                resultset.close();
            }
            if(statement != null){
                statement.close();
            }
        }
        return totalUsers;
    }
    
    public static void updateStock(String itemMenu[]) throws SQLException{
        try{
            // creating the statement
            statement = connection.createStatement();
            // execute the sql query
            resultset = statement.executeQuery("SELECT * FROM restaurant.stock");
            // processing the results to very the entered login details
            for (String itemMenu1 : itemMenu) {
                while(resultset.next()){
                    if (itemMenu1.equalsIgnoreCase(resultset.getString("item_name"))) {
                        prepStatement = connection.prepareStatement("UPDATE restaurant.stock SET restaurant.stock.usage = ? WHERE restaurant.stock.item_name = ?");
                        prepStatement.setInt(1, (Integer.parseInt(resultset.getString("usage"))+1));
                        prepStatement.setString(2, itemMenu1);
                        prepStatement.executeUpdate();
                    }
                }
            }
            System.out.println("stock update executed");
        }catch(SQLSyntaxErrorException see){
            see.printStackTrace();
        }catch(SQLException ex){
            ex.printStackTrace();
        }catch(Exception e){
            e.printStackTrace();
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
    
    public static void insertTableDetails(String tableStatus, String selectedTable, String waiterName) throws SQLException{
        try{
            prepStatement = connection.prepareStatement("INSERT INTO restaurant.table (table_status, table_name, waiter_name) VALUES(?, ?, ?)");
            prepStatement.setString(1, tableStatus);
            prepStatement.setString(2, selectedTable);
            prepStatement.setString(3, waiterName);
            prepStatement.execute();
            System.out.println(selectedTable+" order details inserted successfully");
        }catch(SQLSyntaxErrorException see){
            see.printStackTrace();
        }catch(SQLException ex){
            ex.printStackTrace();
        }catch(Exception e){
            e.printStackTrace();
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
    
    public static void insertOrderDetails(String orderComment, String order_name, String selectedTable, String waiterName, String orderStatus, double bill, String date) throws SQLException{
        try{
            prepStatement = connection.prepareStatement("INSERT INTO restaurant.order (comment, order_name, table_name, waiter_name, order_status, order_bill, order_date) VALUES(?, ?, ?, ?, ?, ?, ?)");
            prepStatement.setString(1, orderComment);
            prepStatement.setString(2, order_name);
            prepStatement.setString(3, selectedTable);
            prepStatement.setString(4, waiterName);
            prepStatement.setString(5, orderStatus);
            prepStatement.setDouble(6, bill);
            prepStatement.setString(7, date);
            prepStatement.execute();
            System.out.println("OrderImplementation has been placed successfully");
        }catch(SQLSyntaxErrorException see){
            see.printStackTrace();
        }catch(SQLException ex){
            ex.printStackTrace();
        }catch(Exception e){
            e.printStackTrace();
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
    
    /**
     * The below method will read all the data in the stock table and record
     * the response in an ArrayList object of type StockImplementation
     * @return 
     * @throws SQLException
     */
    public static ArrayList<Stock> selectAllStock() throws SQLException{
        ArrayList<Stock> stock = new ArrayList<>();
        try{
            // creating the statement
            statement = connection.createStatement();
            // execute the sql query
            resultset=  statement.executeQuery("SELECT * FROM restaurant.stock");
            // processing the results to very the entered login details
            while(resultset.next()){
               // stock.add(new StockImplementation(resultset.getString("item_name"), resultset.getInt("usage")));
            }
            System.out.println("All StockImplementation data read successfully");
        }catch(SQLSyntaxErrorException see){
            see.printStackTrace();
        }catch(SQLException ex){
            ex.printStackTrace();
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            if(resultset != null){
                resultset.close();
            }
            if(statement != null){
                statement.close();
            }
        }
        return stock;
    }
    
    /**
     * The below method will read all the data in the order table and record
     * the response in an ArrayList object of type OrderImplementation
     * @return 
     * @throws SQLException
     */
    public static ArrayList<Order> selectAllOrders() throws SQLException{
        ArrayList<Order> order = new ArrayList<>();
        try{
            // creating the statement
            statement = connection.createStatement();
            // execute the sql query
            resultset=  statement.executeQuery("SELECT * FROM restaurant.order");
            // processing the results to very the entered login details
            while(resultset.next()){
                int order_id = resultset.getInt("order_id");
                String comment = resultset.getString("comment");
                String order_name = resultset.getString("order_name");
                String table_name = resultset.getString("table_name");
                String waiter_name = resultset.getString("waiter_name");
                String order_status = resultset.getString("order_status");
                String order_date = resultset.getString("order_date");
                double order_bill = resultset.getDouble("order_bill");
                // order.add(new OrderImplementation(order_id, comment, order_name, table_name, waiter_name, order_status, order_date, order_bill));
            }
            System.out.println("All OrderImplementation data read successfully");
        }catch(SQLSyntaxErrorException see){
            see.printStackTrace();
        }catch(SQLException ex){
            ex.printStackTrace();
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            if(resultset != null){
                resultset.close();
            }
            if(statement != null){
                statement.close();
            }
        }
        return order;
    }
    
    /**
     * The below method will read all the data in the 'table' table and record
     * the response in an ArrayList object of type TableRepository
     * @return
     * @throws SQLException
     */
    public static ArrayList<Table> selectAllTables() throws SQLException{
        ArrayList<Table> table = new ArrayList<>();
        try{
            // creating the statement
            statement = connection.createStatement();
            // execute the sql query
            resultset=  statement.executeQuery("SELECT * FROM restaurant.table");
            // processing the results to very the entered login details
            while(resultset.next()){
                int table_id = resultset.getInt("table_id");
                String table_status = resultset.getString("table_status");
                String table_name = resultset.getString("table_name");
                String waiter_name = resultset.getString("waiter_name");
                // table.add(new TableImplementation(table_id, table_status, table_name, waiter_name));
            }
            System.out.println("All TableRepository data read successfully");
        }catch(SQLSyntaxErrorException see){
            see.printStackTrace();
        }catch(SQLException ex){
            ex.printStackTrace();
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            if(resultset != null){
                resultset.close();
            }
            if(statement != null){
                statement.close();
            }
        }
        return table;
    }
}
