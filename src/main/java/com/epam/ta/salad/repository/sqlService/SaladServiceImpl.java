package com.epam.ta.salad.repository.sqlService;

import Entities.Salad;
import Entities.Vegetable;
import com.epam.ta.parking.util.NullCheckUtil;
import com.epam.ta.salad.repository.repositorySpecification.VegetableSpecification;
import com.epam.ta.salad.repository.sqlRepository.VegetableRepositoryImpl;
import com.epam.ta.salad.service.entitiesServices.SaladService;
import exceptions.NullVegetableException;

import java.sql.SQLException;
import java.util.List;

public class SaladServiceImpl implements SaladService {
    @Override
    public Salad add(Salad salad) throws SQLException, ClassNotFoundException {
        return null;
    }

    @Override
    public Salad update(Salad salad) throws SQLException {
        return null;
    }

    @Override
    public Salad remove(Salad salad) throws SQLException {
        return null;
    }

    @Override
    public List<Vegetable> getObjects(Salad salad) throws SQLException, NullVegetableException {
        List<Vegetable> saladofVegetables = null;
        if (null != salad) {
            if (!NullCheckUtil.notNullCheck(String.valueOf((salad.getSalad())))){
                throw new NullVegetableException("Salad is empty");
            }
            try {
                VegetableRepositoryImpl vegetableRepositoryImpl = new VegetableRepositoryImpl();
                VegetableSpecification specification = new VegetableSpecification();
               saladofVegetables = vegetableRepositoryImpl.getObjects(specification);

            }
            catch (SQLException e) {
                System.out.println("Unable to read vegetables from Salad");
            }
        }
        return saladofVegetables;
    }
    }

