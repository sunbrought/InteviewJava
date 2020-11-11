package org.FaceObject.First.LinkTable;


/*每一个链表其实就是由多个节点组成*/
public class NodeLink {         //定义一个节点
     String data;    //保存节点得数据
     NodeLink next;      //要保存得下一个节点
    //每一个Node对象都必须保存有相应得数据
    public NodeLink(String data){//必须有数据才会有Node
        this.data=data;
    }

    public void setNext(NodeLink next){
        this.next=next;
    }

    public NodeLink getNext(){
        return this.next;
    }

    public String getData(){
        return this.data;
    }
    //添加一个新节点
    //第一次调用：this=Link.root
    //第二次调用：this=link.root.next
    //第三次调用：this=link.root.next.next
    public void addNode(NodeLink newNode) {
        //如果下一个节点为空
        if(this.next==null){
            //当前节点防止下一个节点位置
            this.next=newNode;
        }else{
            this.next.addNode(newNode);
        }
    }
    public void printNode(){
        System.out.println(this.data);
        if(this.next!=null){
            this.next.printNode();
        }
    }
}

//对链表进行操作(封装)
class Link{
    //定义根节点
    private NodeLink root;
    //向链表中添加数据
    public void add(String data){
        //定义一个新节点
        NodeLink newNode=new NodeLink(data);
        //如果没有根节点
        if(this.root==null){
            //当前节点称为根节点
            this.root=newNode;
        }else{
            //添加一个新得节点
            this.root.addNode(newNode);
        }
    }
    public void print(){
        this.root.printNode();
    }
}
class NodeLinkDemo{
    public static void main(String[] args) {
        Link link=new Link();
        link.add("根节点");
        link.add("节点1");
        link.add("节点2");
        link.add("节点3");
        link.print();
    }
}

