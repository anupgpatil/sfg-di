package anup.learnspring.sfgdi.services.impl;

import anup.learnspring.sfgdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("IN")
@Qualifier("languageService")
@Service
public class HindiGreetingServiceImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Namaskar!!!";
    }
}
