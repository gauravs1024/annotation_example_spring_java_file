package sp.resources;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration										//you can choose any one from this way to
//@ComponentScan("annotation_example_spring_java_file")
//@ComponentScan({"annotation_example_spring_java_file"})
@ComponentScan(basePackages= {"annotation_example_spring_java_file"})
public class SpringConfigFile {

}
