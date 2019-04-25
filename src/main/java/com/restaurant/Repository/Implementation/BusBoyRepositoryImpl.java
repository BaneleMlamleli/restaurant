package com.restaurant.Repository.Implementation;

import com.restaurant.Domain.BusBoy;
import com.restaurant.Repository.MainInterface;

import java.util.Set;

public class BusBoyRepositoryImpl extends MainInterface<BusBoy, String> {

    private static BusBoyRepositoryImpl busBoyRepositoryImpl = null;
    private Set<BusBoy> busBoySet;

    private BusBoyRepositoryImpl(){

    }

    public static BusBoyRepositoryImpl getBusBoyRepository(){
        if (busBoyRepositoryImpl == null) {
            busBoyRepositoryImpl = new BusBoyRepositoryImpl();
        }
        return busBoyRepositoryImpl;
    }

    public BusBoy create(BusBoy busBoy){
        // Insert into the Set of BusBoy
        return busBoy;
    }

    public BusBoy read(String busBoyName){
        return  null;
    }

    public BusBoy update(BusBoy busBoy){
        // Insert into the Set of BusBoy
        return busBoy;
    }

    public BusBoy delete(BusBoy busBoy){
        return busBoy;
    }

    public Set<BusBoy> getAll(){
        return null;
    }
}
