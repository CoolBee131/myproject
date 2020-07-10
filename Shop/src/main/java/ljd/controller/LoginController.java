package ljd.controller;

import ljd.service.impl.LoginServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("/loginController")
public class LoginController {

    @Autowired
    private LoginServiceImpl loginServiceImpl;

    @RequestMapping("/login")
    public ModelAndView Login(String Username, String Password, HttpServletResponse response)throws Exception{
        if ( loginServiceImpl.Login(Username,Password) ){
            System.out.println("111");
            System.out.println(Username);
            System.out.println(Password);
            ModelAndView mv = new ModelAndView();
            mv.addObject("flag",true);
            mv.setViewName("success");
            return mv;
        }else {
            ModelAndView mv = new ModelAndView();
            mv.addObject("flag",false);
            mv.addObject("msg","密码或用户名错误");
            return mv;
        }
    }

}
