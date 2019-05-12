package com.restaurant.Service.Login.Implementation;

import com.restaurant.Domain.Login.UserAccessRight;
import com.restaurant.Repository.Implementation.LoginImplementation.UserAccessRightImplementation;
import com.restaurant.Repository.Login.UserAccessRightRepository;
import com.restaurant.Service.Login.UserAccessRightService;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class UserAccessRightServiceImpl implements UserAccessRightService {

    private static UserAccessRightServiceImpl service = null;
    private UserAccessRightRepository repository;

    private UserAccessRightServiceImpl() {
        this.repository = UserAccessRightImplementation.getRepository();
    }

    public static UserAccessRightServiceImpl getService(){
        if (service == null) service = new UserAccessRightServiceImpl();
        return service;
    }

    @Override
    public UserAccessRight create(UserAccessRight userAccessRight) {
        return this.repository.create(userAccessRight);
    }

    @Override
    public UserAccessRight update(UserAccessRight userAccessRight) {
        return this.repository.update(userAccessRight);
    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);
    }

    @Override
    public UserAccessRight read(String s) {
        return this.repository.read(s);
    }

    @Override
    public Set<UserAccessRight> getAll() {
        return this.repository.getAll();
    }
}
