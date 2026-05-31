package behavior_patterns.strategy_pattern;
import java.util.*;

public class strategy_main {
    public void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your method");
        String method = input.nextLine();
        perform p = new perform();

        switch (method){
            case "cash":
                p.pay(new cash());
                break;

            case "paypal":
                p.pay(new paypal());
                break;

            case "card":
                p.pay(new card());
                break;
        }


    }
}
