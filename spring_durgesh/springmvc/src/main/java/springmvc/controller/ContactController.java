package springmvc.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import springmvc.model.User;
import springmvc.service.UserService;

@Controller
public class ContactController {

    @Autowired
    private UserService userService;

    @ModelAttribute
    public void commonData(Model m){
        m.addAttribute("heading","Welcome Welcome");
        m.addAttribute("desc","Welcome Everyone");
    }

    @RequestMapping("/contact")
    public String showForm(Model m){
        return "contact";
    }

    @RequestMapping(path="/processForm" , method= RequestMethod.POST)
    public String handleForm(@ModelAttribute User user, Model model){
        System.out.println(user);
        if(user.getUserName().isEmpty()){

            return "redirect:/contact";
        }
        int createdUserId = this.userService.createUser(user);

        model.addAttribute("msg", "User Created with Id:"+createdUserId);
        return "success";
    }
}
