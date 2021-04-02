package com.willfp.eco.internal.config;

import org.bukkit.configuration.ConfigurationSection;
import org.jetbrains.annotations.NotNull;

public class ConfigSection extends AbstractUndefinedConfig<ConfigurationSection> {
    /**
     * Config section.
     *
     * @param section    The section.
     */
    protected ConfigSection(@NotNull final ConfigurationSection section) {
        super("subsection");
        this.init(section);
    }
}
