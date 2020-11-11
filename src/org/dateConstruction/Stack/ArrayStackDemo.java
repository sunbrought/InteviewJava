package org.dateConstruction.Stack;

public class ArrayStackDemo {
    public static void main(String[] args) {
        ArrayStack arrayStack=new ArrayStack(8);
        arrayStack.add(1);
        arrayStack.add(2);
        arrayStack.add(3);
        arrayStack.add(4);
        arrayStack.add(6);
        arrayStack.add(7);
        arrayStack.list();
        arrayStack.pop();
        System.out.println("-----------");
        System.out.println("栈是否满："+arrayStack.full());
        while (!arrayStack.isEmpty()){
            System.out.println("出栈的数据："+arrayStack.pop());
        }
    }
}
//定义一个数组栈
class ArrayStack{
    //定义栈的长度
    private int maxsize;
    //定义一个数组用来保存数值
    private int data[];
    //定义栈顶,初始化为-1
    private int top=-1;
    //构造器
    public ArrayStack(int maxsize){
        this.maxsize=maxsize;
        //初始化数组
        data=new int[this.maxsize];
    }
    //栈满
    public boolean full(){
        return this.top==maxsize-1;
    }
    //栈空
    public boolean isEmpty(){
        return this.top==-1;
    }
    //入栈
    public void add(int data){
        //判断栈是否为空
        if(full()){
            System.out.println("栈满！");
            return;
        }
        //栈顶+1，然后放入数据
        top++;
        this.data[top]=data;
    }
    //出栈
    public int pop(){
        //先判断栈是否为空
        if(isEmpty()){
            System.out.println("栈空！");
            return 1;
        }
        //取出数据，然后栈顶标识-1
        int value=data[top];
        top--;
        return value;
    }
    //显示栈的情况遍历栈，遍历时需要从栈顶开始显示数据
    public void list(){
        if(isEmpty()){
            System.out.println("栈空！");
            return;
        }
        //需要从栈顶开始显示数据
        for(int i=top;i>=0;i--){
            System.out.println("栈中的值"+data[i]);
        }
    }
}
