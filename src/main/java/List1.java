public class List1 extends ListA
{
    private int[] ar = new int[10];
    private int top = 10;

    public List1()
    {
    }

    public List1(int[] ini)
    {
        init(ini);
    }

    @Override
    public int size() {
        return this.top;
    }

    @Override
    public void clear()
    {
        this.top = 0;
    }

    @Override
    public void init(int[] ini)
    {
        if(ini == null)
        {
            ini = new int[0];
        }
        for (int i = 0; i < ini.length; i++)
        {
            this.ar[i] = ini[i];
        }
        this.top = ini.length;
    }

    @Override
    public int[] toArray()
    {
        int[] tmp = new int[size()];
        for (int i = 0; i < size(); i++)
        {
            tmp[i] = this.ar[i];
        }
        return tmp;
    }

    @Override
    public void set(int pos, int val)
    {
        this.ar[pos] = val;
    }

    @Override
    public int get(int pos) {
        return this.ar[pos];
    }

    @Override
    public void addStart(int val)
    {
        for (int i = top; i > 0; i--)
        {
            this.ar[i] = this.ar[i-1];
        }
        this.ar[0] = val;
        this.top++;
    }

    @Override
    public void addEnd(int val)
    {
        ar[top++] = val;
    }

    @Override
    public void addPos(int pos, int val)
    {
    }

    @Override
    public int delStart() {
        return 0;
    }

    @Override
    public int delEnd() {
        return ar[--top];
    }

    @Override
    public int delPos(int pos) {
        return 0;
    }

    @Override
    public int minValue() {
        return 0;
    }

    @Override
    public int maxValue() {
        return 0;
    }

    @Override
    public int minIndex() {
        return 0;
    }

    @Override
    public int maxIndex() {
        return 0;
    }

    @Override
    public void reverse() {

    }

    @Override
    public void halfRevers() {

    }

    @Override
    public void sort() {

    }
}
