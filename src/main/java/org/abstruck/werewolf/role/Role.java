package org.abstruck.werewolf.role;

import org.abstruck.werewolf.core.math.Vector2d;
import org.abstruck.werewolf.object.CollisionBox;
import org.abstruck.werewolf.role.authority.Authority;

/**
 * @author Goulixiaoji
 * Role: The object player control.
 */
public class Role extends CollisionBox {
    protected Authority authority;

    protected Role(Authority authorityToChange, Vector2d position, Vector2d collisionBox) {
        this.authority = authorityToChange;
    }

    public Authority getAuthority() {
        return authority;
    }
}
