/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.restaurant.Repository.Implementation.DatabaseConImplementation;

import com.restaurant.Domain.DatabaseCon.DatabaseConnection;
import com.restaurant.Domain.Login.RegisterNewUser;
import com.restaurant.Repository.DatabaseCon.DatabaseConnectionRepository;
import com.restaurant.Repository.Implementation.LoginImplementation.RegisterNewUserImplementation;
import com.restaurant.Repository.Login.RegisterNewUserRepository;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author Banele
 */


public class DatabaseConnectionRepositoryImplementation {/*implements DatabaseConnectionRepository {

    private static DatabaseConnectionRepositoryImplementation databaseConnectionRepositoryImplementation = null;
    private Map<String, RegisterNewUser> databaseConnectionMap;

    private DatabaseConnectionRepositoryImplementation(){
        databaseConnectionMap = new HashMap<>();
    }

    public static RegisterNewUserRepository getRepository(){
        if ( databaseConnectionRepositoryImplementation == null){
            databaseConnectionRepositoryImplementation = new DatabaseConnectionRepositoryImplementation();
        }
        return  databaseConnectionRepositoryImplementation;
    }

    @Override
    public Set<DatabaseConnection> getAll() {
        return null;
    }

    @Override
    public DatabaseConnection create(DatabaseConnection databaseConnection) {
        databaseConnectionMap.put(databaseConnection.getName(), databaseConnection);
        DatabaseConnection reg = databaseConnectionMap.get(databaseConnection.getName());
        return reg;
    }

    @Override
    public DatabaseConnection read(String s) {
        DatabaseConnection readNewDatabaseConnection = databaseConnectionMap.get(s);
        return readNewDatabaseConnection;
    }

    @Override
    public DatabaseConnection update(DatabaseConnection databaseConnection) {
        databaseConnectionMap.put(databaseConnection.getName(), databaseConnection);
        RegisterNewUser reg = databaseConnectionMap.get(databaseConnection.getName());
        return reg;
    }

    @Override
    public void delete(String s) {
        databaseConnectionMap.remove(s);

    }*/
}
