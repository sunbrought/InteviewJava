package org.FaceObject.First.LinkTable;


/*每一个链表其实就是由多个节点组成*/
public class Node {         //定义一个节点
     String data;    //保存节点得数据
     Node next;      //要保存得下一个节点
    //每一个Node对象都必须保存有相应得数据
    public Node(String data){//必须有数据才会有Node
        this.data=data;
    }

    public void setNext(Node next){
        this.next=next;
    }

    public Node getNext(){
        return this.next;
    }

    public String getData(){
        return this.data;
    }
}
class LinkDemo{
    public static void main(String[] args) {
        //1.准备所有数据
        Node root=new Node("火车头");                //定义节点，同时包装数据
        Node n1=new Node("车厢A");
        Node n2=new Node("车厢B");
        root.setNext(n1);                                //设置节点关系
        n1.setNext(n2);

        //取出所有数据
       Node currentNode=root;                            //当前东根节点开始读取
        while (currentNode != null) {                    //当前节点存在数据
            System.out.println(currentNode.getData());   //拿取数据
            currentNode = currentNode.getNext();         //将下一个节点设置为当前节点
        }
    }
}
