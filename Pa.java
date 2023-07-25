package CoreSpring.CoreSpring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Pa 
{
	public static void main(String args[])
	{
	ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
	Student stud = (Student) context.getBean("stud");
    System.out.println(stud);
}
}