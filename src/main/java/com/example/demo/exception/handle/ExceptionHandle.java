package com.example.demo.exception.handle;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.enums.ResultError;
import com.example.demo.exception.GlobalException;
import com.example.demo.model.Result;
import com.example.demo.utils.ResultUtil;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : Jason
 * @Date : 2017/5/19
 * @Time : 13:57
 * @Description : 统一异常处理类
 */
@ControllerAdvice
public class ExceptionHandle {

    private final static Logger logger = LoggerFactory.getLogger(ExceptionHandle.class);

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public Result handle(Exception e){
        if(e instanceof GlobalException){
        	GlobalException globalException = (GlobalException)e;
            return ResultUtil.fail(globalException.getCode(),e.getMessage());
        }else{
            logger.error("【系统异常】{}",e);
            return ResultUtil.fail(ResultError.UNKNOW_ERROR);
        }
    }

}
