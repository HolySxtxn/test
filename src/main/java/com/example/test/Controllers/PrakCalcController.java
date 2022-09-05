package com.example.test.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PrakCalcController {

    @GetMapping("/")
    public String greeting(Model model){
        model.addAttribute("title" , "Main Page");
        return  "Main";
    }

    @GetMapping("/post/calculator")
    public String PostView(){
        return "POST";
    }

    @PostMapping("/post/decision")
    public String PostController(@RequestParam int a, @RequestParam int b,
                                 @RequestParam String action, Model model) {
        model.addAttribute("a", a);
        model.addAttribute("b", b);
        model.addAttribute("action", action);
        double result;

        switch (action) {

            case "сумма":
                result = a + b;
                break;
            case "вычитание":
                result = a - b;
                break;
            case "умножение":
                result = a * b;
                break;
            case "делевние":
                result = a / b;
                break;
            default:
                result = 0;
                break;
        }

        model.addAttribute("result", result);
        return "Result";
    }

    @GetMapping("/get/calculator")
    public String GetView(){
        return "GET";
    }

    @GetMapping("/get/decision")
    public String GetController (@RequestParam int a, @RequestParam int b,
                                 @RequestParam String action, Model model) {
        model.addAttribute("a", a);
        model.addAttribute("b", b);
        model.addAttribute("action1", action);

        double result;

        switch (action) {

            case "сумма":
                result = a + b;
                break;
            case "вычитание":
                result = a - b;
                break;
            case "умножение":
                result = a * b;
                break;
            case "делевние":
                result = a / b;
                break;
            default:
                result = 0;
                break;
        }
        model.addAttribute("result", result);

        return "Result";
    }
}
