package behavior_patterns.template_pattern;

public class template_main {
    public static void main(String[] args){
        Window w1 = new WindowType1();
        Window w2 = new WindowType2();

        w1.close();
        w2.close();
    }
}
