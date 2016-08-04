package lessons.services;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("greetingService")
@Scope("prototype")
public class GreetingServiceImpl implements GreetingService {

    private ApplicationContext context;

    public void setContext(ApplicationContext context) {
        this.context = context;
    }

    @Override
    public String sayGreeting() {
        return "Greeting, user!";
    }
}