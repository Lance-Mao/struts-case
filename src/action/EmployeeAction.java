package action;

/**
 * Created by admin on 2017/5/31.
 */

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import entity.Employee;
import service.EmployeeService;
import service.impl.EmployeeServiceImpl;

import java.util.List;

/**
 * 员工管理action
 */
public class EmployeeAction extends ActionSupport implements ModelDriven<Employee> {

    //封装数据
    private Employee employee = new Employee();
    private int id;

    public void setId(int id) {
        this.id = id;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    //重写模型驱动方法
    @Override
    public Employee getModel() {
        return employee;
    }


    //调用service
    private EmployeeService employeeService = new EmployeeServiceImpl();

    /**
     * 添加员工
     */
    public String save(){
        //直接调用service保存
        employeeService.save(employee);
        //添加成功，去到列表页面
        return list();
    }

    /**
     * 列表显示
     */
    public String list(){
        //查询全部
        List<Employee> allEmp = employeeService.getAll();
        //保存到request域中
        ActionContext.getContext().getContextMap().put("allEmp", allEmp);
        return "list";
    }

    /**
     * 进入修改页面
     */
    public String viewUpdate() {
        //获取当前修改的记录的主键值
        int id = employee.getId();
        return SUCCESS;
    }

}
