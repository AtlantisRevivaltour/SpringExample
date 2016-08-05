import com.atlantis.code.StudentJDBCTemplate;
import com.atlantis.code.StudentMarks;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

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
//        Student su = (Student) context.getBean("student");
//        su.getName();
//        su.getAge();
//        su.printThrowException();
//        StudentJDBCTemplate studentJDBCTemplate = (StudentJDBCTemplate) context.getBean("studentJDBC");
//        System.out.println("创建");
//        studentJDBCTemplate.create("Zara", 11);
//        studentJDBCTemplate.create("Nuha", 2);
//        studentJDBCTemplate.create("Ayan", 15);
//        System.out.println("------Listing Multiple Records--------" );
//        List<Student> students = studentJDBCTemplate.allStudent();
////        for (Iterator<Student> iterator = students.iterator(); iterator.hasNext(); ) {
////            Student record = iterator.next();
////            System.out.print("ID : " + record.getId() );
////            System.out.print(", Name : " + record.getName() );
////            System.out.println(", Age : " + record.getAge());
////        }
//
//        for (Student su :students){
//            System.out.print("ID : " + su.getId() );
//            System.out.print(", Name : " + su.getName() );
//            System.out.println(", Age : " + su.getAge());
//        }
//        System.out.println("----Updating Record with ID = 2 -----" );
//        studentJDBCTemplate.update(2, 20);
//        System.out.println("----Listing Record with ID = 2 -----" );
//        Student student = studentJDBCTemplate.getStudent(2);
//        System.out.print("ID : " + student.getId() );
//        System.out.print(", Name : " + student.getName() );
//        System.out.println(", Age : " + student.getAge());
        StudentJDBCTemplate studentJDBCTemplate = (StudentJDBCTemplate)context.getBean("studentJDBCTemplate");
        System.out.println("------Records creation--------" );
        studentJDBCTemplate.create("Zara", 11, 99, 2010);
        studentJDBCTemplate.create("Nuha", 20, 97, 2010);
        studentJDBCTemplate.create("Ayan", 25, 100, 2011);
        System.out.println("------Listing all the records--------" );
        List<StudentMarks> studentMarks = studentJDBCTemplate.listStudents();
        for (StudentMarks record : studentMarks) {
            System.out.print("ID : " + record.getId() );
            System.out.print(", Name : " + record.getName() );
            System.out.print(", Marks : " + record.getMarks());
            System.out.print(", Year : " + record.getYear());
            System.out.println(", Age : " + record.getAge());
        }



    }
}
