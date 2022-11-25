package com.cnameless.renuevate;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

public class PlasticCategoryActivity extends AppCompatActivity implements PlasticListFragment.DrinkListListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plastic_category);
    }
    @Override
    public void itemClicked(long id) {
        View fragmentContainer = findViewById(R.id.fragment_details);
        if (fragmentContainer != null) {
            PlasticDetailFragment details = new PlasticDetailFragment();
            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            details.setPlastic(id);
            ft.replace(R.id.fragment_details, details);
            ft.addToBackStack(null);
            ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
            ft.commit();
        } else {
            Intent intent = new Intent(this, DetailActivity.class);
            intent.putExtra(DetailActivity.EXTRA_PLASTIC_ID, (int)id);
            startActivity(intent);
        }
    }
}