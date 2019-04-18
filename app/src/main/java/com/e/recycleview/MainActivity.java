package com.e.recycleview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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
        contactsList.add(new Contacts("Saughat Malla","9845050002",R.drawable.saugat));
        contactsList.add(new Contacts("Rajesh Hamal","98425710000",R.drawable.rajesh));
        contactsList.add(new Contacts("Dahayang Rai","9852462423",R.drawable.dahayang));
        contactsList.add(new Contacts("Bhuwan KC","98400001212",R.drawable.bhuwan));

        ContactAdapter contactsAdapter= new ContactAdapter(this,contactsList);
        recyclerView.setAdapter(contactsAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


    }
}
