
package Java_Generics.MealPlanGenerator.meal_plans;

public class NonVegetarianMeal implements IMealPlan {
    private String name;
    private int calories;

    public NonVegetarianMeal(String name, int calories) {
        this.name = name;
        this.calories = calories;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    @Override
    public void display() {
        System.out.println("Non-Vegetarian Meal: " + name + " Calories: " + calories );
    }
}
