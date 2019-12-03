package com.epam.ta.salad.service.entitiesServices;


import com.epam.ta.salad.service.exceptions.NullVegetableException;


import java.sql.SQLException;

public interface BaseService<T> {

    T add(T t) throws SQLException, ClassNotFoundException, NullVegetableException;

    T update(T t) throws SQLException, NullVegetableException;

    T remove(T t) throws SQLException;

     //<T> readObjects(Salad salad) throws SQLException;


}
