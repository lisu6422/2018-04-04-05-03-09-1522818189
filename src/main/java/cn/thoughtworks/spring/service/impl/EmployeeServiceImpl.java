package cn.thoughtworks.spring.service.impl;

import cn.thoughtworks.spring.dao.EmployeeDao;
import cn.thoughtworks.spring.domain.Employee;
import cn.thoughtworks.spring.service.EmployeeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author likly
 * @version 1.0
 * @date 2018-04-29 10:28
 * @since 1.0
 */
@Service
public class EmployeeServiceImpl implements EmployeeService {

    private final Logger logger = LoggerFactory.getLogger(EmployeeServiceImpl.class);

    @Resource
    private EmployeeDao employeeDao;

    @Override
    public List<Employee> selectAll() {
        return employeeDao.selectAll();
    }

    @Override
    public Employee add(String name, int age, String gender) {
        final Employee employee = new Employee(name, age, gender);
        employeeDao.insert(employee);
        logger.info("添加Employee:{}", employee.toString());
        return employee;
    }

}
