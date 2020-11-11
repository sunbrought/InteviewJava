package org.dateConstruction.Queue;

public class ArrayQueueDemo {
    public static void main(String[] args) {
        ArrayQueue arrayQueue=new ArrayQueue(5);
        arrayQueue.addQueue(2);
        arrayQueue.addQueue(3);
        arrayQueue.addQueue(7);
        arrayQueue.addQueue(4);
        arrayQueue.addQueue(19);
        arrayQueue.outQueue();
        arrayQueue.showQueue();
        System.out.println("显示队列头部的数据："+arrayQueue.headQueue());
    }
}
//使用数组模拟队列-编写一个ArrayQueue
class ArrayQueue{
    private int maxsize;//表示数组的最大容量
    private int front;//队列头
    private int rear;//队列尾
    private int data[];//该数据用于存放数据，模拟队列
    //创建队列的构造器
    public ArrayQueue(int maxsize){
        this.maxsize=maxsize;
        this.front=-1;//指向队列头部，分析出front是指向队列头的前一个位置
        this.rear=-1;//指向队列尾部，指向队列尾的数据（即就是队列最后一个数据）
        data=new int[maxsize];
    }
    //队列是否为空
    public boolean isEmpty(){
        //队头与队尾相等时队列为空
        return this.front==this.rear;
    }
    //判断队列是否满
    public boolean isFull(){
        //队尾等于队列总长度时为满（maxsize-1是由于队列索引从0开始）
        return this.rear==this.maxsize-1;
    }
    //入队列
    public void addQueue(int data){
        if(isFull()){
            throw new RuntimeException("队列已满，不能添加数据！");
        }
        //队尾上移1位
        rear++;
        //存入数据
        this.data[rear]=data;
    }
    //出队列
    public int outQueue(){
        if(isEmpty()){
            throw new RuntimeException("队列为空，没有数据出队列！");
        }
        //队头上移1位（由于队头开始指的是队列第一个数据的前面位置）
        front++;
        //直接返回数据
        return data[front];
    }
    //遍历队列
    public void showQueue(){
        if(isEmpty()){
            System.out.println("队列为空无数据输出！");
        }
        for(int i=0;i<data.length;i++){
            System.out.printf("array[%d]=%d\n",i,data[i]);
        }
    }
    //显示头队列(只显示不出队列)
    public int headQueue(){
        if(isEmpty()){
            throw new RuntimeException("队列为空，没有数据输出！");
        }
        //显示队头数据，一定不能改变队头的值
        return data[front+1];
    }

}
