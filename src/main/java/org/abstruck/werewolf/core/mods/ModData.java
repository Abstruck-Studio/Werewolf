package org.abstruck.werewolf.core.mods;

import java.util.List;

/**
 * @author Goulixiaoji
 */
public class ModData {
    private int version;
    private String id;
    private String name;
    private String description;
    private String license;
    private EntryPoints entryPoints;
    private List<DependsMod> depends;

    public int getVersion() {
        return version;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getLicense() {
        return license;
    }

    public EntryPoints getEntryPoints() {
        return entryPoints;
    }

    public List<DependsMod> getDepends() {
        return depends;
    }

    public static class EntryPoints {
        String init;
        public String getInit() {
            return init;
        }
    }

    public static class DependsMod {
        String id;
        private int minVersion;
        private int maxVersion;

        public String getId() {
            return id;
        }

        public int getMaxVersion() {
            return maxVersion;
        }

        public int getMinVersion() {
            return minVersion;
        }
    }
}
