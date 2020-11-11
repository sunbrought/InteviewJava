package org.FaceObject.fifth;

public class Singleton {
    //懒汉式单例模式(在需要Singlelton对象的时候创建一个初始化对象)
    private static final Singleton singleton =null;
    //构造方法私有化
    private Singleton(){
    }
    //获取Singleton对象
    public static Singleton getSingleton(){
        return  new Singleton();
    }
    public void printf() {
        System.out.println("单例设计模式运行成功");
    }
}
class SingletonDemo{
    public static void main(String[] args) {
        Singleton singleton=Singleton.getSingleton();
        singleton.printf();
    }
}
