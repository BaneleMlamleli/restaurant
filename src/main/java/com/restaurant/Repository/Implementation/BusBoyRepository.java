package com.restaurant.Repository.Implementation;

import com.restaurant.Domain.BusBoy;

public class BusBoyRepository extends MainInterface<> {

    private static BusBoyRepository busBoyRepository = null;
    private Set<BusBoy> busBoySet;

    private BusBoyRepository {

    }

    public static BusBoyRepository getBusBoyRepository(){
        if (busBoyRepository == null) {
            busBoyRepository = new BusBoyRepository();
        }
        return busBoyRepository;
    }

    public BusBoy create(BusBoy busBoy){
        // Insert into the Set of BusBoy
        return busBoy;
    }

    public BusBoy read(String busBoyName){

    }

    public BusBoy update(BusBoy busBoy){
        // Insert into the Set of BusBoy
        return busBoy;
    }

    public BusBoy delete(BusBoy busBoy){

    }

    public Set<BusBoy> getAll(){
        return null;
    }
}
