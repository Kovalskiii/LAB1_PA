package com.example.lab1_pa1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

import com.example.lab1_pa1.AUTO.Automobil;
import com.example.lab1_pa1.AUTO.Moto;
import com.example.lab1_pa1.AUTO.Truck;
import com.example.lab1_pa1.AUTO.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Vehicle> vehicle = new ArrayList<>();

        for (int i = 0; i < 40; i++) {
            if (i % 3 == 0)
                vehicle.add(new Truck());
            else if (i % 3 == 1)
                vehicle.add(new Moto());
            else if (i % 3 == 2)
                vehicle.add(new Automobil());
        }

        Log.d("WOW", "Before sort:");
        StringBuilder vehicleString = new StringBuilder();
        for (Vehicle vehicle1 : vehicle) {
            vehicleString.append(vehicle1.toString()).append("\n");
        }
        Log.d("WOW", vehicleString.toString());
        vehicle.sort((o1, o2) -> o1.getWheelNumber() - o2.getWheelNumber());

        vehicleString = new StringBuilder();
        Log.d("WOW", "After sort:");
        for (Vehicle vehicle1 : vehicle) {
            vehicleString.append(vehicle1.toString()).append("\n");
        }
        Log.d("WOW", vehicleString.toString());
        StringBuilder str;
        str = new StringBuilder();
        for (Vehicle vehicle1 : vehicle)
            str.append(vehicle1).append("\n");
        TextView text = findViewById(R.id.label);
        text.setText(str.toString());
    }

}
