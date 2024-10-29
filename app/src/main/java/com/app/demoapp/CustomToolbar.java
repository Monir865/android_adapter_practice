package com.app.demoapp;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class CustomToolbar extends AppCompatActivity {

    protected Toolbar CustomToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_custom_toolbar);

        //
        CustomToolbar = findViewById(R.id.custom_toolbar);


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        //
        setSupportActionBar(CustomToolbar);

        if(getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            //CustomToolbar.setTitle("Title");
            //CustomToolbar.setSubtitle("Sub-Title");
        }


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        new MenuInflater(this).inflate(R.menu.custom_menu, menu);
        //return super.onCreateOptionsMenu(menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

       int ItemId = item.getItemId();

       if(ItemId == R.id.custom_menu_home){
           Toast.makeText(this, "Home",Toast.LENGTH_SHORT).show();
       }else if(ItemId == R.id.custom_menu_chat){
           Toast.makeText(this, "Chat",Toast.LENGTH_SHORT).show();
       }else if(ItemId == R.id.custom_menu_payment){
           Toast.makeText(this, "Menu",Toast.LENGTH_SHORT).show();
       }else if(ItemId == android.R.id.home){
           Toast.makeText(this, "Back",Toast.LENGTH_SHORT).show();
       }

        return super.onOptionsItemSelected(item);

    }
}