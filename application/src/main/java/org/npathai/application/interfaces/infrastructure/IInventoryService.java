package org.npathai.application.interfaces.infrastructure;

public interface IInventoryService {

    void notifySaleOccurred(long productId, int quantity);
}
