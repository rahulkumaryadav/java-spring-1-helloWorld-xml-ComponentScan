package rk.com.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import rk.com.beans.Department;
import rk.com.beans.Employee;

public class ClientDemo {

    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring.xml");
        applicationContext.getBean(Employee.class);
       Employee employee=applicationContext.getBean(Employee.class);
        Department department=applicationContext.getBean(Department.class);
        System.out.println(employee);

    }

}
