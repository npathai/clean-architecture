package org.npathai.application.customers.customerlist;

import java.util.List;

public interface IGetCustomersListQuery {
    List<CustomerModel> execute();
}
