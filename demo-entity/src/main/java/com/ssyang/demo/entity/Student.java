/*******************************************************************************
 * Package: com.ssyang.demo.entity
 * Type:    Student
 * Author:  Yangshuaishuai
 * Date:    2020/3/6 14:40
 *
 * Copyright (c) 2020 HUANENG GUICHENG TRUST CORP.,LTD All Rights Reserved.
 *******************************************************************************/
package com.ssyang.demo.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Yangshuaishuai
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(description = "学生实体信息")
public class Student {
    
    @ApiModelProperty(value = "学生姓名", dataType = "String", position = 1,notes = "姓名",example = "张三")
    private String name;
    
    @ApiModelProperty(value = "学生住址", dataType = "String", position = 2,notes = "地址",example = "北京")
    private String address;
}
