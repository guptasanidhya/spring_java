package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDateTime;
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

    @RequestMapping("/help")
    public ModelAndView help(){

        System.out.println("This is help controller");
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("help");
        modelAndView.addObject("name","Sandy");
        modelAndView.addObject("id",123);

        LocalDateTime now = LocalDateTime.now();
        modelAndView.addObject("time",now);

        List<Integer> ls = new ArrayList<>();
        ls.add(1);
        ls.add(2);
        ls.add(3);
        ls.add(4);
        modelAndView.addObject("marks",ls);


        return modelAndView;
    }
}
