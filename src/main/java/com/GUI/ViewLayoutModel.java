package com.GUI;

public class ViewLayoutModel extends AbstractModel{
    private String view;

    public ViewLayoutModel(){
        view = "ShopFrontView";
    }

    public void setView(String newView) {
        if (!view.equals(newView)) {
            String oldView = this.view;
            this.view = newView;

            firePropertyChange("View", oldView, newView);
        }
    }


}