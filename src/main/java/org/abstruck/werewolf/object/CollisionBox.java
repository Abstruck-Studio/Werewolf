package org.abstruck.werewolf.object;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Goulixiaoji
 */
public class CollisionBox {
    public final List<BasicCollisionBox> collisionBoxes = new ArrayList<>();

    public boolean onCollision(CollisionBox collisionBox) {
        for (BasicCollisionBox basicCollisionBox0 : collisionBoxes) {
            for (BasicCollisionBox basicCollisionBox1 : collisionBox.collisionBoxes) {
                if (basicCollisionBox0.onCollision(basicCollisionBox1)) {
                    return true;
                }
            }
        }
        return false;
    }

    public List<BasicCollisionBox> getCollisionBoxes() {
        return collisionBoxes;
    }

    public void addCollisionBox(BasicCollisionBox collisionBox) {
        collisionBoxes.add(collisionBox);
    }
}
