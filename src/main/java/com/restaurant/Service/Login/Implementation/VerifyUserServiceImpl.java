package com.restaurant.Service.Login.Implementation;

import com.restaurant.Domain.Login.VerifyUser;
import com.restaurant.Repository.Login.VerifyUserRepository;
import com.restaurant.Service.Login.VerifyUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.Set;

@Service
public class VerifyUserServiceImpl implements VerifyUserService {

    private static VerifyUserServiceImpl service = null;
    @Autowired
    private VerifyUserRepository verifyUserRepository;

    private VerifyUserServiceImpl() {
//        this.verifyUserRepository = VerifyUserImplementation.getRepository();
    }

    public static VerifyUserServiceImpl getService(){
        if (service == null) service = new VerifyUserServiceImpl();
        return service;
    }

    @Override
    public VerifyUser create(VerifyUser verifyUser) {
        return this.verifyUserRepository.save(verifyUser);
    }

    @Override
    public VerifyUser update(VerifyUser verifyUser) {
        return this.verifyUserRepository.save(verifyUser);
    }

    @Override
    public void delete(String s) {
        this.verifyUserRepository.deleteById(s);
    }

    @Override
    public VerifyUser read(String s) {
        Optional<VerifyUser> verifyUser = this.verifyUserRepository.findById(s);
        return verifyUser.orElse(null);
    }

    @Override
    public Set<VerifyUser> getAll() {
        return (Set<VerifyUser>) this.verifyUserRepository.findAll();
    }
}
