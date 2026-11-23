package creational_patterns.abstractFactory;

public class HomePage {
    private WorkoutPlan workoutPlan;
    private MealPlan mealPlan;

    public void setGoal(GoalFactory goal) {
        this.mealPlan = goal.creatMealPlane();
        this.workoutPlan = goal.creatWorkoutPlan();

        System.out.println(workoutPlan);
        System.out.println(mealPlan);

    }
}
