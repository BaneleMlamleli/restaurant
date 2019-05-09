package com.restaurant.Service.DatabaseCon.Implementation;

import com.restaurant.Domain.DatabaseCon.DatabaseConnection;
import com.restaurant.Repository.DatabaseCon.DatabaseConnectionRepository;
import com.restaurant.Service.DatabaseCon.DatabaseConnectionService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class DatabaseConnectionServiceImpl { /*implements RegisterNewUserService {

    private static DatabaseConnectionServiceImpl service = null;
    private DatabaseConnectionRepository repository;

    private DatabaseConnectionServiceImpl() {
        this.repository = DatabaseConnectionRepositoryImplementation.getRepository();// CourseRepositoryImpl.getRepository();
    }

    public static DatabaseConnectionServiceImpl getService(){
        if (service == null) service = new DatabaseConnectionServiceImpl();
        return service;
    }

    @Override
    public DatabaseConnection create(DatabaseConnection course) {
        return this.repository.create(course);
    }

    @Override
    public Course update(Course course) {
        return this.repository.update(course);
    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);
    }

    @Override
    public Course read(String s) {
        return this.repository.read(s);
    }

    @Override
    public Set<Course> getAll() {
        return this.repository.getAll();
    }*/
}
