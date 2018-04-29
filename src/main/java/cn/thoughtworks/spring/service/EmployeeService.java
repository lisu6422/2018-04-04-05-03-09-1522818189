package cn.thoughtworks.spring.service;

import cn.thoughtworks.spring.domain.Employee;

import java.util.List;

/**
 * @author likly
 * @version 1.0
 * @date 2018-04-29 10:23
 * @since 1.0
 */
public interface EmployeeService {

    List<Employee> selectAll();

    Employee add(String name, int age, String gender);

}
