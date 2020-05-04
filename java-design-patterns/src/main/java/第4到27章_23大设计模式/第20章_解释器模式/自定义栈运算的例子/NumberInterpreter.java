package 第4到27章_23大设计模式.第20章_解释器模式.自定义栈运算的例子;

/**
 * Created by geely.
 */
public class NumberInterpreter implements Interpreter {
    private int number;
    public NumberInterpreter(int number){
        this.number=number;
    }
    public NumberInterpreter(String number){
        this.number=Integer.parseInt(number);
    }
    @Override
    public int interpret(){
        return this.number;
    }
}
