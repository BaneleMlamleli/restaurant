package com.restaurant.Repository.Implementation.OrderImplementation;

import com.restaurant.Domain.Order.Dessert;
import com.restaurant.Repository.Order.DessertRepository;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DessertImplementation implements DessertRepository {

    private static DessertImplementation dessertImplementation = null;

    private Map<String, Dessert> dessertMap;

    private DessertImplementation(){
        dessertMap = new HashMap<>();
    }

    public static DessertRepository getRepository(){
        if ( dessertImplementation == null){
            dessertImplementation = new DessertImplementation();
        }
        return  dessertImplementation;
    }

    @Override
    public Set<Dessert> getAll() {
        return null;
    }


    @Override
    public Dessert create(Dessert dessert) {
        dessertMap.put(dessert.toString(),dessert);
        Dessert dessert1 = dessertMap.get(dessert.toString());
        return dessert1;
    }

    @Override
    public Dessert read(String s) {
        Dessert dessert1 = dessertMap.get(s);
        return dessert1;

    }

    @Override
    public Dessert update(Dessert dessert) {
        dessertMap.put(dessert.toString(),dessert);
        Dessert dessert1 = dessertMap.get(dessert.toString());
        return dessert1;
    }

    @Override
    public void delete(String s) {
        dessertMap.remove(s);

    }
}
