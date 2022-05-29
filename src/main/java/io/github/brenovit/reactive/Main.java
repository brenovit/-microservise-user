package io.github.brenovit.reactive;

public class Main {

    public static void main(String[] args){
        Book book = new Book();
        book.setName("Test 1");
        book.setInStock(false);

        EndUser end1 = new EndUser("Bob", book);
        EndUser end2 = new EndUser("Rob", book);

        book.setInStock(true);
        book.setInStock(false);
    }    

}