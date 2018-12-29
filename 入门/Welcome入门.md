#运行第一个java程序
###1、记事本编写，保存为Welcome.java文件
里面的函数名需要与文件名一致（注意大小写）

###2、写如下代码
```
public class Welcome{

	public static void main(String[] args){
	
		System.out.println("我是天才！");
		
	}
}

```
###3、编译
打开终端,并进入文件根目录,然后执行``` javac Welcome.java```进行编译。如果编译成功会在同目录下出现Welcome.class文件

###4、运行
打开终端执行```java Welcome```执行.class文件(注意不是javac，且文件没有后缀名了)。如果成功屏幕出现打印的字符：

```
mikasa:My-Java-Learn kangshuaibo$ javac Welcome.java
mikasa:My-Java-Learn kangshuaibo$ java Welcome
我是天才！
mikasa:My-Java-Learn kangshuaibo$ 

```
