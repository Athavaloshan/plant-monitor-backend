package com.example.springboot.dao;
import java.util.Optional;
import java.util.stream.Stream;

import com.example.springboot.model.Sensor;
import java.time.LocalDate;

public interface SensorDao {
    public Sensor getByIdAndDate(int id, LocalDate ldt);
    public void deleteByIdAndDate(int id, LocalDate ldt);
    public void writeData(Sensor s);
};