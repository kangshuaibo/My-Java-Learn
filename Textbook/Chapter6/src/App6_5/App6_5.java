package App6_5;

public class App6_5
{
    public static void main(String[] args)
    {
        int[] a = {9,2,3,4,55};
        LeastNumb minNumber = new LeastNumb();
        minNumber.least(a);

    }
}

class LeastNumb
{
    public void least(int[] array)
    {
        int min = array[0];
        for(int i=1;i<array.length;i++)
        {
            if(min>array[i])
                min=array[i];
        }
        System.out.println("最小数为："+min);
    }
}
