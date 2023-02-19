package org.abstruck.werewolf.game;

import org.abstruck.werewolf.object.CollisionObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Goulixiaoji
 */
public class Game {
    private final List<CollisionObject> gameObjects = new ArrayList<>();
    private static final Logger LOGGER = LoggerFactory.getLogger(Game.class);
    public Game() {

    }

    public boolean insertObject(CollisionObject object) {
        for (CollisionObject collisionObject : gameObjects) {
            if (object.onCollision(collisionObject)) {
                LOGGER.error("Insert Object Failed: On Collision with other object!");
                return false;
            }
        }
        gameObjects.add(object);
        return true;
    }
}
