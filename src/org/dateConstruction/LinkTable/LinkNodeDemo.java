package org.dateConstruction.LinkTable;

//定义一个节点
class Node{
    //数据域
    public int data;
    //指针域
    public Node next;

    public Node(int data){
        this.data=data;
    }

    @Override
    public String toString() {
        return "data=" + data +
                ", next=" + next ;
    }
}
//定义链表
class LinkNode{
    //定义一个头节点（数据域的值为空，指针域存放下一个节点的地址）
    Node node=new Node(0);
    //在链表尾部插入一个节点
    public void addNode(Node newNode){
        //定义一个辅助节点，用来指向需要操作的节点，因为头节点不能改变
        Node temp=node;
        while(true){
            if(temp.next==null){
                break;
            }
            temp=temp.next;
        }
        temp.next=newNode;
    }
    //给指定位置添加一个节点
    public void addByNode(Node newNode){
        Node temp=node;
        boolean flag=true;
        while(true){
            //判断链表是否到达最后一个节点
            if(temp.next==null){
                break;
            }
            //判断新节点的数据的插入位置
            if(temp.next.data>newNode.data){
                break;
            }
            //如果数值相同则修改标识并跳出
            if(temp.next.data==newNode.data){
                flag=false;
                break;
            }
            //后移，遍历当前链表
            temp=temp.next;
        }
        if(flag==false){
            System.out.println("数字已经存在，不能添加！");
        }else {
            //将下个节点指向新的节点上
            newNode.next=temp.next;
            //将新的节点指向上个节点
            temp.next=newNode;
        }
    }
    //对链表进行删除
    public void deleteNode(int data){
        Node temp=node;
        boolean flag=true;
        while(true){
            if(temp.next==null){
                break;
            }
            if(temp.next.data==data){
                flag=false;
                break;
            }
            temp=temp.next;
        }
        if(flag){
            System.out.println("链表已经到达最后一个位置！无法删除");
        }else{
            temp.next=temp.next.next;
        }

    }
    //对链表进行遍历
    public void listNode(){
        //判断是否为空
        if(node==null){
            System.out.println("单链表为空，不能进行遍历！");
        }
        //将头节点的下个节点放入辅助指针中，因为已经判断不为空，所以链表中最少有一个节点
        Node temp=node.next;
        while (true){
            if(temp.next==null){
                break;
            }
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
}
public class LinkNodeDemo{
    public static void main(String[] args) {

        Node node1=new Node(1);
        Node node2=new Node(2);
        Node node3=new Node(3);
        Node node4=new Node(4);
        Node node6=new Node(6);
        Node node8=new Node(8);
        Node node7=new Node(7);
        LinkNode linkNode=new LinkNode();

        linkNode.addNode(node1);
        linkNode.addNode(node2);
        linkNode.addNode(node3);
        linkNode.addNode(node4);
        linkNode.addNode(node6);
        linkNode.addNode(node8);
        linkNode.addByNode(node7);
        linkNode.deleteNode(2);
        linkNode.listNode();
    }
}
