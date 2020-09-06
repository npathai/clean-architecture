package org.npathai.domain.employees;

import org.npathai.domain.common.Entity;

public class Employee implements Entity {
    private long id;

    @Override
    public long getId() {
        return id;
    }

    @Override
    public void setId(long id) {
        this.id = id;
    }
}
