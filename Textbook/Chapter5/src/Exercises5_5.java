public class Exercises5_5       //产生0～100随机数，冒泡升序排序后将其输出
{
    public static void main(String[] args)
    {
        int[] num= new int[8];
        int temp;
        System.out.print("产生的随机数是：");
        for(int i=0;i<num.length;i++)
        {
            num[i]=(int)(100*Math.random());
            System.out.print(" "+num[i]);
        }
        //冒泡排序
        for(int i=0;i<num.length;i++)
            for(int j=i+1;j<num.length;j++)
            {
                if(num[i]>num[j])
                {
                    temp=num[i];
                    num[i]=num[j];
                    num[j]=temp;
                }
            }
        //输出排序后的数组
        System.out.print("\n排序后：");
        for(int i=0;i<num.length;i++)
        {
            System.out.print(" "+num[i]);
        }
    }

}
