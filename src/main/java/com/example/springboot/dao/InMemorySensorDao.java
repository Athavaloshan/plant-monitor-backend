
package com.example.springboot.dao;

import java.util.Optional;
import java.util.stream.Stream;
import java.util.*;
import com.example.springboot.dao.*;
import java.time.LocalDate;

import com.example.springboot.model.Sensor;

public class InMemorySensorDao implements SensorDao {
    private final List<Sensor> sensorRepo = new ArrayList<Sensor>();

    @Override
    public Sensor getByIdAndDate(int id, LocalDate ldt) {
        for (Sensor entry : sensorRepo) {
            if((entry.getId() == id) && (entry.getDate().compareTo(ldt) == 0)){
                return entry;
            }
        }

        System.out.println("Error: Get request for id : " + id + " local date : " + ldt + " not found");
        return null;
    }
    
    @Override
    public void deleteByIdAndDate(int id, LocalDate ldt){
        Iterator itr = sensorRepo.iterator();
        while (itr.hasNext()) {
            Sensor s = (Sensor)itr.next();
            if(s.getId() == id && s.getDate() == ldt){
                itr.remove();
            }
        }
    }


    @Override
    public void writeData(Sensor s){
        sensorRepo.add(s);
    }
}

