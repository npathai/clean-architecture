package org.npathai.presentation.sales;

import org.npathai.application.sales.commands.createsale.CreateSaleModel;
import org.npathai.application.sales.commands.createsale.ICreateSaleCommand;
import org.npathai.application.sales.queries.saledetail.IGetSaleDetailQuery;
import org.npathai.application.sales.queries.saledetail.SaleDetailModel;
import org.npathai.application.sales.queries.saleslist.IGetSalesListQuery;
import org.npathai.application.sales.queries.saleslist.SalesListItemModel;

import java.util.List;

public class SalesController {
    private IGetSalesListQuery salesListQuery;
    private IGetSaleDetailQuery saleDetailQuery;
    private ICreateSaleCommand createSaleCommand;

    public SalesController(IGetSalesListQuery salesListQuery,
                           IGetSaleDetailQuery saleDetailQuery,
                           ICreateSaleCommand createSaleCommand) {
        this.salesListQuery = salesListQuery;
        this.saleDetailQuery = saleDetailQuery;
        this.createSaleCommand = createSaleCommand;
    }

    public List<SalesListItemModel> getSales() {
        return salesListQuery.execute();
    }

    public SaleDetailModel detail(long id) {
        return saleDetailQuery.execute(id);
    }

    public void create(CreateSaleModel createSaleModel) {
        createSaleCommand.execute(createSaleModel);
    }
}
