package com.example.newsapp;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class NewsPagerAdapter extends FragmentStateAdapter {
    public NewsPagerAdapter(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position)
        {
            case 0:
                TopStoriesFragment topStories = new TopStoriesFragment();
                return topStories;

            case 1:
                SportsFragment sports = new SportsFragment();
                return sports;

            case 2:
                TechnologyFragment technology = new TechnologyFragment();
                return technology;

            default:
                return null;
        }
    }

    @Override
    public int getItemCount() {
        return 3;
    }
}
