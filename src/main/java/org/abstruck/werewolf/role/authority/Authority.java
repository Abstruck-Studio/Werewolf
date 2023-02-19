package org.abstruck.werewolf.role.authority;

import org.abstruck.werewolf.role.Role;

/**
 * @author Goulixiaoji
 * Authority: The Role's ability
 */
public abstract class Authority {
    /**
     * Allow you to do action on a Role.
     * @param self Yourself.
     * @param target The action target.
     */
    public abstract void actionOnRole(Role self, Role target);
}
