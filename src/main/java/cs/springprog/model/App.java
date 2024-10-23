package cs.springprog.model;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Spring xml configuration program
 *
 */
public class App 
{
    public static void main( String[] args ){
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

    }
}
