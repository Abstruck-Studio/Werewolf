package org.abstruck.werewolf.core.math;

/**
 * @author Goulixiaoji
 */
public class Vector2d implements Position<Double> {
    private double x;
    private double y;

    public Vector2d(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public Double getX() {
        return x;
    }

    @Override
    public Double getY() {
        return y;
    }

    @Override
    public Double deltaX(Position<Double> position) {
        return (position.getX() - this.x);
    }

    @Override
    public Double deltaY(Position<Double> position) {
        return (position.getY() - this.y);
    }

    public double lengthSquared() {
        return this.x * this.x + this.y * this.y;
    }
}
