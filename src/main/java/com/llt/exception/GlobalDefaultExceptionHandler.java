package com.llt.exception;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.TypeMismatchException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;

/**
 * 全局异常处理
 * @Author llt
 * @Date 2023-11-27-13:11
 **/
@ControllerAdvice
public class GlobalDefaultExceptionHandler {
    public static final String DEFAULT_ERROR_VIEW = "error";
    @ExceptionHandler({TypeMismatchException.class, NumberFormatException.class})
    public ModelAndView formatErrorHandler(HttpServletRequest req, Exception e) {
        ModelAndView mav = new ModelAndView();
        mav.addObject("error", "参数类型错误");
        mav.addObject("exception", e);
        //mav.addObject("url", RequestUtils.getCompleteRequestUrl(req));
        mav.addObject("timestamp", new Date());
        mav.setViewName(DEFAULT_ERROR_VIEW);

        return mav;
    }

}
