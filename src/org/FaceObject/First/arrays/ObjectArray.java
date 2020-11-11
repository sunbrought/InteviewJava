package org.FaceObject.First.arrays;

class Book{
    private String title;
    private double price;
    public Book(String title,double price){
        this.title=title;
        this.price=price;
    }
    //set,get方法省略
    public void getInfo(){
        System.out.println("书名："+this.title+",价格:"+this.price);
    }
}

public class ObjectArray {
    public static void main(String[] args) {

        Book book[] =new Book[3];
        book[0]=new Book("Java程序开发",54.32);
        book[1]=new Book("Android程序开发",44.32);
        book[2]=new Book("Linux程序开发",32.43);
        for(int i=0;i<book.length;i++){
            book[i].getInfo();
        }
    }
}
