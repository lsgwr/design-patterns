package 第3章_软件设计七大原则.S05_迪米特法则Demeter.test;

import 第3章_软件设计七大原则.S05_迪米特法则Demeter.Boss;
import 第3章_软件设计七大原则.S05_迪米特法则Demeter.TeamLeader;
import org.junit.Test;

/**
 * Boss Tester.
 *
 * @author liangshanguang
 * @date 04/18/2019
 * @description test
 */
public class DemeterTest {

    @Test
    public void testMain() {
        Boss boss = new Boss();
        TeamLeader teamLeader = new TeamLeader();
        boss.commandCheckNumber(teamLeader);
    }
} 
