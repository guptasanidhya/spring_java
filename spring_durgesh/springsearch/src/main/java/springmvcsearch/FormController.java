package springmvcsearch;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FormController {


@RequestMapping(path="/complex_form")
    public String showForm(){
    return "complex_form";
}

@RequestMapping(path="/handle",method=RequestMethod.POST)
    public String formHandler(@ModelAttribute("student") Student student){
    System.out.println(student);
    System.out.println(student.getAddress());
    return "success";
}
}
