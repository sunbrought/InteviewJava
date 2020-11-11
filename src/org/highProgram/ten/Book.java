package org.highProgram.ten;

public class Book {
    private String name;
    private Double price;
    private String publish;

    public Book(){
    }
    public Book(String name){
        this.name=name;
    }
    public Book(String name,Double price){
        this.name=name;
        this.price=price;
    }
    public Book(String name,Double price,String publish){
        this.name=name;
        this.price=price;
        this.publish=publish;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return this.name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getPublish() {
        return publish;
    }

    public void setPublish(String publish) {
        this.publish = publish;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", publish='" + publish + '\'' +
                '}';
    }
}
