public abstract class ListA implements ListI
{
    public abstract int   size();
    public abstract void  clear();
    public abstract void  init(int[] ini);
    public abstract int[] toArray();

    public abstract void  set(int pos, int val);
    public abstract int   get(int pos);

    public abstract void  addStart(int val);
    public abstract void  addEnd(int val);
    public abstract void  addPos(int pos, int val);

    public abstract int   delStart();
    public abstract int   delEnd();
    public abstract int   delPos(int pos);

    public abstract int minValue();
    public abstract int maxValue();

    public abstract int   minIndex();
    public abstract int   maxIndex();

    public abstract void  reverse();

    public abstract void  halfRevers();

    public abstract void  sort();

    public boolean equals(Object p)
    {
        ListA tmp = (ListA) p;
        if (this == tmp)
            return true;
        if (this.size() != tmp.size())
            return false;
        return false;
    }
}
