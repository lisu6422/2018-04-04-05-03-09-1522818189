package cn.thoughtworks.spring.dao.impl;

import cn.thoughtworks.spring.dao.EmployeeDao;
import cn.thoughtworks.spring.domain.Employee;
import org.springframework.stereotype.Component;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author likly
 * @version 1.0
 * @date 2018-04-29 10:30
 * @since 1.0
 */
@Component
public class EmployeeDaoImpl implements EmployeeDao {

    private static final AtomicInteger idAtomicInterger = new AtomicInteger(0);

    private static final Map<Integer, Employee> map = new LinkedHashMap<>();


    @Override
    public int insert(Employee... domains) {
        return insert(Arrays.asList(domains));
    }

    @Override
    public int insert(List<Employee> domains) {

        for (Employee domain : domains) {
            domain.setId(idAtomicInterger.incrementAndGet());
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
