package dao;

import entity.Employee;

import java.util.List;

/**
 * Created by admin on 2017/5/31.
 */
public interface EmployeeDao {

    /**
     * 查询全部员工
     */
    List<Employee> getAll();

    /**
     * 根据主键查询
     */
    Employee findById(int id);

    /**
     * 添加员工
     */
    void save(Employee employee);

    /**
     * 修改员工
     */
    void update(Employee employee);

}
