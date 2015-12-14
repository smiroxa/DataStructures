public class List2 extends ListsA
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
    int size() {
        return this.end - this.start;
    }

    @Override
    void clear()
    {
        this.end = this.start = this.ar.length/2;
    }

    @Override
    void init(int[] ini)
    {
        this.start = this.ar.length/2 - ini.length/2;
        for (int i = 0; i < ini.length; i++)
        {
            this.ar[this.start + i] = ini[i];
        }
        this.end = this.start + ini.length;
    }

    @Override
    int[] toArray()
    {
        int[] tmp = new int[size()];
        for (int i = 0; i < tmp.length; i++)
        {
            tmp[i] = this.ar[this.start + i];
        }
        return tmp;
    }

    @Override
    void set(int pos, int val)
    {

    }

    @Override
    int get(int pos)
    {
        return 0;
    }

    @Override
    void addStart(int val)
    {
        this.ar[--this.start] = val;
    }

    @Override
    void addEnd(int val)
    {
        this.ar[this.end++] = val;
    }

    @Override
    void addPos(int pos, int val)
    {

    }

    @Override
    int delStart()
    {
        return this.ar[this.start++];
    }

    @Override
    int delEnd()
    {
        return this.ar[--this.end];
    }

    @Override
    int delPos(int pos)
    {
        return 0;
    }

    @Override
    int minValue()
    {
        return 0;
    }

    @Override
    int maxValue()
    {
        return 0;
    }

    @Override
    int minIndex()
    {
        return 0;
    }

    @Override
    int maxIndex()
    {
        return 0;
    }

    @Override
    void reverse()
    {

    }

    @Override
    void halfRevers()
    {

    }

    @Override
    void sort()
    {

    }
}
