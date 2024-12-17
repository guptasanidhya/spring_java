package springmvcsearch;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class SearchController {


    @RequestMapping("/user/{userId}/{userName}")
    public String getUserDetail(@PathVariable("userId") int userId, @PathVariable("userName") String userName){
        System.out.println(userId+" " + userName);
        return "home";
    }

    @RequestMapping("/home")
public String home(){
        System.out.println("Going to home view");
        return "home";
    }

    @RequestMapping("/search")
    public RedirectView search(@RequestParam("querybox") String query){
        RedirectView redirectView = new RedirectView();

        String url = "https://www.google.com/search?q="+query;
        System.out.println("hii I am inside search");
        redirectView.setUrl(url);
                return redirectView;
    }

    @ResponseStatus(value= HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler(value=NumberFormatException.class)
    public String exceptionHandlerNumberFormat(Model m){
        m.addAttribute("msg", "number format exception has occured");
        return "null_page";
    }


    @ExceptionHandler(value= Exception.class)
    public String exceptionHandlerGeneric(Model m ){
        m.addAttribute("msg","Exception has occured");
        return "null_page";
    }

}
