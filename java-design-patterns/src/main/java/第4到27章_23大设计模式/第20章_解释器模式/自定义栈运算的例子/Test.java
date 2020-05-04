package 第4到27章_23大设计模式.第20章_解释器模式.自定义栈运算的例子;

/**
 * Created by geely.
 */
public class Test {
    public static void main(String[] args) {
        String geelyInputStr="6 100 11 + *";
        GeelyExpressionParser expressionParser=new GeelyExpressionParser();
        int result=expressionParser.parse(geelyInputStr);
        System.out.println("解释器计算结果: "+result);
    }
}
