package com.example.picasso.picassosample;

import com.example.picasso.picassosample.model.Image;

import java.util.ArrayList;

/**
 * Created by manishkumar on 04/09/15.
 */
public class Utilities {

    public static ArrayList<Image> getImageList() {

        ArrayList<Image> imageArrayList = new ArrayList<>();

        String url_1 = "http://techstory.in/wp-content/uploads/2015/02/sachin-tendulkar-sifr-651867782.jpg";
        String url_2 = "http://pngimg.com/upload/grass_PNG4930.png";
        String url_3 = "http://techstory.in/wp-content/uploads/2015/02/sachin-tendulkar-sifr-651867782.jpg";
        String url_4 = "http://www.filmnagarclub.com/wp-content/uploads/Sachin-Tendulkar-to-become-Keralite.jpg";
        String url_5 = "http://s3.india.com/wp-content/uploads/2014/04/sachin-tendulkar1.jpg";
        String url_6 = "http://techstory.in/wp-content/uploads/2015/05/sachin-tendulkar.jpg";
        String url_7 = "http://www.livemint.com/rf/Image-621x414/LiveMint/Period1/2013/11/20/Photos/sachin%20tendulkar--621x414.jpg";
        String url_8 = "http://i.dailymail.co.uk/i/pix/2013/08/28/article-2404712-1B815F79000005DC-228_306x423.jpg";
        String url_9 = "http://www.tadtoonew.com/wp-content/uploads/2015/04/19.Sachin-Tendulkar-is-Our-Brand-Ambassador..jpg";
        String url_10 = "http://www.hdwallpapers.in/walls/sachin_tendulkar-normal.jpg";
        String url_11 = "https://www.toptalent.in/blog/wp-content/uploads/2013/10/Sachin-World-Cup-Career-Lessons.jpg";
        String url_12 = "http://s.ndtvimg.com/images/content/2014/nov/806/sachin-tendulkar-book-jacket.jpg";
        String url_13 = "http://drop.ndtv.com/albums/SPORTS/sachin-wimbledon/1.jpg";

        imageArrayList.add(new Image(url_1));
        imageArrayList.add(new Image(url_2));
        imageArrayList.add(new Image(url_3));
        imageArrayList.add(new Image(url_4));
        imageArrayList.add(new Image(url_5));
        imageArrayList.add(new Image(url_6));
        imageArrayList.add(new Image(url_7));
        imageArrayList.add(new Image(url_8));
        imageArrayList.add(new Image(url_9));
        imageArrayList.add(new Image(url_10));
        imageArrayList.add(new Image(url_11));
        imageArrayList.add(new Image(url_12));
        imageArrayList.add(new Image(url_13));

        return imageArrayList;

    }
}
