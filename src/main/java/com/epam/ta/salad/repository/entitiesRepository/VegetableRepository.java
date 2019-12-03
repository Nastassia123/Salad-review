package com.epam.ta.salad.repository.entitiesRepository;

import Entities.Salad;
import Entities.Vegetable;
import com.epam.ta.salad.repository.repositorySpecification.VegetableSpecification;

import java.sql.SQLException;
import java.util.List;

public interface VegetableRepository extends BaseRepository<Vegetable> {

    int add(Vegetable vegetable) throws SQLException, ClassNotFoundException;

    int update(Vegetable vegetable) throws SQLException;

    int remove(Vegetable vegetable) throws SQLException;

    List<Vegetable> getObjects(VegetableSpecification vegetableSpecification) throws SQLException;

}
