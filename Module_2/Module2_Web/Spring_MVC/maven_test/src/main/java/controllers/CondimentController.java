package controllers;

import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CondimentController {
 @GetMapping("/condiment")
    public String selectCondiment(){
     return "condiment";
}
@PostMapping("/showOptions")
    public String showOptions(@RequestParam(name="condiment") String[] condiments, Model model){
     model.addAttribute("condiments", condiments);
    return "showInfo";

}

}
