package chapter03principles.p05demeter;

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
