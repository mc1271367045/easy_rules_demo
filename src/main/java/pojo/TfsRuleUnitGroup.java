package pojo;

import org.jeasy.rules.annotation.Rule;
import org.jeasy.rules.support.UnitRuleGroup;

@Rule(name = "被2、5、7同时整除",  description = "这是一个组合规则")
public class TfsRuleUnitGroup extends UnitRuleGroup {
    public TfsRuleUnitGroup(Object... rules) {
        for (Object rule : rules) {
            addRule(rule);
        }
    }

    @Override
    public int getPriority() {
        return 0;
    }
}
