package com.epam.ta.salad.service.entitiesServices;


import com.epam.ta.salad.entities.Salad;
import com.epam.ta.salad.entities.Vegetable;
import com.epam.ta.salad.service.exceptions.NullVegetableException;


import java.sql.SQLException;
import java.util.List;

public interface SaladService extends BaseService<Salad> {

    Salad add(Salad salad) throws SQLException, ClassNotFoundException;

    Salad update(Salad salad) throws SQLException;

    Salad remove(Salad salad) throws SQLException;

    List<Vegetable> getObjects(Salad salad) throws SQLException, NullVegetableException;


}
