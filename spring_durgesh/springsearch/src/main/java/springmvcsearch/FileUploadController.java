package springmvcsearch;

import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

@Controller
public class FileUploadController {

    @RequestMapping("/fileform")
    public String showUploadForm(){
        System.out.println("I am in file handler");
        return "fileform";
    }

    @RequestMapping(value ="/uploadimage", method = RequestMethod.POST)
    public String fileupload(@RequestParam("profile") MultipartFile profile, HttpSession httpSession, Model model) throws IOException {
        if (profile.isEmpty()) {
            System.out.println("No file uploaded.");
            return "error";
        }
        // Print file details
        System.out.println("File Name: " + profile.getOriginalFilename());
        System.out.println("File Size: " + profile.getSize());

        byte[] data= profile.getBytes();
        String path = httpSession.getServletContext().getRealPath("/")
                +"WEB-INF"+ File.separator+"resources"+File.separator+"image"+
                File.separator+profile.getOriginalFilename();
        System.out.println(path);

        try {
            FileOutputStream fos = new FileOutputStream(path);
            fos.write(data);
            fos.close();
            System.out.println("file uploaded");

            model.addAttribute("msg","uploaded");
            model.addAttribute("filename",profile.getOriginalFilename());
        }catch(Exception e){
            System.out.println(e.getMessage());
            System.out.println("upload failed");
            model.addAttribute("msg","Uploading error");
        }
        return "filesuccess";
    }
}
