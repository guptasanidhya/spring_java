package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HomeController {

    @RequestMapping("/home")
    public String home(Model model){
        System.out.println("THis is home url");


        model.addAttribute("Name","Sanidhya");
        model.addAttribute("Id",102);

        List<String> friends = new ArrayList<>();
        friends.add("nitin");
        friends.add("deepak");
        model.addAttribute("f",friends);
        System.out.println(friends);
        return "index";
    }

    @RequestMapping("/about")
    public String about(){
        System.out.println("I am in about url");
        return "about";
    }
}
