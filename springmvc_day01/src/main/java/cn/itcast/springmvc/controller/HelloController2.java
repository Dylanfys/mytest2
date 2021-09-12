package cn.itcast.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping({"hello", "haha"})
public class HelloController2 {
    @RequestMapping("show1")
    public ModelAndView m1() {
        return new ModelAndView("hello").addObject("msg", "注解开发");

    }

    @RequestMapping("*a/show3")
    public ModelAndView m2() {
        ModelAndView mv = new ModelAndView("hello");
        mv.addObject("msg", "a*风格");
        return mv;
    }

    @RequestMapping("**/show3")
    public ModelAndView m3() {
        ModelAndView mv = new ModelAndView("hello");
        mv.addObject("msg", "**风格");
        return mv;
    }

    @RequestMapping("/show4/{userId}/{userName}")
    public ModelAndView m4(@PathVariable int userId, @PathVariable String userName) {
        ModelAndView mv = new ModelAndView("hello");
        mv.addObject("msg", "占位符" + userName + "  " + userId
        );
        return mv;
    }

    @RequestMapping("show5")
    public String m5(Model model, HttpServletRequest request, HttpSession httpSession) {
        System.out.println(httpSession.getId());
        model.addAttribute("msg", "springmvc内置对象5");

        return "hello1";
    }

    @RequestMapping("show6")
    @ResponseBody
    public String m6(Model model, HttpServletRequest request, HttpSession httpSession, @CookieValue(value = "JSESSIONID", required = false) String cookieId) {
        System.out.println("cookieId = " + cookieId);
        System.out.println(httpSession.getId());
        model.addAttribute("msg", "springmvc内置对象6");

        return "hello1";
    }
}
