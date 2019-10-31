package org.sla;

public class Food {

    private int name;
    private int calories;
    private int totalFat;
    private int sodium;
    private int carbs;

    private int servingSize;


    public Food(int name, int servingSize, int calories, int fat, int sodium, int carbs){

        this.name = name;
        this.servingSize = servingSize;
        this.calories = calories;
        this.totalFat = fat;
        this.sodium = sodium;
        this.carbs = carbs;

    }

}
