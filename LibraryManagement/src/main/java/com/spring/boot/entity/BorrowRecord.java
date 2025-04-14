package com.spring.boot.entity;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class BorrowRecord {
    private int borrow_id;
    private String member_name;
    private String member_mobile;
    private String isbn;
    private String borrow_date;
    private String due_date;
    private String status;
    private String title;
}

