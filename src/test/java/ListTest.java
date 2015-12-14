import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class ListTest
{
    List0 list0 = new List0();

    @Test
    public void initTest01()
    {
        int[] testArr = new int[] {10,20,30,40,50,60,70,80,90,100};
        this.list0.init(testArr);
        int exp = this.list0.size();
        assertEquals(exp, testArr.length);
    }

    @Test
    public void initTest02()
    {
        int[] testArr = new int[] {10,20,30,40,50,60,70,80,90,100};
        this.list0.init(testArr);
        int[] Arr = this.list0.toArray();
        assertArrayEquals(this.list0.toArray(), Arr);
    }

    @Test
    public void sizeTest01()
    {
        int[] testArr = new int[] {10,20,30,40,50,60,70,80,90,100};
        this.list0.init(testArr);
        int exp = this.list0.size();
        assertEquals(exp, testArr.length);
    }

    @Test
    public void clearTest01()
    {
        int[] testArr = new int[] {10,20,30,40,50,60,70,80,90,100};
        this.list0.init(testArr);
        this.list0.clear();
        assertArrayEquals(this.list0.toArray(), new int[] {});
    }

    @Test
    public void toArrayTest01()
    {
        int[] testArr = new int[] {10,20,30,40,50,60,70,80,90,100};
        this.list0.init(testArr);
        int[] Arr = this.list0.toArray();
        assertArrayEquals(Arr, testArr);
    }

    @Test
    public void setTest01()
    {
        this.list0.init(new int[] {10,20,30,40,50,60,70,80,90,100});
        this.list0.set(3, 100);
        int[] Arr = this.list0.toArray();
        assertArrayEquals(new int[] {10,20,100,40,50,60,70,80,90,100}, Arr);
    }

    @Test
    public void getTest01()
    {
        int[] testArr = new int[] {10,20,30,40,50,60,70,80,90,100};
        this.list0.init(testArr);
        int act = this.list0.get(3);
        assertEquals(testArr[2], act);
    }

    @Test
    public void addStartTest01()
    {
        int[] testArr = new int[] {10,20,30,40,50,60,70,80,90,100};
        this.list0.init(testArr);
        this.list0.addStart(10000);
        assertEquals(this.list0.get(1), 10000);
    }

    @Test
    public void addEndTest01()
    {
        int[] testArr = new int[] {10,20,30,40,50,60,70,80,90,100};
        this.list0.init(testArr);
        this.list0.addEnd(10000);
        assertEquals(this.list0.get(testArr.length + 1), 10000);
    }

    @Test
    public void addPosTest01()
    {
        int[] testArr = new int[] {10,20,30,40,50,60,70,80,90,100};
        this.list0.init(testArr);
        this.list0.addPos(5, 10000);
        int[] Arr = this.list0.toArray();
        assertArrayEquals(new int[] {10,20,30,40,10000,50,60,70,80,90,100}, Arr);
    }

    @Test
    public void delStartTest01()
    {
        int[] testArr = new int[] {10,20,30,40,50,60,70,80,90,100};
        this.list0.init(testArr);
        int act = this.list0.delStart();
        assertEquals(testArr[0], act);
    }

    @Test
    public void delEndTest01()
    {
        int[] testArr = new int[] {10,20,30,40,50,60,70,80,90,100};
        this.list0.init(testArr);
        int act = this.list0.delEnd();
        assertEquals(testArr[testArr.length - 1], act);
    }

    @Test
    public void delPosTest01()
    {
        int[] testArr = new int[] {10,20,30,40,50,60,70,80,90,100};
        this.list0.init(testArr);
        int act = this.list0.delPos(5);
        assertEquals(testArr[5], act);
    }
    @Test(expected= IndexOutOfBoundsException.class)
    public void delPosTest02()
    {
        int[] testArr = new int[] {10,20,30,40,50,60,70,80,90,100};
        this.list0.init(testArr);
        int act = this.list0.delPos(11);
        assertEquals(testArr[5], act);
    }

    @Test
    public void minTest01()
    {
        int[] testArr = new int[] {10,20,30,40,50,60,70,80,90,100};
        this.list0.init(testArr);
        int act = this.list0.minValue();
        assertEquals(10, act);
    }

    @Test
    public void maxTest01()
    {
        int[] testArr = new int[] {10,20,30,40,50,60,70,80,90,100};
        this.list0.init(testArr);
        int act = this.list0.maxValue();
        assertEquals(100, act);
    }

    @Test
    public void minIndexTest01()
    {
        int[] testArr = new int[] {10,20,30,40,50,60,70,80,90,100};
        this.list0.init(testArr);
        int act = this.list0.minIndex();
        assertEquals(0, act);
    }

    @Test
    public void maxIndexTest01()
    {
        int[] testArr = new int[] {10,20,30,40,50,60,70,80,90,100};
        this.list0.init(testArr);
        int act = this.list0.maxIndex();
        assertEquals(9, act);
    }

    @Test
    public void reverseTest01()
    {
        int[] testArr = new int[] {10,20,30,40,50,60,70,80,90,100};
        this.list0.init(testArr);
        this.list0.reverse();
        int[] act = this.list0.toArray();
        assertArrayEquals(new int[] {100,90,80,70,60,50,40,30,20,10}, act);
    }

    @Test
    public void halfReversTest01()
    {
        int[] testArr = new int[] {10,20,30,40,50,60,70,80,90,100,110};
        this.list0.init(testArr);
        this.list0.halfRevers();
        int[] act = this.list0.toArray();
        assertArrayEquals(new int[] {70,80,90,100,110,60,10,20,30,40,50}, act);
    }

    @Test
    public void sortTest01()
    {
        int[] testArr = new int[] {100,90,10,40,80,70,20,30,50,60};
        this.list0.init(testArr);
        this.list0.sort();
        int[] Arr = this.list0.toArray();
        assertArrayEquals(new int[] {10,20,30,40,50,60,70,80,90,100}, Arr);
    }
}
