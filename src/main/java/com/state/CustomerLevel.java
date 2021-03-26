package com.state;

public abstract class CustomerLevel {
    private int pointsTotal;
    private int pointsModifier;

    public int getPointsTotal() {
        return pointsTotal;
    }

    public int getPointsModifier() {
        return pointsModifier;
    }

    public void setPointsTotal(int pointsTotal) {
        this.pointsTotal = pointsTotal;
    }

    public void setPointsModifier(int pointsModifier) {
        this.pointsModifier = pointsModifier;
    }
}
