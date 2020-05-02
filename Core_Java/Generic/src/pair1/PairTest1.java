package pair1;


public class PairTest1
{
    public static void main(String[] args)
    {
        String[] words = {"Mary","had","a","lottle","lamb"};
        Pair<String> mm = ArrayAlg.minmax(words);

        System.out.println("max =" +mm.getFirst());
        System.out.println("max =" +mm.getSecond());

    }
}

class ArrayAlg
{
    public static Pair<String> minmax(String[] a)   //返回使用范型类的函数 范型具体化为String对
    {
        if(a==null||a.length==0)
            return null;
        String min = a[0];
        String max = a[0];
        for(int i=1;i<a.length;i++)
        {
            if(min.compareTo(a[i])>0)   //调用String类的compareTo方法
                min = a[i];
            if(max.compareTo(a[i])<0)
                max = a[i];

        }
        return new Pair<>(min,max);
    }
}

