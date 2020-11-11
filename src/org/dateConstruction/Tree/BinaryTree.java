package org.dateConstruction.Tree;

/**
 *搜索二叉树
 */
public class BinaryTree {
    int data; //表示数字
    BinaryTree left;
    BinaryTree right;
    public BinaryTree(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }
    //插入
    public void insert(BinaryTree root,int data){
        if(root.data<data){
            if(root.right==null){
                root.right=new BinaryTree(data);
            }else{
                insert(root.right,data);
            }
        }else{
            if(root.left==null){
                root.left=new BinaryTree(data);
            }else{
                insert(root.left,data);
            }
        }
    }
    //中序遍历
    public void in(BinaryTree root){
        if(root!=null){
            in(root.left);
            System.out.println(root.data+"");
            in(root.right);
        }
    }

    public static void main(String[] args) {
        //定义一个数组，目的事务为了往二叉树中放入值
        int data[]={2,5,3,7,9,10,4,1,8};
        //设置序列第一个为root节点
        BinaryTree binaryTree=new BinaryTree(data[0]);//序列第一个为root节点
        //值从第二个开始放入树中
        for(int i=1;i<data.length;i++){
            binaryTree.insert(binaryTree,data[i]);
        }
        System.out.print("中序遍历：");
        binaryTree.in(binaryTree);
    }
}
