package com.example.lab1_pa1.AUTO;

public class Truck extends VehicleType
{


    @Override
    public String getEngineType()
    {
        return "diesel";
    }

    @Override
    public int getFuelTank()
    {
        return 100;
    }

    @Override
    public int getFuelLevel()
    {
        return 70;
    }

    @Override
    public float getEngineCapacity() {
        return (float) 15.2;
    }

    @Override
    public int getWheelNumber()
    {
        return 10;
    }
}


