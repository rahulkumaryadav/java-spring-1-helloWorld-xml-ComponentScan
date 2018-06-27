package rk.com.beans;

import org.springframework.stereotype.Component;

@Component
public class Employee {
    private String employeeName;

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }
    private void printEmp(){
        System.out.println("employeeName "+employeeName);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeName='" + employeeName + '\'' +
                '}';
    }
}
