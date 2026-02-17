package com.low.level.design.design.pattern.proxyDesignPattern;

public interface EmployeeDAO {
    void createEmployee(Employee employee ) throws IllegalAccessException;
    Employee getEmployee(int empId);
}
