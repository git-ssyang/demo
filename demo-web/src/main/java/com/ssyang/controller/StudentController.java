/*******************************************************************************
 * Package: com.ssyang
 * Type:    StudentController
 * Author:  Yangshuaishuai
 * Date:    2020/3/6 14:46
 *
 * Copyright (c) 2020 HUANENG GUICHENG TRUST CORP.,LTD All Rights Reserved.
 *******************************************************************************/
package com.ssyang.controller;

import com.ssyang.demo.entity.RequestDTO;
import com.ssyang.demo.entity.ResponseDTO;
import com.ssyang.demo.entity.Student;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.security.PermitAll;
import javax.validation.Valid;

/**
 * 学生信息接口
 *
 * @author Yangshuaishuai
 *
 */
@Api(tags = "学生信息",value="学生信息接口")
@RestController
@RequestMapping("/student")
public class StudentController {
    
    @PermitAll
    @ApiOperation(value = "查询学生信息", notes = "获取相关学生的信息")
    @PostMapping("/queryStudentInfo")
    public ResponseDTO<Student> queryStudentInfo(
            @ApiParam(value = "学生信息查询") @Valid @RequestBody RequestDTO<Student> requestDTO) {
        Student student = new Student();
        System.out.println("进入接口，查询学生信息");
        if(null == requestDTO.getContent()){
            student.setName("熊猫睡觉");
            student.setAddress("北京某人的床上");
            return new ResponseDTO<Student>(student);
        }
        student.setName("小帅");
        student.setAddress("木樨园");
        return new ResponseDTO<Student>(student);
    }
    
    
}
