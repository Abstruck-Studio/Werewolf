package org.abstruck.werewolf.core.math;

/**
 * @author Goulixiaoji
 */
public interface Position<T> {
    T getX();
    T getY();
    T deltaX(Position<T> position);
    T deltaY(Position<T> position);
}
