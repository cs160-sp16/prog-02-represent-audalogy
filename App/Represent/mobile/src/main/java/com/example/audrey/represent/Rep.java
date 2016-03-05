package com.example.audrey.represent;

import android.content.Context;

/**
 * Created by Audrey on 3/2/16.
 */
public class Rep {

    public String name;
    public String imageName;
    public String email;
    public String website;
    public String tweet;
//    public boolean isFav;

    public int getImageResourceId(Context context) {
        return context.getResources().getIdentifier(this.imageName, "drawable", context.getPackageName());
    }
}