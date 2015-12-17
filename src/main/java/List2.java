public class List2 extends ListA
{
    private int[] ar = new int[30];
    private int end   = 15;
    private int start = 15;

    public List2()
    {
    }
    public List2(int[] ini)
    {
        init(ini);
    }

    @Override
    public int size() {
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
        return 0;
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
}
