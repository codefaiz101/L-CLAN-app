package com.example.l_clan;

import android.content.Context;
import java.util.ArrayList;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class ListAdapter extends ArrayAdapter<User> {

    public  ListAdapter(Context context , ArrayList<User> userArrayList){
        super(context,R.layout.listdomains,userArrayList);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        User user = getItem(position);

        if(convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.listdomains,parent,false);
        }

        ImageView imageView = convertView.findViewById(R.id.webimage);
        TextView domainName = convertView.findViewById(R.id.Domain1);
        TextView exploredom1 = convertView.findViewById(R.id.explore1);


        imageView.setImageResource(user.imageId);
        domainName.setText(user.Domain);
        exploredom1.setText(user.Explore);

        return super.getView(position, convertView, parent);
    }
}
