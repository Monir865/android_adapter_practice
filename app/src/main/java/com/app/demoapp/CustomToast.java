package com.app.demoapp;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class CustomToast extends AppCompatActivity {

    protected AppCompatButton CustomToastClickMeBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_custom_toast);

        //
        CustomToastClickMeBtn = findViewById(R.id.custom_toast_click_me_btn);


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        //

        CustomToastClickMeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Toast.makeText(getApplicationContext(), "For dummy test", Toast.LENGTH_SHORT).show();

                Toast toast = new Toast(getApplicationContext());

                View view  = getLayoutInflater().inflate(R.layout.custom_toast_container, (ViewGroup) findViewById(R.id.custom_toast_container_view));

                toast.setView(view);

                TextView msg = view.findViewById(R.id.custom_toast_message);

                msg.setText("Love you sona");

                toast.show();
            }
        });




    }


}