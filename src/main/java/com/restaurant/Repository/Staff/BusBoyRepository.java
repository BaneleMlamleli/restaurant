package com.restaurant.Repository.Staff;

import com.restaurant.Domain.Staff.BusBoy;
import com.restaurant.Repository.MainInterface;

import java.util.Set;

//import java.util.*;
public interface BusBoyRepository  extends MainInterface<BusBoy, String> {
    Set<BusBoy> getAll();

}
