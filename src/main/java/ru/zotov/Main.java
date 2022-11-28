package ru.zotov;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import ru.zotov.dao.model.Employee;
import ru.zotov.service.EmployeeService;

@Configuration
@ComponentScan
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Main.class);
        EmployeeService service = context.getBean(EmployeeService.class);
        Employee employee = service.findById(1L);
        System.out.println(employee.getName());


//        DataBaseProperties properties = new DataBaseProperties();
//        DataBaseConnector connector = new DataBaseConnector(properties);
//        Connection connection = connector.connect();
//        try {
//            System.out.println(connection.createStatement().executeQuery("select * from employee"));
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
    }
}
