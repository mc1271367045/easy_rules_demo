package pojo;

import org.jeasy.rules.annotation.*;


@Rule(name = "被7整除")
public class SevenRule {

    @Condition //条件判断注解：如果return true， 执行Action
    public boolean isSeven(@Fact("number") int number) {
        return number % 7 == 0;
    }

    @Action //执行方法注解
    public void sevenAction(@Fact("number") int number) {
        System.out.print(number + " is Seven");
    }

    @Priority //优先级注解：return 数值越小，优先级越高
    public int getPriority() {
        return 3;
    }

}
