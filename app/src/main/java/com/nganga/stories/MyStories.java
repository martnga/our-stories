package com.nganga.stories;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by nganga on 7/26/15.
 */
public class MyStories extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

    }

    String title;
    String desc;
    //int image;


    //class constructor for the story components
    public MyStories(String title, String desc/*, int image*/) {
        this.title = title;
        this.desc = desc;
        //this.image = image;
    }

    //getter methods
    public String getTitle() {
        return title;
    }

    public String getDesc() {
        return desc;
    }

    /*public int getImage()
    {
        return image;
    }*/
}
