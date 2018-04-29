package cn.thoughtworks.spring.service.impl;

import cn.thoughtworks.spring.dao.EmployeeDao;
import cn.thoughtworks.spring.domain.Employee;
import cn.thoughtworks.spring.service.EmployeeService;
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

    @Resource
    private EmployeeDao employeeDao;


    @Override
    public List<Employee> selectAll() {
        return employeeDao.selectAll();
    }
}
