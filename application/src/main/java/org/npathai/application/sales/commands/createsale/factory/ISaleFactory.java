package org.npathai.application.sales.commands.createsale.factory;

import org.npathai.domain.customers.Customer;
import org.npathai.domain.employees.Employee;
import org.npathai.domain.products.Product;
import org.npathai.domain.sales.Sale;

import java.time.ZonedDateTime;

public interface ISaleFactory {

    Sale create(ZonedDateTime dateTime, Customer customer, Employee employee, Product product, int quantity);
}
