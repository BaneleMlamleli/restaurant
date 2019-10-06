package com.restaurant.Repository.Staff;

import com.restaurant.Domain.Staff.BusBoy;
import com.restaurant.Repository.MainInterface;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Set;

//import java.util.*;
public interface BusBoyRepository  extends JpaRepository<BusBoy, String> { //MainInterface<BusBoy, String> {
//    Set<BusBoy> getAll();
}
