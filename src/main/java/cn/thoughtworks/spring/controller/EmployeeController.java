package cn.thoughtworks.spring.controller;

import cn.thoughtworks.spring.domain.Employee;
import cn.thoughtworks.spring.service.EmployeeService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author likly
 * @version 1.0
 * @date 2018-04-29 10:24
 * @since 1.0
 */
@RestController
public class EmployeeController {

    @Resource
    private EmployeeService employeeService;

    @RequestMapping("/employees")
    public List<Employee> selectAll() {
        return employeeService.selectAll();
    }

    @RequestMapping("/employee/add")
    public Employee add(@RequestParam("name") String name,
                        @RequestParam("age") int age,
                        @RequestParam("gender") String gender) {
        return employeeService.add(name, age, gender);
    }
}
