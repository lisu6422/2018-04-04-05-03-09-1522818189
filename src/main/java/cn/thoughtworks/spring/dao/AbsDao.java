package cn.thoughtworks.spring.dao;

import cn.thoughtworks.spring.domain.Domain;

import java.util.List;

/**
 * @author likly
 * @version 1.0
 * @date 2018-04-29 10:16
 * @since 1.0
 */
public interface AbsDao<ID, T extends Domain<ID>> {

    int insert(T... domains);

    int insert(List<T> domains);

    List<T> selectAll();

    T findById(ID id);

}
