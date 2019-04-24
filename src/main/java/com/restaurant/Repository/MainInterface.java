package com.restaurant.Repository;

public interface MainInterface<T, ID> {
    T create(T t);
    T update(T t);
    void delete(ID id);
    T read(ID id);
}
