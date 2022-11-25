package com.cnameless.renuevate;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class DetailActivity extends AppCompatActivity {

    public static final String EXTRA_PLASTIC_ID = "id";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        PlasticDetailFragment workoutDetailFragment = (PlasticDetailFragment) getSupportFragmentManager().findFragmentById(R.id.fragment_details);
        if(workoutDetailFragment!=null)
        {
            int plasticId = (int) getIntent().getExtras().get(EXTRA_PLASTIC_ID);
            workoutDetailFragment.setPlastic(plasticId);
        }
    }
}