package org.highProgram.ten;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class InvokeDemo {
    /*反射的基本应用*/
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException {
        Class<?> tClass = null;
        try {
            tClass=Class.forName("org.highProgram.ten.Book");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
//        获取全部的构造方法
        Constructor[] constructors= tClass.getConstructors();
        for(Constructor con : constructors){
            System.out.println("获取全部的构造器："+con);
        }
//       获取任意一个构造器
        Constructor constructor=tClass.getConstructor(String.class,Double.class,String.class);
        System.out.println("获取指定的构造器："+constructor);
//       获取当前类的对象
        Object object=constructor.newInstance("Java程序开发",3213.34,"人民出版社");
        System.out.println("Contructor类实例化对象："+object);
        Object obj=tClass.newInstance();
        System.out.println("Class类实例化对象："+obj);
//      获取当前所有的方法
        Method[] method=tClass.getMethods();
        for(Method me : method){
            System.out.println("获取全部的方法："+me);
        }
//      获取当前的方法
        String fieldName="name";
        Method setmethod=tClass.getMethod("set"+initcap(fieldName),String.class);
        Method getmethod=tClass.getMethod("get"+initcap(fieldName));
        setmethod.invoke(obj,"PHP程序设计");   //相当于执行setName()方法
        System.out.println("setName()方法设置的值："+getmethod.invoke(obj)); //相当于执行getName()方法
//      获取当前类所有的成员属性
        Field[] field=tClass.getDeclaredFields();
        for(Field fie : field){
            System.out.println("获取全部的的成员属性："+fie);
        }
//      获得指定的成员属性
        Field field1=tClass.getDeclaredField("price");
        field1.setAccessible(true);//取消封装，将pravate类型转为public
        System.out.println("获取指定的成员属性："+field1);
        field1.set(obj,543.54);//相当于执行this.price=price
        System.out.println("Book的Price："+field1.get(obj));//相当于执行Book.price
        Field field2=tClass.getDeclaredField("publish");
        field2.setAccessible(true);//取消封装，将pravate类型转为public
        field2.set(obj,"人民出版社");//相当于执行this.price=price
        System.out.println("Book的Publish："+field2.get(obj));//相当于执行Book.price
        System.out.println("obj的对象"+obj);
    }
//    截取方法首字母并转换成大写
    public static String initcap(String str){
        return str.substring(0,1).toUpperCase()+str.substring(1);
    }
}
