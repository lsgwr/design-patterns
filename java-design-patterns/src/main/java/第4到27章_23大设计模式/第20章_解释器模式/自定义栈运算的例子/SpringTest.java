package 第4到27章_23大设计模式.第20章_解释器模式.自定义栈运算的例子;

import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

/**
 * Created by geely
 */
public class SpringTest {
    public static void main(String[] args) {
        org.springframework.expression.ExpressionParser parser = new SpelExpressionParser();
        Expression expression = parser.parseExpression("100 * 2 + 400 * 1 + 66");
        int result = (Integer) expression.getValue();
        System.out.println(result);
    }
}
