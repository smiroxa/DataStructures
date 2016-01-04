public class ArrayList0 extends ListA
{
    private int[] ar = null;

    public ArrayList0() {}

    public ArrayList0(int[] ini)
    {
        this.init(ini);
    }

    public ArrayList0(int length)
    {
        this.ar = new int[length];
        for(int i = 0; i <  this.ar.length; i++) {this.ar[i] = (int) Math.floor(Math.random() * 10);
            System.out.print(this.ar[i] + "  ");
        }
    }

    @Override
    public int size()
    {
        return this.ar.length;
    }

    @Override
    public void clear()
    {
        this.ar = new int[0];
    }

    @Override
    public void init(int[] ini)
    {
        if (ini == null)
            ini = new int[0];
        this.ar = new int[ini.length];
        for (int i = 0; i < ini.length; i++)
        {
            this.ar[i] = ini[i];
        }
    }

    @Override
    public int[] toArray()
    {
        int[] tmp = new int[this.ar.length];
        for (int i = 0; i < this.ar.length; i++)
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
        int[] tmp = new int[this.ar.length + 1];
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
        int[] tmp = new int[this.ar.length + 1];
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
        int[] tmp = new int[this.ar.length + 1];
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
    }

    @Override
    public int delStart()
    {
        int[] tmp = new int[this.ar.length - 1];
        int res = this.ar[0];
        for (int i = 1; i < this.ar.length; i++)
        {
            tmp[i - 1] = this.ar[i];
        }
        this.ar = tmp;
        return res;
    }

    @Override
    public int delEnd()
    {
        int[] tmp = new int[this.ar.length - 1];
        int res = this.ar[this.ar.length - 1];
        for (int i = 0; i <= tmp.length - 1; i++)
        {
            tmp[i] = this.ar[i];
        }
        this.ar = tmp;
        return res;
    }

    @Override
    public int delPos(int pos)
    {
        int[] tmp = new int[this.ar.length - 1];
        int res = this.ar[pos];

        for (int i = 0; i < tmp.length; i++)
        {
            if (i != pos)
            {
                tmp[i] = this.ar[i];
            }
        }
        this.ar = tmp;
        return res;
    }

    @Override
    public int minValue()
    {
        int min = this.ar[0];
        for (int i = 0; i < this.ar.length; i++)
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
        int max = this.ar[0];
        for (int i = 0; i < this.ar.length; i++)
        {
            if (this.ar[i] > max)
            {
                max = this.ar[i];
            }
        }
        return max;
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
