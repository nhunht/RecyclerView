package com.example.myapplication.adapters;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.myapplication.fragments.CategoriesFragment;
import com.example.myapplication.fragments.DealsFragment;
import com.example.myapplication.fragments.FeaturedFragment;

public class ViewPageAdapter extends FragmentStateAdapter {

    public ViewPageAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch(position){
            case 0:
                return new FeaturedFragment();
            case 1:
                return  new DealsFragment();
            case 2:
                return new CategoriesFragment();
            default:
                return new FeaturedFragment();
        }
    }

    @Override
    public int getItemCount() {
        return 3;
    }
}
