package creational_patterns.abstractFactory;

public class BuildMuscleGoal implements GoalFactory {

    @Override
    public MealPlan creatMealPlane() {
        return new BuildMuscleMealPlan();
    }

    @Override
    public WorkoutPlan creatWorkoutPlan() {
        return new BuildMuscleWorkoutPlane();
    }
}
