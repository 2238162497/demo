package com.staffmanagement.controller;

import com.staffmanagement.pojo.Dept;
import com.staffmanagement.pojo.Result;
import com.staffmanagement.service.DeptService;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.annotations.Update;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@Slf4j
@RestController
public class DeptController {

    @Autowired
    private DeptService deptService;



    @GetMapping("/depts")
    public Result list(){
        System.out.println("查询全部部门数据");
       List<Dept> deptList = deptService.findAll();
        return Result.success(deptList);


        }

    @DeleteMapping("/depts")
    public Result delete( Integer id){
        System.out.println("删除部门"+ id);
        deptService.deleteById(id);
        return Result.success();

    }
     @PostMapping("/depts")
    public Result add(@RequestBody Dept dept){
        System.out.println("新增部门"+dept);
        deptService.add(dept);
        return Result.success();



     }
    @GetMapping("/depts/{id}")
    public Result getInfo(@PathVariable Integer id){
        System.out.println("查询部门"+id);
        Dept dept = deptService.getById(id);
        return Result.success(dept);

    }
    @PutMapping("/depts")
public Result update(@RequestBody Dept depts){
        System.out.println("修改数据"+depts);
        deptService.update(depts);
        return Result.success();
    }












}
