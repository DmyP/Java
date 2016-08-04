package lessons.services;

import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanWithDependency {
    public BeanWithDependency() {}
    public BeanWithDependency(GreetingService greetingService) { /* что-то делаем*/ }
    public String printText() { return "Some text";}
}