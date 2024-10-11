package dev.luan.repository;

import club.minnced.discord.webhook.WebhookClient;
import com.reposilite.configuration.shared.SharedConfigurationFacade;
import com.reposilite.plugin.api.Facade;
import com.reposilite.plugin.api.Plugin;
import com.reposilite.plugin.api.ReposilitePlugin;
import dev.luan.repository.settings.DiscordWebhookSettings;
import org.jetbrains.annotations.Nullable;
import panda.std.reactive.MutableReference;

import java.util.HashMap;
import java.util.Map;

@Plugin(name = "discord-webhook-plugin", dependencies = {"configuration", "local-configuration", "shared-configuration"})
public class DiscordWebhookPlugin extends ReposilitePlugin {


    MutableReference<DiscordWebhookSettings> settingsRef;

    WebhookClient rootWebhookClient;
    Map<String, WebhookClient> webhookClientMap;

    @Override
    public @Nullable Facade initialize() {
        webhookClientMap = new HashMap<>();

        SharedConfigurationFacade sharedConfigurationFacade = extensions().facade(SharedConfigurationFacade.class);
        sharedConfigurationFacade.updateSharedSettings("discord-webhook", new DiscordWebhookSettings());
        return null;
    }
}
