package com.app.demoapp.adapters;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.app.demoapp.R;
import com.app.demoapp.models.ContactModel;

import java.util.ArrayList;

public class ContactRecyclerViewAdapter extends RecyclerView.Adapter<ContactRecyclerViewAdapter.ViewHolder> {

    Context context;
    ArrayList<ContactModel> arr_contact;

    public ContactRecyclerViewAdapter(Context context, ArrayList<ContactModel> arr_contact){
        this.context = context;
        this.arr_contact = arr_contact;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.contact_row, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        holder.name.setText(arr_contact.get(position).getName());
        holder.contact_number.setText(arr_contact.get(position).getContact());
        holder.image.setImageResource(arr_contact.get(position).getImage());



    }

    @Override
    public int getItemCount() {
        return arr_contact.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView name, contact_number;
        ImageView image;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            name = itemView.findViewById(R.id.contact_name_tv);
            contact_number = itemView.findViewById(R.id.contact_number_tv);
            image = itemView.findViewById(R.id.contact_image_iv);

        }
    }
}
