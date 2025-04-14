package com.spring.boot.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ReportController {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @RequestMapping("/report")
    public ModelAndView showReport() {
        List<Map<String, Object>> reportData = jdbcTemplate.queryForList("SELECT * FROM reporting");
        return new ModelAndView("report.jsp","reportData", reportData);
       
    }
}
