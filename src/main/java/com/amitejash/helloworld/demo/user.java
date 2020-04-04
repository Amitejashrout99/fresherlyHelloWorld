package com.amitejash.helloworld.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class user
{
    @RequestMapping("/")
    public String home()
    {
        System.out.println("Home Page Requested");
        return "index";
    }
    @RequestMapping("verifyUser")
    public ModelAndView verifyUser(@RequestParam("username") String user_name, @RequestParam("password") String pswd)
    {
        //int a= Integer.parseInt(request.getParameter("num1"));
        //int b= Integer.parseInt(request.getParameter("num2"));

        String un= "fresherpro";
        String pwd="fresherpro";

        ModelAndView mv= new ModelAndView();

        System.out.print(user_name+" "+pswd);

        if(user_name.equals(un) && pwd.equals(pswd))
        {

            mv.setViewName("successfull");
            String message="Hello"+" "+un;
            mv.addObject("successfull",message);
        }
        else
        {
            mv.setViewName("result");

            String message="Wrong Credentials";

            mv.addObject("result",message);
        }

        return mv;
    }
}
