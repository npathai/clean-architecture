package org.npathai.application.customers.customerlist;

import org.npathai.application.interfaces.persistence.ICustomerRepository;

import java.util.List;

public class GetCustomersListQuery implements IGetCustomersListQuery {

    private ICustomerRepository customerRepository;

    public GetCustomersListQuery(ICustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public List<CustomerModel> execute() {
        throw new UnsupportedOperationException();
    }
}
