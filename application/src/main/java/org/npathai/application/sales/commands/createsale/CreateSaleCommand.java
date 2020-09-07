package org.npathai.application.sales.commands.createsale;

import org.npathai.application.interfaces.infrastructure.IInventoryService;
import org.npathai.application.interfaces.persistence.*;
import org.npathai.application.sales.commands.createsale.factory.ISaleFactory;
import org.npathai.common.dates.IDateService;
import org.npathai.domain.customers.Customer;
import org.npathai.domain.employees.Employee;
import org.npathai.domain.products.Product;
import org.npathai.domain.sales.Sale;

import java.time.ZonedDateTime;

public class CreateSaleCommand implements ICreateSaleCommand {

    private final IDateService dateService;
    private final ISaleRepository saleRepository;
    private final IProductRepository productRepository;
    private final IEmployeeRepository employeeRepository;
    private final ICustomerRepository customerRepository;
    private final ISaleFactory factory;
    private final IInventoryService inventory;
    private IUnitOfWork unitOfWork;

    public CreateSaleCommand(IDateService dateService,
                             ISaleRepository saleRepository,
                             IProductRepository productRepository,
                             IEmployeeRepository employeeRepository,
                             ICustomerRepository customerRepository,
                             ISaleFactory factory,
                             IInventoryService inventory,
                             IUnitOfWork unitOfWork) {
        this.dateService = dateService;
        this.saleRepository = saleRepository;
        this.productRepository = productRepository;
        this.employeeRepository = employeeRepository;
        this.customerRepository = customerRepository;
        this.factory = factory;
        this.inventory = inventory;
        this.unitOfWork = unitOfWork;
    }

    @Override
    public void execute(CreateSaleModel createSaleModel) {
        ZonedDateTime dateTime = dateService.getTime();

        Customer customer = customerRepository.getById(createSaleModel.getCustomerId());
        Employee employee = employeeRepository.getById(createSaleModel.getEmployeeId());
        Product product = productRepository.getById(createSaleModel.getProductId());
        int quantity = createSaleModel.getQuantity();

        Sale sale = factory.create(dateTime, customer, employee, product, quantity);

        saleRepository.save(sale);
        unitOfWork.save();

        inventory.notifySaleOccurred(product.getId(), quantity);
    }
}
