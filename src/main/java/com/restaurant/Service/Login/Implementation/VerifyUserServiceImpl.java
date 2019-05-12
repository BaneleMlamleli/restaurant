package com.restaurant.Service.Login.Implementation;

import com.restaurant.Domain.Login.VerifyUser;
import com.restaurant.Repository.Implementation.LoginImplementation.VerifyUserImplementation;
import com.restaurant.Repository.Login.VerifyUserRepository;
import com.restaurant.Service.Login.VerifyUserService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class VerifyUserServiceImpl implements VerifyUserService {

    private static VerifyUserServiceImpl service = null;
    private VerifyUserRepository repository;

    private VerifyUserServiceImpl() {
        this.repository = VerifyUserImplementation.getRepository();
    }

    public static VerifyUserServiceImpl getService(){
        if (service == null) service = new VerifyUserServiceImpl();
        return service;
    }

    @Override
    public VerifyUser create(VerifyUser verifyUser) {
        return this.repository.create(verifyUser);
    }

    @Override
    public VerifyUser update(VerifyUser verifyUser) {
        return this.repository.update(verifyUser);
    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);
    }

    @Override
    public VerifyUser read(String s) {
        return this.repository.read(s);
    }

    @Override
    public Set<VerifyUser> getAll() {
        return this.repository.getAll();
    }
}
