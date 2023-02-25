package org.abstruck.werewolf.game;

import org.abstruck.werewolf.object.CollisionBox;
import org.abstruck.werewolf.object.ICollisionBox;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Goulixiaoji
 */
public class Game {
    private final List<CollisionBox> gameObjects = new ArrayList<>();
    private static final Logger LOGGER = LoggerFactory.getLogger(Game.class);
    public Game() {

    }

    public boolean insertObject(CollisionBox object) {
        for (CollisionBox collisionBox : gameObjects) {
            if (object.onCollision(collisionBox)) {
                LOGGER.error("Insert Object Failed: On Collision with other object!");
                return false;
            }
        }
        gameObjects.add(object);
        return true;
    }
}
