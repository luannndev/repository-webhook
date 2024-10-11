package dev.luan.repository;

import com.reposilite.plugin.api.Facade;
import com.reposilite.plugin.api.Plugin;
import com.reposilite.plugin.api.ReposilitePlugin;
import org.jetbrains.annotations.Nullable;

@Plugin(name = "discord-webhook-plugin", dependencies = {"configuration", "local-configuration", "shared-configuration"})
public class DiscordWebhookPlugin extends ReposilitePlugin {


    @Override
    public @Nullable Facade initialize() {
        return null;
    }
}
