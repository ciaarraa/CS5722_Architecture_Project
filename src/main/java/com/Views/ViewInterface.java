package com.Views;

import javax.swing.*;
import java.beans.PropertyChangeEvent;

public abstract class ViewInterface extends JPanel {
    public abstract void modelPropertyChange(PropertyChangeEvent evt);
    public abstract String getName();
}
