public abstract class ListsA
{
    abstract int   size();
    abstract void  clear();
    abstract void  init(int[] ini);
    abstract int[] toArray();

    abstract void  set(int pos, int val);
    abstract int   get(int pos);

    abstract void  addStart(int val);
    abstract void  addEnd(int val);
    abstract void  addPos(int pos, int val);

    abstract int   delStart();
    abstract int   delEnd();
    abstract int   delPos(int pos);

    abstract int minValue();
    abstract int maxValue();

    abstract int   minIndex();
    abstract int   maxIndex();

    abstract void  reverse();

    abstract void  halfRevers();

    abstract void  sort();

    public boolean equals(Object p)
    {
        ListsA tmp = (ListsA) p;
        if (this == tmp)
            return true;
        if (this.size() != tmp.size())
            return false;
        return false;
    }
}
