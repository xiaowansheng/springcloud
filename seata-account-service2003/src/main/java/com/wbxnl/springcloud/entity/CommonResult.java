package com.wbxnl.springcloud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @auther zzyy
 * @create 2020-02-26 15:16
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class CommonResult<T>
{
    private Integer code;
    private String  message;
    private T       data;

    public CommonResult(Integer code, String message)
    {
        this(code,message,null);
    }
}
