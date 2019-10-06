///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package com.restaurant.Repository.Implementation.StockImplementation;
//
//import com.restaurant.Domain.Stock.Stock;
//import com.restaurant.Repository.Stock.StockRepository;
//
//import java.util.*;
//
///**
// *
// * @author banelemlamleli
// */
//public class StockImplementation implements StockRepository {
//
//    private static StockImplementation stockImplementation = null;
//    private Map<String, Stock> stockMap;
//
//    private StockImplementation(){
//        stockMap = new HashMap<>();
//    }
//
//    public static StockRepository getRepository(){
//        if ( stockImplementation == null){
//            stockImplementation = new StockImplementation();
//        }
//        return  stockImplementation;
//    }
//
//    @Override
//    public Set<Stock> getAll() {
//        Collection<Stock> stocks = this.stockMap.values();
//        Set<Stock> set = new HashSet<>();
//        set.addAll(stocks);
//        return set;
//    }
//
//    @Override
//    public Stock create(Stock stock) {
//        stockMap.put(stock.getItemName(), stock);
//        Stock stk = stockMap.get(stock.getItemName());
//        return stk;
//    }
//
//    @Override
//    public Stock read(String s) {
//        Stock readStock = stockMap.get(s);
//        return null;
//    }
//
//    @Override
//    public Stock update(Stock stock) {
//        stockMap.put(stock.getItemName(), stock);
//        Stock updateStk = stockMap.get(stock.getItemName());
//        return updateStk;
//    }
//
//    @Override
//    public void delete(String s) {
//        stockMap.remove(s);
//    }
//}
