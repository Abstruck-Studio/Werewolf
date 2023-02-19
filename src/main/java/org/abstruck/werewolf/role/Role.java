package org.abstruck.werewolf.role;

import org.abstruck.werewolf.role.authority.Authority;

/**
 * @author Goulixiaoji
 * Role: The object player control.
 */
public class Role {
    protected Authority authority;

    public Authority getAuthority() {
        return authority;
    }

    public void changeAuthority(Authority authorityToChange) {
        this.authority = authorityToChange;
    }
}
