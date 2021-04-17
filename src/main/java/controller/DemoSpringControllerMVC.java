package controller;

import model.Language;
import model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@Controller
//@RestController
public class DemoSpringControllerMVC {
    @Autowired
    Language language;
    @RequestMapping("/home")
    public String HelloCodeGym(){
        return "/demo";
    }
    @RequestMapping("/modelandview")
    public ModelAndView passView(){
        User user = new User();
        user.setName("Tuyen");
        user.setAge(18);
        System.out.println("==========="+language.getName());
//        Language language1 = new Language();
//        language1.setName("ANGULAR");
//        user.setLanguage(language1);
//        System.out.println("user.get"+user.getLanguage());
        user.setLanguage(language);
    ModelAndView modelAndView = new ModelAndView("/demo");
    modelAndView.addObject("user",user);
    modelAndView.addObject("language",language.getName());
    return modelAndView;
    }

}

