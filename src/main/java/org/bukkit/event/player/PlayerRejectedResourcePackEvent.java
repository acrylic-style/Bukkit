package org.bukkit.event.player;

import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;

/**
 * Called when a player rejected resource pack and getting disconnected by the server.
 */
public class PlayerRejectedResourcePackEvent extends PlayerEvent implements Cancellable {
    private static final HandlerList handlers = new HandlerList();
    private boolean cancel = false;

    public PlayerRejectedResourcePackEvent(@NotNull final Player who) {
        super(who);
    }

    /**
     * {@inheritDoc}
     * If the event was cancelled, then the player will not be kicked and remain as-is.
     */
    @Override
    public boolean isCancelled() {
        return cancel;
    }

    /**
     * {@inheritDoc}
     * If the event was cancelled, then the player will not be kicked and remain as-is.
     */
    @Override
    public void setCancelled(boolean cancel) {
        this.cancel = cancel;
    }

    @NotNull
    @Override
    public HandlerList getHandlers() {
        return handlers;
    }

    @NotNull
    public static HandlerList getHandlerList() {
        return handlers;
    }
}
