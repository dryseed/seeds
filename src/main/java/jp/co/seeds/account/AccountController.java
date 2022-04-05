package jp.co.seeds.account;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AccountController {

    Logger logger = LoggerFactory.getLogger(getClass());



    @GetMapping({"/login","/"})
    String login(){
        return "login";
    }


    @GetMapping(value = "/doLogin")
    public String doLogin(String username , String password, Model model){

        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken token = new UsernamePasswordToken(username, password);

        try{
            subject.login(token);

            if(subject.hasRole("R001")){
                logger.info("==========管理者============");
            }

            return "index";
        }catch (UnknownAccountException e){
            model.addAttribute("msg","is not exist!");
            return "login";
        }catch(IncorrectCredentialsException e){
            model.addAttribute("msg","password is not correct !");
            return "login";
        }

    }

}
