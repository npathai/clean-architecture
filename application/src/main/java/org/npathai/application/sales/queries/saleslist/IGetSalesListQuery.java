package org.npathai.application.sales.queries.saleslist;

import java.util.List;

public interface IGetSalesListQuery {

    List<SalesListItemModel> execute();
}
