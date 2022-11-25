package com.cnameless.renuevate;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class PlasticDetailFragment extends Fragment {

    private long plasticId;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        if (savedInstanceState != null) {
            plasticId = savedInstanceState.getLong("plasticId");
        }
        return inflater.inflate(R.layout.fragment_plastic_detail, container, false);
    }
    @Override
    public void onStart() {
        super.onStart();
        View view = getView();
        if (view != null) {
            Plastic plastic = Plastic.plastics[(int) plasticId];

            /*
            ImageView imgItem = view.findViewById(R.id.imgItem);
            imgItem.setImageResource(plastic.getImageResourceId());
            */
            ViewPager2 viewPager2 = view.findViewById(R.id.viewpager2_plastic);
            ViewPager2Adapter viewPager2Adapter = new ViewPager2Adapter(getLayoutInflater().getContext(),plastic.getImagesResourcesIds());
            viewPager2.setAdapter(viewPager2Adapter);
            viewPager2.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
                @Override
                public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                    super.onPageScrolled(position, positionOffset, positionOffsetPixels);
                }
                @Override
                public void onPageSelected(int position) {
                    super.onPageSelected(position);
                }
                @Override
                public void onPageScrollStateChanged(int state) {
                    super.onPageScrollStateChanged(state);
                }
            });
            TextView name = view.findViewById(R.id.name);
            name.setText(plastic.getName());
            TextView acron = view.findViewById(R.id.acron);
            acron.setText(plastic.getAcron());
            TextView desc = view.findViewById(R.id.desc);
            desc.setText(plastic.getDescription());
        }
    }
    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        savedInstanceState.putLong("plasticId", plasticId);
    }
    public void setPlastic(long id) {
        this.plasticId = id;
    }
}