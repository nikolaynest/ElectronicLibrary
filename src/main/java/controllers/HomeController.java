package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by nikolay on 01.08.14.
 */
@Controller
public class HomeController {

    @RequestMapping("/greeting")
    public String greeting(@RequestParam(value="name", required=false, defaultValue="Nikolay") String name, Model model) {
        model.addAttribute("name", name);
        return "greeting";
    }
}
