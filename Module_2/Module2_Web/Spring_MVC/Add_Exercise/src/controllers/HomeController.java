package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class HomeController {
    @PostMapping("/method0")
    public String method0(){
        return "method0";
    }
}
