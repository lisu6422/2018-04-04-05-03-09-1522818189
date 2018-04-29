package cn.thoughtworks.spring.dao.impl;

import cn.thoughtworks.spring.dao.EmployeeDao;
import cn.thoughtworks.spring.domain.Employee;

import java.util.*;

/**
 * @author likly
 * @version 1.0
 * @date 2018-04-29 10:30
 * @since 1.0
 */
public class EmployeeDaoImpl implements EmployeeDao {

    private static final Map<Integer, Employee> map = new LinkedHashMap<>();


    @Override
    public int insert(Employee... domains) {
        return insert(Arrays.asList(domains));
    }

    @Override
    public int insert(List<Employee> domains) {

        for (Employee domain : domains) {
            map.put(domain.getId(), domain);
        }

        return domains.size();
    }

    @Override
    public List<Employee> selectAll() {

        List<Employee> list = new ArrayList<>();

        map.forEach((id, employee) -> {
            list.add(employee);
        });


        return list;
    }

    @Override
    public Employee findById(Integer id) {
        return map.get(id);
    }
}
