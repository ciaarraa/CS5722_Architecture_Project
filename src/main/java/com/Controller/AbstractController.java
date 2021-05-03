package com.Controller;

import com.GUI.AbstractModel;
import com.Views.ViewInterface;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.lang.reflect.Method;
import java.util.ArrayList;

public abstract class AbstractController implements PropertyChangeListener {
    private ArrayList<ViewInterface> registeredViews;
    private ArrayList<AbstractModel> registeredModels;

    public AbstractController() {
        registeredViews = new ArrayList<ViewInterface>();
        registeredModels = new ArrayList<AbstractModel>();

    }

    public void addModel(AbstractModel model) {
        registeredModels.add(model);
        model.addPropertyChangeListener(this);
    }

    public void removeModel(AbstractModel model) {
        registeredModels.remove(model);
        model.removePropertyChangeListener(this);
    }

    public void addView(ViewInterface view) {
        registeredViews.add(view);
    }

    public void removeView(ViewInterface view) {
        registeredViews.remove(view);
    }

 //property change event notification
    public void propertyChange(PropertyChangeEvent evt) {
        for (ViewInterface view : registeredViews) {
            view.modelPropertyChange(evt);
        }
    }

    protected void setModelProperty(String propertyName, Object newValue)  {
        for (AbstractModel model : registeredModels) {
            try {
                Method method = model.getClass().getMethod("set" + propertyName,
                        newValue.getClass());
                method.invoke(model, newValue);
            } catch (Exception e) {

            }

        }

    }

    protected void addModelProperty(String propertyName, Object newValue){
        for (AbstractModel model : registeredModels) {
            try {
                Method method = model.getClass().getMethod("add" + propertyName,
                        newValue.getClass());
                method.invoke(model, newValue);
            } catch (Exception e) {
                e.printStackTrace();
            }

        }

    }
}

