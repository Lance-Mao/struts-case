package dao.impl;

import dao.EmployeeDao;
import entity.Employee;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import utils.DBConn;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by admin on 2017/5/31.
 */
public class EmployeeDaoImpl implements EmployeeDao {
    @Override
    public List<Employee> getAll() {
        String sql = "select * from employee";
        try {
            return DBConn.getQueryRunner().query(sql, new BeanListHandler<Employee>(Employee.class));
        } catch (SQLException e) {
            throw new RuntimeException();
        }
    }

    @Override
    public Employee findById(int id) {
        String sql = "select * from employee where id = ?";
        try {
            return DBConn.getQueryRunner().query(sql, new BeanHandler<Employee>(Employee.class), id);
        } catch (SQLException e) {
            throw new RuntimeException();
        }
    }

    @Override
    public void save(Employee employee) {
        String sql = "insert into employee(empName,workDate) values(?,?)";
        try {
            DBConn.getQueryRunner().update(sql, employee.getEmpName(), employee.getWorkDate());
        } catch (SQLException e) {
            throw new RuntimeException();
        }
    }

    @Override
    public void update(Employee employee) {
        String sql = "update employee set empName = ?,workDate = ? where id = ?";
        try {
            DBConn.getQueryRunner().update(sql, employee.getEmpName(), employee.getWorkDate(), employee.getId());
        } catch (SQLException e) {
            throw new RuntimeException();
        }
    }
}
