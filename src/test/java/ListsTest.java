import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

@RunWith(value = Parameterized.class)
public class ListsTest
{
    private ListA instance;

    @Parameters
    public static Collection<Object[]> data() {
        Object[][] data = new Object[][]
                {
                        {new ArrayList0()},
                        {new ArrayList1()},
                        {new ArrayList2()}
                };
        return Arrays.asList(data);
    }

    public ListsTest(ListA instance) {
        this.instance = instance;
    }



    @Test
    public void initTest01()
    {
        int[] testArr = new int[] {10,20,30,40,50,60,70,80,90,100};
        instance.init(testArr);
        int exp = instance.size();
        assertEquals(exp, testArr.length);
    }

    @Test
    public void initTest02()
    {
        int[] testArr = new int[] {10,20,30,40,50,60,70,80,90,100};
        instance.init(testArr);
        int[] Arr = instance.toArray();
        assertArrayEquals(instance.toArray(), Arr);
    }

    @Test
    public void sizeTest01()
    {
        int[] testArr = new int[] {10,20,30,40,50,60,70,80,90,100};
        instance.init(testArr);
        int exp = instance.size();
        assertEquals(exp, testArr.length);
    }

    @Test
    public void clearTest01()
    {
        int[] testArr = new int[] {10,20,30,40,50,60,70,80,90,100};
        instance.init(testArr);
        instance.clear();
        assertArrayEquals(instance.toArray(), new int[] {});
    }

    @Test
    public void toArrayTest01()
    {
        int[] testArr = new int[] {10,20,30,40,50,60,70,80,90,100};
        instance.init(testArr);
        int[] Arr = instance.toArray();
        assertArrayEquals(Arr, testArr);
    }

    @Test
    public void setTest01()
    {
        instance.init(new int[] {10,20,30,40,50,60,70,80,90,100});
        instance.set(3, 300000);
        int[] Arr = instance.toArray();
        assertArrayEquals(new int[] {10,20,300000,40,50,60,70,80,90,100}, Arr);
    }

    @Test
    public void getTest01()
    {
        int[] testArr = new int[] {10,20,30,40,50,60,70,80,90,100};
        instance.init(testArr);
        int act = instance.get(3);
        assertEquals(testArr[2], act);
    }

    @Test
    public void addStartTest01()
    {
        int[] testArr = new int[] {10,20,30,40,50,60,70,80,90,100};
        instance.init(testArr);
        instance.addStart(10000);
        assertEquals(instance.get(1), 10000);
    }

    @Test
    public void addEndTest01()
    {
        int[] testArr = new int[] {10,20,30,40,50,60,70,80,90,100};
        instance.init(testArr);
        instance.addEnd(10000);
        assertEquals(instance.get(testArr.length + 1), 10000);
    }

    @Test
    public void addPosTest01()
    {
        int[] testArr = new int[] {10,20,30,40,50,60,70,80,90,100};
        instance.init(testArr);
        instance.addPos(5, 10000);
        int[] arr = instance.toArray();
        assertArrayEquals(new int[] {10,20,30,40,10000,50,60,70,80,90,100}, arr);
    }

    @Test
    public void delStartTest01()
    {
        int[] testArr = new int[] {10,20,30,40,50,60,70,80,90,100};
        instance.init(testArr);
        int act = instance.delStart();
        assertEquals(testArr[0], act);
    }

    @Test
    public void delEndTest01()
    {
        int[] testArr = new int[] {10,20,30,40,50,60,70,80,90,100};
        instance.init(testArr);
        int act = instance.delEnd();
        assertEquals(testArr[testArr.length - 1], act);
    }

    @Test
    public void delPosTest01()
    {
        int[] testArr = new int[] {10,20,30,40,50,60,70,80,90,100};
        instance.init(testArr);
        int act = instance.delPos(5);
        assertEquals(testArr[5], act);
    }
    @Test(expected= IndexOutOfBoundsException.class)
    public void delPosTest02()
    {
        int[] testArr = new int[] {10,20,30,40,50,60,70,80,90,100};
        instance.init(testArr);
        int act = instance.delPos(11);
        assertEquals(testArr[5], act);
    }

    @Test
    public void minTest01()
    {
        int[] testArr = new int[] {10,20,30,40,50,60,70,80,90,100};
        instance.init(testArr);
        int act = instance.minValue();
        assertEquals(10, act);
    }

    @Test
    public void minTest02()
    {
        int[] testArr = new int[] {100,20,30,40,50,60,70,80,90,10};
        instance.init(testArr);
        int act = instance.minValue();
        assertEquals(10, act);
    }

    @Test
    public void maxTest01()
    {
        int[] testArr = new int[] {10,20,30,40,50,60,70,80,90,100};
        instance.init(testArr);
        int act = instance.maxValue();
        assertEquals(100, act);
    }

    @Test
    public void minIndexTest01()
    {
        int[] testArr = new int[] {10,20,30,40,50,60,70,80,90,100};
        instance.init(testArr);
        int act = instance.minIndex();
        assertEquals(0, act);
    }

    @Test
    public void maxIndexTest01()
    {
        int[] testArr = new int[] {10,20,30,40,50,60,70,80,90,100};
        instance.init(testArr);
        int act = instance.maxIndex();
        assertEquals(9, act);
    }

    @Test
    public void reverseTest01()
    {
        int[] testArr = new int[] {10,20,30,40,50,60,70,80,90,100};
        instance.init(testArr);
        instance.reverse();
        int[] act = instance.toArray();
        assertArrayEquals(new int[] {100,90,80,70,60,50,40,30,20,10}, act);
    }

    @Test
    public void halfReversTest01()
    {
        int[] testArr = new int[] {10,20,30,40,50,60,70,80,90,100,110};
        instance.init(testArr);
        instance.halfRevers();
        int[] act = instance.toArray();
        assertArrayEquals(new int[] {70,80,90,100,110,60,10,20,30,40,50}, act);
    }

    @Test
    public void sortTest01()
    {
        int[] testArr = new int[] {100,90,10,40,80,70,20,30,50,60};
        instance.init(testArr);
        instance.sort();
        int[] Arr = instance.toArray();
        assertArrayEquals(new int[] {10,20,30,40,50,60,70,80,90,100}, Arr);
    }
}
