package org.npathai.domain.customers;

import org.npathai.domain.common.Entity;

public class Customer implements Entity {
    private long id;
    private String name;

    @Override
    public long getId() {
        return id;
    }

    @Override
    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
