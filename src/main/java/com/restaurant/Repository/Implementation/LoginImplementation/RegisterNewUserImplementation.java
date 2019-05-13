package com.restaurant.Repository.Implementation.LoginImplementation;

import com.restaurant.Domain.Login.RegisterNewUser;
import com.restaurant.Repository.Login.RegisterNewUserRepository;

import java.util.*;

public class RegisterNewUserImplementation implements RegisterNewUserRepository {

    private static RegisterNewUserImplementation registerNewUserImplementation = null;
    private Map<String, RegisterNewUser> registerNewUserStringMap;

    private RegisterNewUserImplementation(){
        registerNewUserStringMap = new HashMap<>();
    }

    public static RegisterNewUserRepository getRepository(){
        if ( registerNewUserImplementation == null){
            registerNewUserImplementation = new RegisterNewUserImplementation();
        }
        return  registerNewUserImplementation;
    }

    @Override
    public Set<RegisterNewUser> getAll() {
        Collection<RegisterNewUser> registerNewUsers = this.registerNewUserStringMap.values();
        Set<RegisterNewUser> set = new HashSet<>();
        set.addAll(registerNewUsers);
        return set;
    }

    @Override
    public RegisterNewUser create(RegisterNewUser registerNewUser) {
        registerNewUserStringMap.put(registerNewUser.getName(), registerNewUser);
        RegisterNewUser reg = registerNewUserStringMap.get(registerNewUser.getName());
        return reg;
    }

    @Override
    public RegisterNewUser read(String s) {
        RegisterNewUser readNewUser = registerNewUserStringMap.get(s);
        return null;
    }

    @Override
    public RegisterNewUser update(RegisterNewUser registerNewUser) {
        registerNewUserStringMap.put(registerNewUser.getName(), registerNewUser);
        RegisterNewUser reg = registerNewUserStringMap.get(registerNewUser.getName());
        return reg;
    }

    @Override
    public void delete(String s) {
        registerNewUserStringMap.remove(s);
    }
}
