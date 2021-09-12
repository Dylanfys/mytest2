package cn.itcast.springmvc.controller;


import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloController implements Controller {
    private static int count = 0;

    @Override
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        System.out.println(httpServletRequest.getSession().getId());
        count++;
        System.out.println("请求第 " + count + "  进来");
        ModelAndView mv = new ModelAndView();
        mv.addObject("address", "上海");
        mv.setViewName("hello");
        return mv;
    }
}
