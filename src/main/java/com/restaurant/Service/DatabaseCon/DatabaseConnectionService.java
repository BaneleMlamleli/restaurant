package com.restaurant.Service.DatabaseCon;

import com.restaurant.Domain.DatabaseCon.DatabaseConnection;
import com.restaurant.Service.MainInterfaceService;

import java.util.Set;

public interface DatabaseConnectionService extends MainInterfaceService<DatabaseConnection, String> {
    Set<DatabaseConnection> getAll();
}
