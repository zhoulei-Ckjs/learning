package com.xinghuan.collection_;

import java.util.ArrayList;
import java.util.Iterator;

public class CollectionIterator {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Book("三国演义","罗贯中",10.1));
        arrayList.add(new Book("小李飞刀","古龙",5.1));
        arrayList.add(new Book("红楼梦","曹雪芹",34.6));
//        System.out.println("arraylist=" + arrayList);
        Iterator iter = arrayList.iterator();
        while (iter.hasNext()) {
            Object next =  iter.next();
            System.out.println("next=" + next);
        }
    }
}
class Book{
    private String name;
    private String author;
    private double price;

    public Book(String name, String author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }
}
