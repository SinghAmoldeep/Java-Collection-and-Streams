package Java_Generics.MealPlanGenerator;

import Java_Generics.MealPlanGenerator.meal_plans.*;


public class Main {
    public static  <T extends IMealPlan> Meal<?> generateMeal(T meal){
        return new Meal<T>(meal, 10);
    }

    public static void main(String[] args) {
        VegetarianMeal vegMeal = new VegetarianMeal("Paneer", 200);
        NonVegetarianMeal nonVegMeal = new NonVegetarianMeal("Chicken", 120);

        Meal<?> meal = generateMeal(nonVegMeal);
        meal.display();
    }
}