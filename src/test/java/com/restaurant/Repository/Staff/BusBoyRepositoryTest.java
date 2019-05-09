package com.restaurant.Repository.Staff;

import com.restaurant.Domain.Staff.BusBoyTest;
import com.restaurant.Repository.MainInterfaceTest;

import java.util.Set;

//import java.util.*;
public interface BusBoyRepositoryTest extends MainInterfaceTest<BusBoyTest, String> {
    Set<BusBoyTest> getAll();

}
