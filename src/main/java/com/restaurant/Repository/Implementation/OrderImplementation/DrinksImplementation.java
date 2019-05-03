package com.restaurant.Repository.Implementation.OrderImplementation;

import com.restaurant.Domain.Order.Drinks;
import com.restaurant.Repository.Order.DrinksRepository;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DrinksImplementation  implements DrinksRepository {
    private static DrinksImplementation drinksImplementation = null;

    private Map<String, Drinks > drinksMap;

    private DrinksImplementation(){
        drinksMap = new HashMap<>();
    }

    public static DrinksRepository getRepository(){
        if ( drinksImplementation== null){
            drinksImplementation = new DrinksImplementation();
        }
        return  drinksImplementation;
    }
    @Override
    public Set<Drinks> getAll() {
        return null;
    }

    @Override
    public Drinks create(Drinks drinks) {
        drinksMap.put(drinks.toString(),drinks);
        Drinks drinks1 = drinksMap.get(drinks.toString());
        return drinks1;
    }

    @Override
    public Drinks read(String s) {

        Drinks drinks1 = drinksMap.get(s);
        return drinks1;
    }

    @Override
    public Drinks update(Drinks drinks) {
        drinksMap.put(drinks.toString(),drinks);
        Drinks drinks1 = drinksMap.get(drinks.toString());
        return drinks1;
    }

    @Override
    public void delete(String s) {
        drinksMap.remove(s);

    }
}
