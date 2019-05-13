package com.restaurant.Repository.Implementation.LoginImplementation;

import com.restaurant.Domain.Login.UserAccessRight;
import com.restaurant.Repository.Login.UserAccessRightRepository;

import java.util.*;

public class UserAccessRightImplementation implements UserAccessRightRepository {
    private static UserAccessRightImplementation userAccessRightImplementation = null;
    private Map<String, UserAccessRight> userAccessRightStringMap;

    private UserAccessRightImplementation(){
        userAccessRightStringMap = new HashMap<>();
    }

    public static UserAccessRightRepository getRepository(){
        if ( userAccessRightImplementation == null){
            userAccessRightImplementation = new UserAccessRightImplementation();
        }
        return  userAccessRightImplementation;
    }

    @Override
    public Set<UserAccessRight> getAll() {
        Collection<UserAccessRight> userAccessRights = this.userAccessRightStringMap.values();
        Set<UserAccessRight> set = new HashSet<>();
        set.addAll(userAccessRights);
        return set;
    }

    @Override
    public UserAccessRight create(UserAccessRight userAccessRight) {
        userAccessRightStringMap.put(userAccessRight.getTitle(),userAccessRight);
        UserAccessRight createUserAccessRight = userAccessRightStringMap.get(userAccessRight.getTitle());
        return createUserAccessRight;
    }

    @Override
    public UserAccessRight read(String s) {
        UserAccessRight readUserAccessRight = userAccessRightStringMap.get(s);
        return readUserAccessRight;
    }

    @Override
    public UserAccessRight update(UserAccessRight userAccessRight) {
        userAccessRightStringMap.put(userAccessRight.getTitle(), userAccessRight);
        UserAccessRight updateUsrAccessRght = userAccessRightStringMap.get(userAccessRight.getTitle());
        return updateUsrAccessRght;
    }

    @Override
    public void delete(String s) {
        userAccessRightStringMap.remove(s);
    }
}
