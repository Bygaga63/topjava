package ru.javawebinar.topjava.data;

import ru.javawebinar.topjava.model.Meal;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class MealData {
    private static final MealData data;
    private List<Meal> meals = new ArrayList<>();

    static {
        data = new MealData();
    }
    public static MealData getData() {
        return data;
    }

    private MealData() {

        Meal meal1 = new Meal( LocalDateTime.of(2018, 10, 6, 21, 8), "Chocolate", 900);
        Meal meal2 = new Meal(LocalDateTime.of(2018, 10, 7, 15, 8), "Chicken", 500);
        Meal meal3 = new Meal( LocalDateTime.of(2018, 10, 6, 21, 8), "Pig", 800);
        Meal meal4 = new Meal( LocalDateTime.of(2018, 10, 7, 9, 8), "Chocolate", 300);
        Meal meal5 = new Meal(LocalDateTime.of(2018, 10, 6, 21, 8), "Pie", 600);
        Meal meal6 = new Meal( LocalDateTime.of(2018, 10, 8, 21, 8), "Apple", 100);

        meals.add(meal1);
        meals.add(meal2);
        meals.add(meal3);
        meals.add(meal4);
        meals.add(meal5);
        meals.add(meal6);
    }

    public List<Meal> getMeals(){
        return meals;
    }
}
