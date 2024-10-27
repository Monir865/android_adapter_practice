package com.app.demoapp;

import android.app.AlertDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    protected ListView ContactListView;

    private final ArrayList<String> arr_contact = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        ContactListView = findViewById(R.id.contact_list_view);


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        setDummyData();
        ArrayAdapter<String> ContactListAdapter = new ArrayAdapter<>(getApplication(), android.R.layout.simple_list_item_1, arr_contact);
        ContactListView.setAdapter(ContactListAdapter);


        ContactListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String msg = "Number : "+ arr_contact.get(position);

                new AlertDialog.Builder(MainActivity.this)
                        .setTitle("Contact Information")
                        .setMessage(msg)
                        .setPositiveButton("OK", null)
                        .show();

            }
        });


    }

    private void setDummyData(){
        arr_contact.add("+201256555");
        arr_contact.add("+201356556");
        arr_contact.add("+201256557");
        arr_contact.add("+201256558");
        arr_contact.add("+201256544");
        arr_contact.add("+201256514");
        arr_contact.add("+201256522");
        arr_contact.add("+201256123");
        arr_contact.add("+201256785");
        arr_contact.add("+201254586");
        arr_contact.add("+201223698");
        arr_contact.add("+201112452");
        arr_contact.add("+201256555");
        arr_contact.add("+201356556");
        arr_contact.add("+201256557");
        arr_contact.add("+201256558");
        arr_contact.add("+201256544");
        arr_contact.add("+201256514");
        arr_contact.add("+201256522");
        arr_contact.add("+201256123");
        arr_contact.add("+201256785");
        arr_contact.add("+201254586");
        arr_contact.add("+201223698");
        arr_contact.add("+201112452");
        arr_contact.add("+201256555");
        arr_contact.add("+201356556");
        arr_contact.add("+201256557");
        arr_contact.add("+201256558");
        arr_contact.add("+201256544");
        arr_contact.add("+201256514");
        arr_contact.add("+201256522");
        arr_contact.add("+201256123");
        arr_contact.add("+201256785");
        arr_contact.add("+201254586");
        arr_contact.add("+201223698");
        arr_contact.add("+201112452");
    }


}