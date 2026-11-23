package creational_patterns.abstractFactory;

public class Demo {
    public static void show() {
        var homePage = new HomePage();
        homePage.setGoal(new BuildMuscleGoal());
    }

}
