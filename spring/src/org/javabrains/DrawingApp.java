package org.javabrains;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {
    public static void main(String[] args) {
//      Triangle triangle = new Triangle();
//      triangle.draw();

//        BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
//        Triangle triangle = (Triangle) factory.getBean("triangle");
//        triangle.draw();

        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Triangle triangle = (Triangle) context.getBean("triangle-alias");
        triangle.draw();

    }
}
