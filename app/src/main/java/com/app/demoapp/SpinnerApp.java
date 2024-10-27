package com.app.demoapp;

import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Spinner;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class SpinnerApp extends AppCompatActivity {
    protected Spinner IdProofSpinner;
    protected AutoCompleteTextView LocationAutoCompleteTV;
    private final ArrayList<String> arr_id_proof = new ArrayList<>();
    private final ArrayList<String> arr_locations = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_spinner_app);

        IdProofSpinner = findViewById(R.id.id_proof_spinner);
        LocationAutoCompleteTV = findViewById(R.id.location_autocomplete_textview);


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });


        setDummyData();
        ArrayAdapter<String> IdProofAdapter = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_list_item_1, arr_id_proof);
        IdProofSpinner.setAdapter(IdProofAdapter);


        ArrayAdapter<String> LocationAdapter = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_list_item_1, arr_locations);
        LocationAutoCompleteTV.setAdapter(LocationAdapter);


    }

    private void setDummyData(){
        arr_id_proof.add("National ID Card");
        arr_id_proof.add("Passport");
        arr_id_proof.add("Ration Card");
        arr_id_proof.add("Driving License");
        arr_id_proof.add("Electricity Bill");


        arr_locations.add("Dhaka, Bangladesh");
        arr_locations.add("Rangpur, Bangladesh");
        arr_locations.add("Sylet, Bangladesh");
        arr_locations.add("Rajsahi, Bangladesh");
        arr_locations.add("Cox'x Bazar, Bangladesh");
        arr_locations.add("Borishal, Bangladesh");
        arr_locations.add("Bramonbariya, Bangladesh");
    }

}