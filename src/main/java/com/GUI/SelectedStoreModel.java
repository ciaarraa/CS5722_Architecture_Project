package com.GUI;

import com.Controller.CustomerController;

public class SelectedStoreModel extends AbstractModel {
    private Integer selectedStore;

    public SelectedStoreModel() {
        this.selectedStore = -1;
    }

    public int getSelectedStore() {
        return selectedStore;
    }

    public void setSelectedStore(Integer selectedStore) {
        int oldSelectedStore = this.selectedStore;
        this.selectedStore = selectedStore;

        firePropertyChange(CustomerController.SELECTED_STORE, oldSelectedStore, selectedStore );
        firePropertyChange("SWITCH", null, "SHOP_FRONT_VIEW");
        //tell the cardLayout to change
    }

}
