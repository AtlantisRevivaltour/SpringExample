import com.atlantis.code.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by IntelliJ IDEA
 * MainApp class
 * Description: 请添加描述。
 * User: Atlantis
 * Date: 16/7/25
 * Time: 下午10:25
 */

public class MainApp {
    public static void main(String [] args){
        ApplicationContext context =new  ClassPathXmlApplicationContext("spring-config.xml");
        Student su = (Student) context.getBean("student");
        su.getName();
        su.getAge();
        su.printThrowException();
    }
}
