package anup.learnspring.sfgdi.services.impl;

import anup.learnspring.sfgdi.services.GreetingService;
import org.springframework.stereotype.Service;

@Service
public class SetterInjectedServiceImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello From Setter";
    }
}
