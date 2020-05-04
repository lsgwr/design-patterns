/***********************************************************
 * @Description : 
 * @author      : 梁山广(Liang Shan Guang)
 * @date        : 2020/5/4 14:26
 * @email       : liangshanguang2@gmail.com
 ***********************************************************/
package 第4到27章_23大设计模式.第23章_命令模式.课程管理的例子;

import java.util.ArrayList;
import java.util.List;

public class Staff {
    private List<Command> commandList = new ArrayList<>();

    public void addCommand(Command command){
        commandList.add(command);
    }

    public void executes(){
        for (Command command : commandList) {
            command.execute();
        }
        commandList.clear();
    }
}
