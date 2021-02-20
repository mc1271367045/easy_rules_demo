package pojo;

import org.jeasy.rules.annotation.*;


@Rule(name = "被5整除", description = "number如果被5整除，打印：number is three")
public class FiveRule {
    @Condition //条件判断注解：如果return true， 执行Action
    public boolean isFive(@Fact("number") int number){
        return number % 5 == 0;
    }

    @Action //执行方法注解
    public void fiveAction(@Fact("number") int number){
        System.out.print(number + " is Five");
    }

    @Priority //优先级注解：return 数值越小，优先级越高
    public int getPriority(){
        return 2;
    }
}
