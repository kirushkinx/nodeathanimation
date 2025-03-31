package me.loloed.nodeathanimation;

import org.bukkit.plugin.java.JavaPlugin;

public class OsaMason extends JavaPlugin {
    private static OsaMason instance;

    @Override
    public void onLoad() {
        instance = this;
        super.onLoad();
    }

    public static OsaMason getInstance() {
        return instance;
    }
}