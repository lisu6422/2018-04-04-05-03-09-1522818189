package cn.thoughtworks.spring.domain;

import java.io.Serializable;

/**
 * @author likly
 * @version 1.0
 * @date 2018-04-29 10:16
 * @since 1.0
 */
public abstract class Domain<ID>implements Serializable {
    private ID id;

    public ID getId() {
        return id;
    }

    public void setId(ID id) {
        this.id = id;
    }

}
