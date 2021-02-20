package pojo;

import org.jeasy.rules.annotation.*;


@Rule(name = "既不被3整除也不被8整除", description = "打印number自己")
public class OtherRule {
    @Condition
    public boolean isOther(@Fact("number") int number){
        return number % 2 != 0 || number % 5 != 0 || number % 7 != 0;
    }

    @Action
    public void printSelf(@Fact("number") int number){
        System.out.print(number + " is other");
    }

    @Priority
    public int getPriority(){
        return 4;
    }
}
