package com.low.level.design.design.pattern.proxyDesignPattern;

public class EmployeeDAOProxy implements EmployeeDAO{
    EmployeeDAO employeeDAO;

    public EmployeeDAOProxy(){
        employeeDAO = new EmployeeDAOImpl();
    }

    @Override
    public void createEmployee(Employee employee) throws IllegalAccessException {
        if("ADMIN".equals(employee.role))
        {
            employeeDAO.createEmployee(employee);
        }else{
            throw new IllegalAccessException("Can't create : "+ employee);
        }
    }

    @Override
    public Employee getEmployee(int empId) {
        return employeeDAO.getEmployee(empId);
    }
}
