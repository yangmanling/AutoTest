package test.sample;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

/**dependsOnGroups 来设置组的依赖
 * testAdd1()和 testAdd2() 同属于于 funtest组
 * testAdd3() 依赖于funtest组，该组有中有一条用例运行失败，则testAdd3() 不再执行。
 */

public class DependentGroupsTest {

    @Test(groups = {"funtest"})
    public void testAdd1(){
        assertEquals(3+1,4);
    }

    @Test(groups = {"funtest"})
    public void testAdd2(){
        assertEquals(3+2,5);
    }

    @Test(dependsOnGroups = {"funtest"})
    public void testAdd3(){
        assertEquals(3+2,5);
    }
}
