package org.npathai.application.products.productlist;

import org.npathai.application.interfaces.persistence.IProductRepository;

import java.util.List;

public class GetProductsListQuery implements IGetProductsListQuery {

    private IProductRepository productRepository;

    public GetProductsListQuery(IProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public List<ProductModel> execute() {
        return null;
    }
}
