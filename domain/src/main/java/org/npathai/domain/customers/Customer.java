package org.npathai.domain.customers;

import org.npathai.domain.common.Entity;

public class Customer implements Entity {
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
