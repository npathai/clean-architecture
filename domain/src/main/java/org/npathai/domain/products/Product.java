package org.npathai.domain.products;

import org.npathai.domain.common.Entity;

import java.math.BigDecimal;

public class Product implements Entity {
    private long id;
    private String name;
    private BigDecimal price;

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

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
