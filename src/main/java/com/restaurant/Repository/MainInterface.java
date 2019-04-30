package com.restaurant.Repository;

public interface MainInterface<T, ID> {
    T create(T t);
    T read(ID id);
    T update(T t);
    void delete(ID id);
}
