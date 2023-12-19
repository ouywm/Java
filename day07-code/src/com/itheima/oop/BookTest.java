package com.itheima.oop;

public class BookTest {
    public static void main(String[] args) {
        Book book1 = new Book();

        book1.id = "001";
        book1.name = "三国";
        book1.price = 88.88;

        book1.show();


        Book book2 = new Book();

        book2.id = "002";
        book2.name = "水浒";
        book2.price = 88.88;

        book2.show();


        Book book3 = new Book();

        book3.id = "003";
        book3.name = "富婆通讯录";
        book3.price = 10000;

        book3.show();
    }
}
