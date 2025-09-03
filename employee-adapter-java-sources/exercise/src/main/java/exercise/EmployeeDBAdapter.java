package main.java.exercise;

public class EmployeeDBAdapter implements Employee {
    EmployeeDB employeeDB;

    EmployeeDBAdapter(EmployeeDB employeeDB){
        this.employeeDB=employeeDB;
    }
    @Override
    public String getId() {
        return Integer.toString(employeeDB.getId());
    }

    @Override
    public String getFirstName() {
        return employeeDB.getFirstName();
    }

    @Override
    public String getLastName() {
        return employeeDB.getSurname();
    }

    @Override
    public String getEmail() {
        return employeeDB.getEmailAddress();
    }
    
}
