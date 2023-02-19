package org.abstruck.werewolf.object;

import org.abstruck.werewolf.core.math.Vector2d;

/**
 * @author Goulixiaoji
 */
public abstract class BasicCollisionObject implements CollisionObject {
    private Vector2d position;
    private Vector2d collisionBox;
    protected BasicCollisionObject(Vector2d position, Vector2d collisionBox) {
        this.position = position;
        this.collisionBox = collisionBox;
    }

    @Override
    public boolean onCollision(CollisionObject collisionObject) {
        return false;
    }

    public Vector2d getPosition() {
        return position;
    }

    public Vector2d getCollisionBox() {
        return collisionBox;
    }
}
