package org.abstruck.werewolf.object;

import org.abstruck.werewolf.core.math.Vector2d;

/**
 * @author Goulixiaoji
 */
public abstract class BasicCollisionBox implements ICollisionBox{
    private Vector2d position;
    private Vector2d collisionBox;

    @Override
    public boolean onCollision(BasicCollisionBox collisionBox) {
        return (this.position.getX() - collisionBox.position.getX() > collisionBox.collisionBox.getX()) ||
               (collisionBox.position.getX() - this.position.getX() > this.collisionBox.getX()) ||
               (this.position.getY() - collisionBox.position.getY() > collisionBox.collisionBox.getY()) ||
               (collisionBox.position.getY() - this.position.getY() > this.collisionBox.getY());
    }
}
