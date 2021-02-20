package pojo;

import org.jeasy.rules.annotation.*;


@Rule(name = "被2整除")
public class TwoRule {

    @Condition
    public boolean isTwo(@Fact("number") int number){
        return number % 2 == 0;
    }

    @Action
    public void twoAction(@Fact("number") int number){
        System.out.print(number + " is two");
    }

    @Priority
    public int getPriority(){
        return 1;
    }
}
