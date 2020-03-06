/*******************************************************************************
 * Package: com.hngtrust.microcredit.dto
 * Type:    RequestDTO
 * Date:    2019/10/25 17:50
 *
 * Copyright (c) 2019 HUANENG GUICHENG TRUST CORP.,LTD All Rights Reserved.
 *
 * You may not use this file except in compliance with the License.
 *******************************************************************************/
package com.ssyang.demo.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;

/**
 * 接口请求DTO
 * @author Yangshuaishuai
 * @param <T> 请求实际信息
 */
@ApiModel(description = "接口请求")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RequestDTO<T> {
    
    /**
     * 请求编号
     */
    @Length(max = 10)
    @ApiModelProperty(value = "请求编号", dataType = "String", position = 1)
    private String reqNo;
    
    /**
     * 请求流水号
     */
    @NotBlank
    @Length(max = 50)
    @ApiModelProperty(value = "请求流水号", dataType = "String", position = 2, required = true)
    private String flowNo;
    
    /**
     * 接口编号，如2011表示贷款申请
     */
    @NotBlank
    @Length(max = 10)
    @ApiModelProperty(value = "接口编号", dataType = "String", position = 3, required = true)
    private String txCode;
    
    /**
     * 合作机构编号
     */
    @NotBlank(message = "合作机构编号不能为空")
    @Length(max = 10)
    @ApiModelProperty(value = "合作机构编号", dataType = "String", position = 4, required = true)
    private String orgNo;
    
    /**
     * 日期
     */
    @ApiModelProperty(value = "日期（TODO 有什么用）", dataType = "String", position = 5)
    private String reqDate;
    
    /**
     * 时间
     */
    @ApiModelProperty(value = "时间（TODO 有什么用）", dataType = "String", position = 6)
    private String reqTime;
    
    /**
     * token
     */
    @Length(max = 32)
    @ApiModelProperty(value = "token（TODO 有什么用）", dataType = "String", position = 7)
    private String token;
    
    /**
     * 请求实际信息
     */
    @Valid
    @ApiModelProperty(value = "请求实际信息", position = 8)
    private T content;
}
