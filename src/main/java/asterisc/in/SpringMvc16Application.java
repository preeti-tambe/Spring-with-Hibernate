package asterisc.in;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import asterisc.in.model.Student;
import asterisc.in.model.StudentDao;

@SpringBootApplication
public class SpringMvc16Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringMvc16Application.class, args);
		
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		StudentDao dao = (StudentDao) context.getBean("d");

		Student s = new Student();
		s.setId(101);
		s.setName("ram");
		

		dao.save(s);
		
		System.out.println("Data inserted !");
	
		
		
		
	}

}
