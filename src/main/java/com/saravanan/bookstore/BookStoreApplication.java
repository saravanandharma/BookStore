package com.saravanan.bookstore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


//@SpringBootApplication   equals to the following 3 annotations!
//@ComponentScan
//@Configuration
//@EnableAutoConfiguration
@SpringBootApplication
public class BookStoreApplication {

    public static void main(String[] args) {

        SpringApplication.run(BookStoreApplication.class, args);
       // System.out.println(" Hello World...");

    }

}
