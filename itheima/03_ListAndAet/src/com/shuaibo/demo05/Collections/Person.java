package com.shuaibo.demo05.Collections;

public class Person implements Comparable<Person> {
    private String name;
    private  int age;

    //构造方法
    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    //get和set
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
//重写排序的规则
    @Override
    public int compareTo(Person o) {
        //return 0; //默认元素都是相同的
        //自定义比较规则，比较两个人的年龄(this,参数Persion)
        return this.getAge() - o.getAge();  //年龄升序
    }
}
