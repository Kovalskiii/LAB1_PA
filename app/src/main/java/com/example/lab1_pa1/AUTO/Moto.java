package com.example.lab1_pa1.AUTO;

public class Moto extends VehicleType
{
    @Override
    public String getEngineType()
    {
        return "petrol";
    }

    @Override
    public int getFuelTank()
    {
        return 10;
    }

    @Override
    public float getEngineCapacity()
    {
        return (float) 0.5;
    }

    @Override
    public int getFuelLevel()
    {
        return 9;
    }

    @Override
    public int getWheelNumber()
    {
        return 2;
    }
}
