package org.FaceObject.four;

interface Fruit{
    public void eat();
}
class Apple implements Fruit{
    public void eat(){
        System.out.println("***正在吃苹果！");
    };
}
class Orange implements Fruit{
    public void eat(){
        System.out.println("***正在吃橘子！");
    };
}
class Factory{
    public static Fruit getInstance(String className){
        if("Apple".equals(className)){
            return new Apple();
        }else if("Orange".equals(className)){
            return new Orange();
        }
        return null;
    }
}
public class FactoryDemo {
    public static void main(String[] args) {
        Fruit fruit=Factory.getInstance("Apple");
        fruit.eat();

    }
}
