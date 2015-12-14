public class List1 extends ListsA
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
    int size() {
        return this.top;
    }

    @Override
    void clear()
    {
        this.top = 0;
    }

    @Override
    void init(int[] ini)
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
    int[] toArray()
    {
        int[] tmp = new int[size()];
        for (int i = 0; i < size(); i++)
        {
            tmp[i] = this.ar[i];
        }
        return tmp;
    }

    @Override
    void set(int pos, int val)
    {
        this.ar[pos] = val;
    }

    @Override
    int get(int pos) {
        return this.ar[pos];
    }

    @Override
    void addStart(int val)
    {
        for (int i = top; i > 0; i--)
        {
            this.ar[i] = this.ar[i-1];
        }
        this.ar[0] = val;
        this.top++;
    }

    @Override
    void addEnd(int val)
    {
        ar[top++] = val;
    }

    @Override
    void addPos(int pos, int val) {

    }

    @Override
    int delStart() {
        return 0;
    }

    @Override
    int delEnd() {
        return ar[--top];
    }

    @Override
    int delPos(int pos) {
        return 0;
    }

    @Override
    int minValue() {
        return 0;
    }

    @Override
    int maxValue() {
        return 0;
    }

    @Override
    int minIndex() {
        return 0;
    }

    @Override
    int maxIndex() {
        return 0;
    }

    @Override
    void reverse() {

    }

    @Override
    void halfRevers() {

    }

    @Override
    void sort() {

    }
}
