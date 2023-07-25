package CoreSpring.CoreSpring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Project started" );
        
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        Hello h = context.getBean(Hello.class);
       System.out.println(h.getMsg());
        
        
    }
}
