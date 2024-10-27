package com.app.demoapp;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.app.demoapp.adapters.ContactRecyclerViewAdapter;
import com.app.demoapp.models.ContactModel;

import java.util.ArrayList;

public class RecyclerViewUI extends AppCompatActivity {

    protected RecyclerView ContactRecyclerView;
    private static final ArrayList<ContactModel> arr_contact = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_recycler_view_ui);


        ContactRecyclerView = findViewById(R.id.contact_recycler_view);



        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });




        ContactRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        setDummyData();

        ContactRecyclerViewAdapter CRVA = new ContactRecyclerViewAdapter(getApplicationContext(), arr_contact);
        ContactRecyclerView.setAdapter(CRVA);


    }


    private void setDummyData(){
        arr_contact.add(new ContactModel(R.drawable.man_1, "Monir", "+22012546546"));
        arr_contact.add(new ContactModel(R.drawable.man_2, "Manna", "+22012546445"));
        arr_contact.add(new ContactModel(R.drawable.man_3, "Rafy", "+22011111546"));
        arr_contact.add(new ContactModel(R.drawable.man_4, "Riju", "+22012521212"));
        arr_contact.add(new ContactModel(R.drawable.man_5, "Rana", "+22012111144"));
        arr_contact.add(new ContactModel(R.drawable.man_2, "Jannat", "+2201250010"));
        arr_contact.add(new ContactModel(R.drawable.man_3, "Raju", "+22012545214"));
        arr_contact.add(new ContactModel(R.drawable.man_4, "Kobir", "+22012501021"));
        arr_contact.add(new ContactModel(R.drawable.man_2, "MIMI", "+22012546512"));
        arr_contact.add(new ContactModel(R.drawable.man_3, "Rofic", "+22012546147"));
        arr_contact.add(new ContactModel(R.drawable.man_1, "Farjana", "+22012546012"));
        arr_contact.add(new ContactModel(R.drawable.man_5, "Afsana", "+22012546065"));
        arr_contact.add(new ContactModel(R.drawable.man_3, "Fatema", "+22012547845"));
        arr_contact.add(new ContactModel(R.drawable.man_4, "Babu", "+22012546565"));
        arr_contact.add(new ContactModel(R.drawable.man_2, "Rasel", "+22012546124"));
        arr_contact.add(new ContactModel(R.drawable.man_3, "Raju", "+22012540122"));
        arr_contact.add(new ContactModel(R.drawable.man_5, "Riju", "+22012543210"));
        arr_contact.add(new ContactModel(R.drawable.man_4, "Jakir", "+22012545412"));
        arr_contact.add(new ContactModel(R.drawable.man_2, "Sumi", "+22012546542"));
    }


}