package com.example.amanbansal.testingapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.amanbansal.testingapp.dummy.DummyContent;

public class ListActivity extends AppCompatActivity implements ListFragment.OnListFragmentInteractionListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
    }

    @Override
    public void onListFragmentInteraction(DummyContent.DummyItem item) {

    }
}
