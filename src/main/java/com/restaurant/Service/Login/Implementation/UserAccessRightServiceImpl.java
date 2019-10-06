package com.restaurant.Service.Login.Implementation;

import com.restaurant.Domain.Login.UserAccessRight;
import com.restaurant.Repository.Login.UserAccessRightRepository;
import com.restaurant.Service.Login.UserAccessRightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class UserAccessRightServiceImpl implements UserAccessRightService {

    private static UserAccessRightServiceImpl service = null;
    @Autowired
    private UserAccessRightRepository userAccessRightRepository;

    private UserAccessRightServiceImpl() {
//        this.userAccessRightRepository = UserAccessRightImplementation.getRepository();
    }

    public static UserAccessRightServiceImpl getService(){
        if (service == null) service = new UserAccessRightServiceImpl();
        return service;
    }

    @Override
    public UserAccessRight create(UserAccessRight userAccessRight) {
        return this.userAccessRightRepository.save(userAccessRight);
    }

    @Override
    public UserAccessRight update(UserAccessRight userAccessRight) {
        return this.userAccessRightRepository.save(userAccessRight);
    }

    @Override
    public void delete(String s) {
        this.userAccessRightRepository.deleteById(s);
    }

    @Override
    public UserAccessRight read(String s) {
        Optional<UserAccessRight> userAccess = this.userAccessRightRepository.findById(s);
        return userAccess.orElse(null);
    }

    @Override
    public Set<UserAccessRight> getAll() {
        return (Set<UserAccessRight>) this.userAccessRightRepository.findAll();
    }
}
