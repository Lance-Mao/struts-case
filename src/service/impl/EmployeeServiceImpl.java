package service.impl;

import dao.EmployeeDao;
import dao.impl.EmployeeDaoImpl;
import entity.Employee;
import service.EmployeeService;

import java.util.List;

/**
 * Created by admin on 2017/5/31.
 */
public class EmployeeServiceImpl implements EmployeeService {
    private EmployeeDao employeeDao = new EmployeeDaoImpl();

    @Override
    public List<Employee> getAll() {
        return employeeDao.getAll();
    }

    @Override
    public Employee findById(int id) {
        return employeeDao.findById(id);
    }

    @Override
    public void save(Employee employee) {
        employeeDao.save(employee);
    }

    @Override
    public void update(Employee employee) {
        employeeDao.update(employee);
    }
}
