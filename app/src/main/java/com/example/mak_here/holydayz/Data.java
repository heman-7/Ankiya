package com.example.mak_here.holydayz;

import java.util.ArrayList;

/**
 * Created by Mak_Here on 7/6/2016.
 */
//initiliase all the array
public class Data {
    public static ArrayList<Information> getData() {

        ArrayList<Information> data = new ArrayList<>();

        String[] Spaces = {"Documents On ", " ", " " ," ", " ", " " ," ", " ", " "};
        String[] Title = {"Biometric Attendance System", "DigiLocker", "e-Sign", "e-Basta" ,"e-Scholarship" ,"myGov","Jeevan Pramaan","e-Hospital","e-Greetings"};


//added array list to object "data"
        for (int i = 0; i < Title.length; i++) {

            Information current = new Information();
            current.title = Title[i];
            current.subtitle=Spaces[i];
            data.add(current);
        }

        return data;
    }

}
