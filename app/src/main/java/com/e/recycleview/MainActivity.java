package com.e.recycleview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import adapter.ContactAdapter;
import model.Contacts;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.recyclerview);

        List<Contacts> contactsList = new ArrayList<>();
        contactsList.add(new Contacts("Saughat Malla","9845050002","Saughat12@gmail.com","Kathmandu",R.drawable.saugat));
        contactsList.add(new Contacts("Rajesh Hamal","98425710000","Rajesh12@gmail.com","Bhairahawa",R.drawable.rajesh));
        contactsList.add(new Contacts("Dahayang Rai","9852462423","Dahayang12@gmail.com","Dharan",R.drawable.dahayang));
        contactsList.add(new Contacts("Bhuwan KC","98400001212","Bhuwankc12@gmail.com","Kathmandu",R.drawable.bhuwan));
        contactsList.add(new Contacts("Leo Messi","98400001212","Leomessi12@gmail.com","Argentina",R.drawable.leo));
        contactsList.add(new Contacts("Zayn Malik","98400001212","Zaynmalik12@gmail.com","California",R.drawable.zayn));
        contactsList.add(new Contacts("Salman khan","98400001212","Salmankhan12@gmail.com","Mumbai",R.drawable.salman));

        ContactAdapter contactsAdapter= new ContactAdapter(this,contactsList);
        recyclerView.setAdapter(contactsAdapter);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));


    }
}
