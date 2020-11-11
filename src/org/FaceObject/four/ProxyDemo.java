package org.FaceObject.four;

interface Subject{
    public void make();
}
class RealSubject implements Subject{
    @Override
    public void make() {
        System.out.println("实现最终的主题！");
    }
}
class ProxySubject implements Subject{
    private Subject subject;

    public ProxySubject(Subject subject){
        this.subject=subject;
    }
    public void prepare(){
        System.out.println("为实现最终主题做准备!");
    }
    @Override
    public void make() {
        this.prepare();
        this.subject.make();
        this.destory();
    }
    public void destory(){
        System.out.println("实现最终主题的结尾！");
    }
}
public class ProxyDemo {
    public static void main(String[] args) {
        Subject subject=new ProxySubject(new RealSubject());
        subject.make();
    }
}
