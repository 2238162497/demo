package com.staffmanagement.pojo;

import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
public class Emp {
    private Integer id;
    private  String name;
    private String password;
    private Integer gender;
    private String username;
    private  String phone;
    private Integer job;
    private Integer salary;
    private String image;
    private LocalDate entryDate;
    private Integer DeptId;
    private LocalDateTime createTime;
    private LocalDateTime updateTime;



}
