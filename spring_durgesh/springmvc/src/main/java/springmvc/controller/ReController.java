package springmvc.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class ReController {


    @RequestMapping("/one")
    public String one(){
        System.out.println("This is handler one");

        return "redirect:/enjoy";
    }


    @RequestMapping("enjoy")
    public RedirectView two(){
        System.out.println("Hi I am being called by someone");
        RedirectView re = new RedirectView();
        re.setUrl("https://www.google.com/");
        return re;
    }

}
