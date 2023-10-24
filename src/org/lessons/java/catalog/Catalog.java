package org.lessons.java.catalog;

import java.util.Arrays;
import java.util.Scanner;

public class Catalog {
    public static void main(String[] args) {
        // istanzio lo scanner
        Scanner scanner = new Scanner(System.in);

        //inizializzo l'array di oggetti per la creazione dei libri
        System.out.println("Enter the number of book you want to create: ");
        int numBook = scanner.nextInt();
        scanner.nextLine();
        Book[] books = new Book[numBook];


        for (int i = 0; i < numBook; i++) {
            try {
                System.out.println("Enter book data");
                System.out.println("Enter the title of the book:");
                String title = scanner.nextLine();
                System.out.println("Enter the number of page:");
                int pageCount = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Enter author's name  of the book: ");
                String author = scanner.nextLine();
                System.out.println("Enter publisher's name of the book: ");
                String publisher = scanner.nextLine();

                books[i] = new Book(title, pageCount, author, publisher);
            } catch (IllegalArgumentException e) {
                System.out.println("error: " + e);
                break;
            }
        }
        for (Book book : books) {
            System.out.println(book);
        }

    }
}
