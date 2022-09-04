package ru.skypro;

public class Main {

    public static void main(String[] args){
        var author1 = new Author("Ivan","Ivanov");
        var author2 = new Author("Петя","Петров");
        var book1 = new Book("ivanovskaya",author1,2013);
        var book2 = new Book("Петровская книга",author1,1999);
        book2.setPublicationYear(2015);
        System.out.println(book1);
        System.out.println(book2);
    }
}
