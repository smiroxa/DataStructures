import java.util.Arrays;

public class ArrayList1 extends ListA
{
    private int[] ar = null;
    private int top = 0;

    public ArrayList1()
    {
    }

    public ArrayList1(int[] ini)
    {
        init(ini);
    }

    @Override
    public int size()
    {
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
        this.ar = new int[ini.length];
        for (int i = 0; i < ini.length; i++)
        {
            this.ar[i] = ini[i];
        }
        this.top = this.ar.length;
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
        this.ar[pos - 1] = val;
    }

    @Override
    public int get(int pos)
    {
        return this.ar[pos - 1];
    }

    @Override
    public void addStart(int val)
    {
        int[] tmp = new int[++this.top];
        tmp[0] = val;
        for (int i = 0; i < this.ar.length; i++)
        {
            tmp[i + 1] = this.ar[i];
        }
        this.ar = tmp;
    }

    @Override
    public void addEnd(int val)
    {
        int[] tmp = new int[this.top + 1];
        for (int i = 0; i < this.ar.length; i++)
        {
            tmp[i] = this.ar[i];
        }
        tmp[tmp.length - 1] = val;
        this.ar = tmp;
    }

    @Override
    public void addPos(int pos, int val)
    {
//        System.out.println(Arrays.toString(this.ar));
        int[] tmp = new int[++this.top];
        for (int i = 0; i < pos - 1; i++)
        {
            tmp[i] = this.ar[i];
        }
        tmp[pos - 1] = val;
        for (int i = pos; i <= this.ar.length; i++)
        {
            tmp[i] = this.ar[i-1];
        }
        this.ar = tmp;
//        System.out.println(Arrays.toString(this.ar));
    }

    @Override
    public int delStart()
    {
        int res = this.ar[0];
        int[] tmp = new int[this.top - 1];
        for (int i = 1; i < this.top; i++)
        {
            tmp[i - 1] = this.ar[i];
        }
        this.ar = tmp;
        this.top = tmp.length;
        return res;
    }

    @Override
    public int delEnd()
    {
        return ar[--top];
    }

    @Override
    public int delPos(int pos)
    {
        int res = ar[pos];
        int[] tmp = new int[top];

        for (int i = 0; i < tmp.length; i++)
        {
            if(i != pos)
            {
                tmp[i] = this.ar[i];
            }
        }
        return res;
    }

    @Override
    public int minValue()
    {
        int min = this.ar[0];
        for (int i = 0; i < this.top; i++)
        {
            if (this.ar[i] < min)
            {
                min = this.ar[i];
            }
        }
        return min;
    }

    @Override
    public int maxValue()
    {
        int min = this.ar[0];
        for (int i = 0; i < this.top; i++)
        {
            if (this.ar[i] > min)
            {
                min = this.ar[i];
            }
        }
        return min;
    }

    @Override
    public int minIndex()
    {
        int minIndex = 0;
        for (int i = 0; i < this.ar.length; i++)
        {
            if (this.ar[i] < this.ar[minIndex])
            {
                minIndex = i;
            }
        }
        return minIndex;
    }

    @Override
    public int maxIndex()
    {
        int maxIndex = 0;
        for (int i = 0; i < this.ar.length; i++)
        {
            if (this.ar[i] > this.ar[maxIndex])
            {
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    @Override
    public void reverse()
    {
        int[] tmp = new int[this.ar.length];
        for (int i = this.ar.length - 1, j = 0; i >= 0; i--, j++)
        {
            tmp[j] = this.ar[i];
        }
        this.ar = tmp;
    }

    @Override
    public void halfRevers()
    {
        int half = this.ar.length / 2;
        int next = half + this.ar.length % 2;
        for (int i = 0; i < half; i++)
        {
            int tmp = this.ar[i];
            this.ar[i] = this.ar[i + next];
            this.ar[i + next] = tmp;
        }
    }

    @Override
    public void sort()
    {
        int min;
        for(int i = 0; i < this.ar.length; i++)
        {
            min = i;
            for(int j = i + 1; j < this.ar.length; j++)
            {
                if(this.ar[j] < this.ar[min])
                    min = j;
            }
            int tmp = this.ar[i];
            this.ar[i] = this.ar[min];
            this.ar[min] = tmp;
        }
    }
}
