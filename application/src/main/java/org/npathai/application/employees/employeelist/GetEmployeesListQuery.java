package org.npathai.application.employees.employeelist;

import org.npathai.application.interfaces.persistence.IEmployeeRepository;

import java.util.List;

public class GetEmployeesListQuery implements IGetEmployeesListQuery {

    private IEmployeeRepository employeeRepository;

    public GetEmployeesListQuery(IEmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public List<EmployeeModel> execute() {
        return null;
    }
}
