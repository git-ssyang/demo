/*******************************************************************************
 * Package: com.hngtrust.microcredit.dto
 * Type:    ResponseDTO
 * Date:    2019/10/25 17:54
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

/**
 * 接口响应DTO
 *
 * @author Yangshuaishuai
 * @param <T> 响应实际信息
 */
@ApiModel(description = "接口响应")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ResponseDTO<T> {
    
    /**
     * 响应码。默认：0000，表示成功
     */
    @ApiModelProperty(value = "响应码")
    private String code = "0000";
    
    /**
     * 响应信息
     */
    @ApiModelProperty(value = "响应描述")
    private String message = "操作成功";
    
    /**
     * 响应实际信息
     */
    @ApiModelProperty(value = "实际响应信息")
    private T content;
    
    public ResponseDTO(T content) {
        this.content = content;
    }
}
