package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

@Controller
@RequestMapping("/calculator")
public class CalculatorController {
    @RequestMapping()
    public String Calculator(@RequestParam(name="result", required = false) Integer result) {
        return "calculator";
    }

    @GetMapping(params = "add")
    public RedirectView add(@RequestParam Integer num1, @RequestParam Integer num2, Model model){
        Integer result = num1+ num2;
        model.addAttribute("result",result);
        //return new ModelAndView("calculator", "addition", model);
        return new RedirectView("/views/test");
    }
    @GetMapping(params = "sub")
    public ModelAndView subtract(@RequestParam Integer num1, @RequestParam Integer num2, Model model){
        Integer result = num1- num2;
        model.addAttribute("result",result);
        return new ModelAndView("calculator", "subtraction", model);
    }
    @GetMapping(params = "mul")
    public ModelAndView multiple(@RequestParam Integer num1, @RequestParam Integer num2, Model model){
        Integer result = num1* num2;
        model.addAttribute("result",result);
        return new ModelAndView("calculator", "multiplication", model);
    }
    @GetMapping(params = "div")
    public ModelAndView divide(@RequestParam Integer num1, @RequestParam Integer num2, Model model){
        Integer result = num1/ num2;
        model.addAttribute("result",result);
        return new ModelAndView("calculator", "division", model);
    }



}

