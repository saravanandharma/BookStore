package com.saravanan.bookstore;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookStoreRepository extends JpaRepository<Book, Long> {
    List<Book> findByReader(String reader);
}
