//package com.restaurant.Repository.Implementation.OrderImplementation;
//
//import com.restaurant.Domain.Order.Cake;
//import com.restaurant.Repository.Order.CakeRepository;
//
//import java.util.HashMap;
//import java.util.Map;
//import java.util.Set;
//
//public class CakeImplementation  implements CakeRepository {
//    private static CakeImplementation cakeImplementation = null;
//
//    private Map<String, Cake > cakeMap;
//
//    private CakeImplementation(){
//        cakeMap = new HashMap<>();
//    }
//
//    public static CakeRepository getRepository(){
//        if ( cakeImplementation == null){
//            cakeImplementation = new CakeImplementation();
//        }
//        return  cakeImplementation;
//    }
//
//    @Override
//    public Set<Cake> getAll() {
//        return null;
//    }
//
//    @Override
//    public Cake create(Cake cake) {
//        cakeMap.put(cake.toString(),cake);
//        Cake cake1 = cakeMap.get(cake.toString());
//        return cake1;
//    }
//
//    @Override
//    public Cake read(String s) {
//        Cake cake = cakeMap.get(s);
//        return cake;
//    }
//
//    @Override
//    public Cake update(Cake cake) {
//        cakeMap.put(cake.toString(),cake);
//        Cake cake1 = cakeMap.get(cake.toString());
//        return cake1;
//    }
//
//    @Override
//    public void delete(String s) {
//        cakeMap.remove(s);
//
//    }
//}
