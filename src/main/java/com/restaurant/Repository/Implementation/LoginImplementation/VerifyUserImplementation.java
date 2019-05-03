package com.restaurant.Repository.Implementation.LoginImplementation;

import com.restaurant.Domain.Login.VerifyUser;
import com.restaurant.Repository.Login.VerifyUserRepository;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class VerifyUserImplementation  implements VerifyUserRepository {

    private static VerifyUserImplementation verifyUserImplementation = null;

    private Map<String, VerifyUser >verifyUserMap;

    private VerifyUserImplementation(){
        verifyUserMap = new HashMap<>();
    }

    public static VerifyUserRepository getRepository(){
        if ( verifyUserImplementation == null){
            verifyUserImplementation = new VerifyUserImplementation();
        }
        return  verifyUserImplementation;
    }
    @Override
    public Set<VerifyUser> getAll() {
        return null;
    }

    @Override
    public VerifyUser create(VerifyUser verifyUser) {
        verifyUserMap.put(verifyUser.getPassword(),verifyUser);
        VerifyUser verifyUser1 = verifyUserMap.get(verifyUser.getPassword());
        return verifyUser1;
    }

    @Override
    public VerifyUser read(String s) {
        VerifyUser verifyUser = verifyUserMap.get(s);
        return verifyUser;
    }

    @Override
    public VerifyUser update(VerifyUser verifyUser) {
        verifyUserMap.put(verifyUser.getPassword(),verifyUser);
        VerifyUser verifyUser1 = verifyUserMap.get(verifyUser.getPassword());
        return verifyUser1;
    }

    @Override
    public void delete(String s) {
        verifyUserMap.remove(s);

    }
}
