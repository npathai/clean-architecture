package org.npathai.domain.products;

import org.npathai.domain.common.Entity;

public class Product implements Entity {
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
