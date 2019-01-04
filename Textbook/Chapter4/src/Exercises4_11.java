public class Exercises4_11  //输出以下数字图案
{
    public static void main(String[] args)
    {
        int i,n,k,m=5,s=1;
        for(i=0;i<m;i++)//一行一行开始
        {
            s+=i;   //第一行首元素
            n=1;
            k=s;
            do{//输出这一行的各个元素
                System.out.print(k+"\t");
                n++;
                k+=n+i; //如第二个元素为1+2 第三个为1+2+3
            }while(n<m-i);
            System.out.println();
        }
    }
}
