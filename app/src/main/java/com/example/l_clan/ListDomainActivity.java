package com.example.l_clan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

//import com.example.l_clan.databinding.ActivityMainBinding;

//import java.util.ArrayList;

public class ListDomainActivity extends AppCompatActivity {
//    ActivityMainBinding binding;
    ListView listView;
    String[] name ={"Website Development","Android Development","AI Development","BlockChain Development","Programming Language","Interview Preparation","Database Development","Cloud Computing","Cyber Security","Operating Systems","Distributed Networking","Data mining"};
    int[] imageid = {R.drawable.webdevelopment,R.drawable.android,R.drawable.ai,R.drawable.blockchain,R.drawable.languge};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_domain);
//        binding = ActivityMainBinding.inflate(getLayoutInflater());
         listView= findViewById(R.id.ListvieW);

//         String[] Explore ={"ExploreWeb","ExploreAndroid","ExploreAI","ExploreBlockchian","ExploreLanguages"};

//        ArrayList<User> userArrayList = new ArrayList<>();
//
//        for (int i = 0; i < imageid.length; i++) {
//            User user = new User(name[i],Explore[i],imageid[i]);
//            userArrayList.add(user);
//        }
//
//        ListAdapter listAdapter = new ListAdapter(ListDomainActivity.this,userArrayList);
//        binding.listView.setAdapter(listAdapter);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(ListDomainActivity.this, android.R.layout.simple_expandable_list_item_1,name);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(ListDomainActivity.this, name[0], Toast.LENGTH_SHORT);
                  Intent intent = new Intent(getApplicationContext(),MainActivity2.class);
                  startActivity(intent);
            }
        });
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(ListDomainActivity.this, name[1], Toast.LENGTH_SHORT);
                Intent intent = new Intent(getApplicationContext(),MainActivity2.class);
                startActivity(intent);
            }
        });
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(ListDomainActivity.this, name[2], Toast.LENGTH_SHORT);
                Intent intent = new Intent(getApplicationContext(),MainActivity2.class);
                startActivity(intent);
            }
        });
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(ListDomainActivity.this, name[3], Toast.LENGTH_SHORT);
                Intent intent = new Intent(getApplicationContext(),MainActivity2.class);
                startActivity(intent);
            }
        });
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(ListDomainActivity.this, name[4], Toast.LENGTH_SHORT);
                Intent intent = new Intent(getApplicationContext(),MainActivity2.class);
                startActivity(intent);
            }
        });
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(ListDomainActivity.this, name[5], Toast.LENGTH_SHORT);
                Intent intent = new Intent(getApplicationContext(),MainActivity2.class);
                startActivity(intent);
            }
        });
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(ListDomainActivity.this, name[6], Toast.LENGTH_SHORT);
                Intent intent = new Intent(getApplicationContext(),MainActivity2.class);
                startActivity(intent);
            }
        });
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(ListDomainActivity.this, name[7], Toast.LENGTH_SHORT);
                Intent intent = new Intent(getApplicationContext(),MainActivity2.class);
                startActivity(intent);
            }
        });
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(ListDomainActivity.this, name[8], Toast.LENGTH_SHORT);
                Intent intent = new Intent(getApplicationContext(),MainActivity2.class);
                startActivity(intent);
            }
        });
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(ListDomainActivity.this, name[9], Toast.LENGTH_SHORT);
                Intent intent = new Intent(getApplicationContext(),MainActivity2.class);
                startActivity(intent);
            }
        });
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(ListDomainActivity.this, name[10], Toast.LENGTH_SHORT);
                Intent intent = new Intent(getApplicationContext(),MainActivity2.class);
                startActivity(intent);
            }
        });
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(ListDomainActivity.this, name[11], Toast.LENGTH_SHORT);
                Intent intent = new Intent(getApplicationContext(),MainActivity2.class);
                startActivity(intent);
            }
        });

    }
}