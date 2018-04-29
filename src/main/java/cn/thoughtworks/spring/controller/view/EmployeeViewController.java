package cn.thoughtworks.spring.controller.view;

import cn.thoughtworks.spring.domain.Employee;
import cn.thoughtworks.spring.service.EmployeeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.List;

/**
 * @author likly
 * @version 1.0
 * @date 2018-04-29 16:36
 * @since 1.0
 */
@Controller
public class EmployeeViewController {


    @Resource
    private EmployeeService employeeService;


    @RequestMapping("/get")
    public String get(Model model) {


        model.addAttribute("employees", employeeService.selectAll());


        return "employee/list";
    }

}
