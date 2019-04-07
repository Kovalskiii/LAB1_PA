package com.example.lab1_pa1.AUTO;

public class VehicleType implements Vehicle
{



    @Override
    public String getEngineType()
    {
        return " ";
    }

    @Override
    public int getFuelTank()
    {
        return 0;
    }

    @Override
    public int getFuelLevel()
    {
        return 0;
    }

    @Override
    public float getEngineCapacity()
    {
        return (float) 0.0;
    }

    @Override
    public int getWheelNumber()
    {
        return 0;
    }
    @Override
    public String toString()
    {
        return getEngineType() + " " + getEngineCapacity() + " " + getFuelLevel() + " " + getFuelTank() + " " + getWheelNumber();
    }

}
