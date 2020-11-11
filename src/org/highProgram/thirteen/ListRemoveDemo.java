package org.highProgram.thirteen;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

class Book{
    private String name;
    private Double price;
    public Book(String name,Double price){
        this.name=name;
        this.price=price;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object){
            return true;
        }
        if(object==null){
            return false;
        }
        if(!(object instanceof Book)){
            return false;
        }
        Book book = (Book) object;
        if(this.name.equals(book.name)&&this.price.equals(book.price)){
            return true;
        }
        return false;
    }


    @Override
    public String toString(){
        return "书："+this.name+",价格："+this.price+"\n";
    }
}
public class ListRemoveDemo {
    public static void main(String[] args) {
        List<Book> list=new ArrayList<Book>();
        list.add(new Book("Java程序开发",34.32));
        list.add(new Book("PHP程序开发",43.32));
        list.add(new Book("Linux程序开发",43.32));
        //任何情况下集合数组的删除与内容的查询都必须提供有equals()方法
        list.remove(new Book("Linux程序开发",43.32));
        System.out.println(list);
    }
}
