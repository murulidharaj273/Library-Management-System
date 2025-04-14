package com.spring.boot.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.spring.boot.entity.BorrowRecord;
import com.spring.boot.service.BorrowService;

@Controller
public class BorrowController {

    @Autowired
    private BorrowService borrowService;

    @RequestMapping("/borrowbook")
    public ModelAndView borrowBook(@RequestParam("member_mobile") String member_mobile,
                                   @RequestParam("isbn") String isbn) {
        LocalDate today = LocalDate.now();
        LocalDate dueDate = today.plusDays(14);

        borrowService.borrowBook(member_mobile, isbn, today.toString(), dueDate.toString());
       

        return new ModelAndView("borrow.jsp");
    }

    @RequestMapping("/viewborrows")
    public ModelAndView viewBorrows() {
        List<BorrowRecord> list = borrowService.viewAllBorrows();
        return new ModelAndView("viewborrows.jsp", "borrowList", list);
    }
    
    @RequestMapping("/returnbook")
    public ModelAndView returnbook(@RequestParam("member_mobile") String member_mobile,
                                   @RequestParam("isbn") String isbn) {
        

        borrowService.returnBook(member_mobile, isbn);
       

        return new ModelAndView("return.jsp");
    }
    
    @RequestMapping("/viewreturnedbooks")
    public ModelAndView viewreturnedbooks() {
        List<BorrowRecord> list = borrowService.viewreturnedbooks();
        return new ModelAndView("viewreturns.jsp", "returnList", list);
    }
    
    @RequestMapping("/viewoverdue")
    public ModelAndView viewoverdue() {
        List<BorrowRecord> list = borrowService.viewOverdue();
        return new ModelAndView("viewoverdue.jsp", "overdueList", list);
    }
    
    
    
}


