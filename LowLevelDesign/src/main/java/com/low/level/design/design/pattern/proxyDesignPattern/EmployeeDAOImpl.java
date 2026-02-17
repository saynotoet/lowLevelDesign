package com.low.level.design.design.pattern.proxyDesignPattern;

public class EmployeeDAOImpl implements EmployeeDAO{

    @Override
    public void createEmployee(Employee employee) {
        //create new Employee
    }

    @Override
    public Employee getEmployee(int empId) {
        return new Employee(); // custom logic for getting employee
    }
}
