package com.example.springboot.model;

import jakarta.persistence.Entity;
import java.util.Objects;
import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name="sensors")
public class Sensor{
    @Id
    @GeneratedValue
    private int id;
    private LocalDate date;
    private  Double value;

    public Sensor(int id, LocalDate date, Double value) {
        this.id = id;
        this.date = date;
        this.value = value;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getDate() {
        return this.date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Double getValue() {
        return this.value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", date='" + getDate() + "'" +
            ", value='" + getValue() + "'" +
            "}";
    }

};