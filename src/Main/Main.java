package Main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import annotation_example_spring_java_file.Student;
import sp.resources.SpringConfigFile;


// Annotation example using java file
public class Main {
	public static void main(String[] args) {
		ApplicationContext context= new AnnotationConfigApplicationContext(SpringConfigFile.class);
		Student std=(Student)context.getBean("student");
		std.disp();
	}
}