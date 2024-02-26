package com.example.demo.leetcode.dec2023;

import java.util.*;

/*
 ** Problem Solved Date  - 26th Dec 2023
 */
public class Dec17FoodRatings {

    Map<String, PriorityQueue<Food>> foodByCuisines = new HashMap<>();
    Map<String, Food> foodMap = new HashMap<>();

    public Dec17FoodRatings(String[] foods, String[] cuisines, int[] ratings) {
        int totalFoods = foods.length;
        String cuisine, food;
        int rating;
        for (int i = 0; i < totalFoods; i++) {
            cuisine = cuisines[i];
            food = foods[i];
            rating = ratings[i];
            Food foodObject = new Food(food, cuisine, rating);
            foodMap.put(food, foodObject);
            if (foodByCuisines.containsKey(cuisine)) {
                foodByCuisines.get(cuisine).add(foodObject);
            } else {
                PriorityQueue<Food> queue = new PriorityQueue<>((o1, o2) -> {
                    int diff = o2.getRating() - o1.getRating();
                    return diff == 0 ? o1.getFood().compareTo(o2.getFood()) : diff;
                });
                queue.add(foodObject);
                foodByCuisines.put(cuisine, queue);
            }
        }
    }

    public void changeRating(String food, int newRating) {
        Food foodObject = foodMap.get(food);
        if(foodObject.getRating() == newRating) {
            return;
        }
        foodObject.setFood("");
        Food newObject = new Food(food, foodObject.getCuisine(), newRating);
        foodByCuisines.get(foodObject.getCuisine()).add(newObject);
        foodMap.put(food, newObject);
    }

    public String highestRated(String cuisine) {
        while (foodByCuisines.get(cuisine).peek().getFood().equals("")) {
            foodByCuisines.get(cuisine).remove();
        }
        return foodByCuisines.get(cuisine).peek().getFood();
    }
}

class Food {
    private String food;
    private String cuisine;
    private int rating;

    public Food(String food, String cuisine, int rating) {
        this.food = food;
        this.cuisine = cuisine;
        this.rating = rating;
    }

    @Override
    public boolean equals(Object obj) {
        Food f = (Food) obj;
        return this.getFood().equals(f.getFood());
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getCuisine() {
        return cuisine;
    }

    public void setCuisine(String cuisine) {
        this.cuisine = cuisine;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}