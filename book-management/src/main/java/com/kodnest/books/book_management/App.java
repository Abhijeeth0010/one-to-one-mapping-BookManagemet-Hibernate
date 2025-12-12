package com.kodnest.books.book_management;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       Scanner sc = new Scanner(System.in);
       
       System.out.println("Enter the book details: name, price, pages");
       Book book = new Book(sc.next(), sc.nextInt(), sc.nextInt());
       
       System.out.println("Enter the author details: name, gender, age, address: ");
       Author author = new Author(sc.next(), sc.next(), sc.nextInt(), sc.next());    
       
       SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
    
       Session session = sessionFactory.openSession();
       
       Transaction transaction = session.beginTransaction();
       
       
       book.setAuthor(author);
       
       session.persist(author);
       session.persist(book);
       
       transaction.commit();
       session.close();
       sessionFactory.close();
    }
}
