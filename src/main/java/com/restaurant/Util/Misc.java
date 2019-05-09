package com.restaurant.Util;

import java.util.UUID;

public class Misc {

    public static String generateId() {
        return UUID.randomUUID().toString();
    }
}
