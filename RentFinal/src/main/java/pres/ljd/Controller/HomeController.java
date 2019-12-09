package pres.ljd.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
public class HomeController {

    @RequestMapping("/select")
    public String select(){
        return "select";
    }

    @RequestMapping("/roomMessage")
    public String roomMessage(){
        return "roomMessage";
    }

    @RequestMapping("/addRoom")
    public String addRoom(){
        return "addRoom";
    }

    @RequestMapping("/addRent")
    public String addRent(){
        return "addRent";
    }
}
