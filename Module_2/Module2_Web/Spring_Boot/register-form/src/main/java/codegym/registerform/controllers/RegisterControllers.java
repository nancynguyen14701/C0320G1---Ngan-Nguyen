package codegym.registerform.controllers;

import codegym.registerform.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RegisterControllers {
    @GetMapping("/")
    public ModelAndView registerForm(){
    return new ModelAndView("index", "user", new User());
    }
    @PostMapping("/register")
    public ModelAndView register(@Validated @ModelAttribute User user, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            return new ModelAndView("index");
        }
        return new ModelAndView("result");
    }
}
