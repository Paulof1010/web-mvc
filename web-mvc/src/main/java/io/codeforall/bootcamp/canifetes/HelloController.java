package io.codeforall.bootcamp.canifetes;

import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloController {

    private final Canifete paulo =
            new Canifete(1, "Paulo", "paulo@codeforall.io", 12345);

    String index = "index";

    @GetMapping(value ="/hello")
    public String getCanifeteInfo(Model model) {

        model.addAttribute("id", paulo.getId());
        model.addAttribute("name", paulo.getName());
        model.addAttribute("email", paulo.getEmail());
        model.addAttribute("phone", paulo.getPhone());

        return index;
    }
}
