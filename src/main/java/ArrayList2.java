import java.util.Arrays;

public class ArrayList2 extends ListA
{
    private int[] ar = new int[30];
    private int end   = 15;
    private int start = 15;

    public ArrayList2()
    {
    }
    public ArrayList2(int[] ini)
    {
        init(ini);
    }

    @Override
    public int size()
    {
        return this.end - this.start;
    }

    @Override
    public void clear()
    {
        this.end = this.start = this.ar.length/2;
    }

    @Override
    public void init(int[] ini)
    {
        if(ini== null)
        {
            ini=new int[0];
        }
        this.start = this.ar.length/2 - ini.length/2;
        for (int i = 0; i < ini.length; i++)
        {
            this.ar[this.start + i] = ini[i];
        }
        this.end = this.start + ini.length;
    }

    @Override
    public int[] toArray()
    {
        int[] tmp = new int[size()];
        for (int i = 0; i < tmp.length; i++)
        {
            tmp[i] = this.ar[this.start + i];
        }
        return tmp;
    }

    @Override
    public void set(int pos, int val)
    {

    }

    @Override
    public int get(int pos)
    {
        return 0;
    }

    @Override
    public void addStart(int val)
    {
        this.ar[--this.start] = val;
    }

    @Override
    public void addEnd(int val)
    {
        this.ar[this.end++] = val;
    }

    @Override
    public void addPos(int pos, int val)
    {

    }

    @Override
    public int delStart()
    {
        return this.ar[this.start++];
    }

    @Override
    public int delEnd()
    {
        return this.ar[--this.end];
    }

    @Override
    public int delPos(int pos)
    {
        checkPositionOrException(pos);
        int res = this.ar[this.start + pos - 1];
        int[] temp = new int[this.end - this.start - 1];
        for (int j = 0, i = 0; i < temp.length + 1; i++, j++)
        {
            if(i != pos - 1)
            {
                temp[j] = this.ar[start + i];
            }
        }
//        this.init(temp);
        return res;
    }

    @Override
    public int minValue()
    {
        return 0;
    }

    @Override
    public int maxValue()
    {
        return 0;
    }

    @Override
    public int minIndex()
    {
        return 0;
    }

    @Override
    public int maxIndex()
    {
        return 0;
    }

    @Override
    public void reverse()
    {

    }

    @Override
    public void halfRevers()
    {

    }

    @Override
    public void sort()
    {

    }

    private void checkSizeNotNullOrException()
    {
        if(size() == 0)
        {
            throw new NullPointerException();
        }
    }

    private void checkPositionOrException(int position)
    {
        if(position - 1 > size() || position - 1 < 0)
        {
            throw new IndexOutOfBoundsException();
        }
    }
}
