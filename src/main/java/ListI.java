public interface ListI
{
    int   size();
    void  clear();
    void  init(int[] ini);
    int[] toArray();

    void  set(int pos, int val);
    int   get(int pos);

    void  addStart(int val);
    void  addEnd(int val);
    void  addPos(int pos, int val);

    int   delStart();
    int   delEnd();
    int   delPos(int pos);

    int minValue();
    int maxValue();

    int   minIndex();
    int   maxIndex();

    void  reverse();

    void  halfRevers();

    void  sort();
}
