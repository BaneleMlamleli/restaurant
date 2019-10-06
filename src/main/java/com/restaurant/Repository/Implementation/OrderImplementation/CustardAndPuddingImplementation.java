//package com.restaurant.Repository.Implementation.OrderImplementation;
//
//import com.restaurant.Domain.Order.CustardAndPudding;
//import com.restaurant.Repository.Order.CustardAndPuddingRepository;
//
//import java.util.HashMap;
//import java.util.Map;
//import java.util.Set;
//
//public class CustardAndPuddingImplementation implements CustardAndPuddingRepository {
//
//    private static CustardAndPuddingImplementation custardAndPuddingImplementation = null;
//
//    private Map<String, CustardAndPudding > custardAndPuddingMap;
//
//    private CustardAndPuddingImplementation(){
//        custardAndPuddingMap = new HashMap<>();
//    }
//
//    public static CustardAndPuddingRepository getRepository(){
//        if ( custardAndPuddingImplementation == null){
//            custardAndPuddingImplementation = new CustardAndPuddingImplementation();
//        }
//        return  custardAndPuddingImplementation;
//    }
//
//    @Override
//    public Set<CustardAndPudding> getAll() {
//        return null;
//    }
//
//    @Override
//    public CustardAndPudding create(CustardAndPudding custardAndPudding) {
//        custardAndPuddingMap.put(custardAndPudding.toString(),custardAndPudding);
//        CustardAndPudding custardAndPudding1 = custardAndPuddingMap.get(custardAndPudding.toString());
//        return custardAndPudding1;
//    }
//
//    @Override
//    public CustardAndPudding read(String s) {
//        CustardAndPudding custardAndPudding1 = custardAndPuddingMap.get(s);
//
//        return custardAndPudding1;
//    }
//
//    @Override
//    public CustardAndPudding update(CustardAndPudding custardAndPudding) {
//        custardAndPuddingMap.put(custardAndPudding.toString(),custardAndPudding);
//        CustardAndPudding custardAndPudding1 = custardAndPuddingMap.get(custardAndPudding.toString());
//        return custardAndPudding1;
//    }
//
//    @Override
//    public void delete(String s) {
//        custardAndPuddingMap.remove(s);
//
//    }
//}
