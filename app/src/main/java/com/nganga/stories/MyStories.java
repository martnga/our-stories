package com.nganga.stories;

/**
 * Created by nganga on 7/26/15.
 */
public class MyStories {

    String title;
    String desc;
    int image;

     //class constructor for the story components
    public MyStories(String title, String desc, int image)
    {
        this.title = title;
        this.desc = desc;
        this.image = image;
    }

    //getter methods
   public String getTitle()
   {
       return title;
   }

    public String getDesc()
    {
        return desc;
    }

    public int getImage()
    {
        return image;
    }
}
