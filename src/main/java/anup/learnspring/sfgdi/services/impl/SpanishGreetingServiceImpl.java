package anup.learnspring.sfgdi.services.impl;

import anup.learnspring.sfgdi.services.GreetingService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("ES")
@Service("languageService")
public class SpanishGreetingServiceImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hola!!!";
    }
}
