package anup.learnspring.sfgdi.controller;

import anup.learnspring.sfgdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class LanguageController {

    private final GreetingService greetingService;

    public LanguageController(@Qualifier("languageService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHelo(){
        return greetingService.sayGreeting();
    }
}
