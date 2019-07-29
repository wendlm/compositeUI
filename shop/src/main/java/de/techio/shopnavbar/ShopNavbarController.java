package de.techio.shopnavbar;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ShopNavbarController {

    @GetMapping("/")
    public String navbar(Model model) {
        return "component/navbar";
        // Alternative: return "component/navbar-bulma";
    }

}
