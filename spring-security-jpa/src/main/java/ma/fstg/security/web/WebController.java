package ma.fstg.security.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {

  @GetMapping("/login")
  public String login() {
    return "login"; // Affiche login.html
  }

  @GetMapping("/home")
  public String home() {
    return "home"; // Vous devez créer un fichier home.html dans templates
  }

  @GetMapping("/")
  public String index() {
    return "redirect:/home";
  }
}