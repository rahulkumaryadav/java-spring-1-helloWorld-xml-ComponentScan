package rk.com.beans;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
public class Department {

    private String departmentName;

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }
}
