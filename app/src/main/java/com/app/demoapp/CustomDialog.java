package com.app.demoapp;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class CustomDialog extends AppCompatActivity {

    protected AppCompatButton ConfirmedBtn, DeleteBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_custom_dialog);

        ConfirmedBtn = findViewById(R.id.confirmation_btn);
        DeleteBtn = findViewById(R.id.delete_btn);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        ConfirmedBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(CustomDialog.this);
                builder.setTitle("Are You Ready to Join!")
                        .setMessage("This is from ARMY. If you want to join, this is the right time.")
                        .setIcon(R.drawable.baseline_cyclone_24)
                        .setPositiveButton("Read & Agree", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(CustomDialog.this, "You pressed ok!", Toast.LENGTH_SHORT).show();
                            }
                        })
                        .setNegativeButton("Cancel", null); // Optional: add a cancel button

                //AlertDialog confirmAlert = builder.create();
                builder.create().show();
                //confirmAlert.show();
            }
        });


        DeleteBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Dialog dialog = new Dialog(CustomDialog.this);
                dialog.setContentView(R.layout.filter_alert_layout);

                EditText MaxPrice = dialog.findViewById(R.id.max_price_et);
                EditText MinPrice = dialog.findViewById(R.id.min_price_et);
                EditText ProductBrand = dialog.findViewById(R.id.product_brand_et);
                AppCompatButton FilterNowBtn = dialog.findViewById(R.id.filter_now_btn);

                FilterNowBtn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String minPriceText = MinPrice.getText().toString();
                        String maxPriceText = MaxPrice.getText().toString();
                        String productBrandText = ProductBrand.getText().toString();

                        // Display the input data in a Toast
                        Toast.makeText(CustomDialog.this,
                                "Min Price: " + minPriceText +
                                        "\nMax Price: " + maxPriceText +
                                        "\nProduct Brand: " + productBrandText,
                                Toast.LENGTH_LONG).show();

                        dialog.dismiss();
                    }
                });

                dialog.show();
            }
        });


    }

    @Override
    public void onBackPressed() {

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Exit");
        builder.setMessage("Are you want to exit?");
        builder.setIcon(R.drawable.baseline_exit_to_app_24);

        builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getApplicationContext(), "Yes button pressed", Toast.LENGTH_SHORT).show();
            }
        });

        builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getApplicationContext(), "No button pressed", Toast.LENGTH_SHORT).show();
            }
        });

        builder.create().show();

        super.onBackPressed();
    }


}
