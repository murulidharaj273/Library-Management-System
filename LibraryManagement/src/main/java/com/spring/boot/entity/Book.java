package com.spring.boot.entity;


import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Book {
	private int book_id;
    private String title;
    private String author;
    private String genre;
    private String isbn;
    private int quantity;
    private String condition;
}
