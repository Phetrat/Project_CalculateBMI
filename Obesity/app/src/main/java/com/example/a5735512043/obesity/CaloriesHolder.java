package com.example.a5735512043.obesity;

/**
 * Created by 5735512043 on 4/22/2019.
 */

public class CaloriesHolder {
    String breakfast , lunch,dinner;

    public CaloriesHolder() {
    }

    public CaloriesHolder(String dinner, String lunch, String breakfast) {
        this.dinner = dinner;
        this.lunch = lunch;
        this.breakfast = breakfast;
    }

    public String getBreakfast() {
        return breakfast;
    }

    public void setBreakfast(String breakfast) {
        this.breakfast = breakfast;
    }

    public String getLunch() {
        return lunch;
    }

    public void setLunch(String lunch) {
        this.lunch = lunch;
    }

    public String getDinner() {
        return dinner;
    }

    public void setDinner(String dinner) {
        this.dinner = dinner;
    }
}
