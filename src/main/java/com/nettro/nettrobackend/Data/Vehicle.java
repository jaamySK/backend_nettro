package com.nettro.nettrobackend.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Vehicle
{
    @Id
    int id;
    @Column(name = "driverDetail_id")
    int driverDetail_id;
    String color;
    String Plate;
    int numberOfSeet;


    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public int getDriverDetail_id()
    {
        return driverDetail_id;
    }

    public void setDriverDetail_id(int driverDetail_id)
    {
        this.driverDetail_id = driverDetail_id;
    }

    public String getColor()
    {
        return color;
    }

    public void setColor(String color)
    {
        this.color = color;
    }

    public String getPlate()
    {
        return Plate;
    }

    public void setPlate(String plate)
    {
        Plate = plate;
    }

    public int getNumberOfSeet()
    {
        return numberOfSeet;
    }

    public void setNumberOfSeet(int numberOfSeet)
    {
        this.numberOfSeet = numberOfSeet;
    }
}
