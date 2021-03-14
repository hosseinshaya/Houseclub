package com.hosseinshaya.clubhouzeplus;

import androidx.annotation.Nullable;

import com.hosseinshaya.clubhouzeplus.api.model.Channel;

import java.util.Objects;

public class DataProvider {
    private static Channel channelCache = null;

    @Nullable
    public static Channel getChannel(String id) {
        if (channelCache == null) return null;
        return Objects.equals(channelCache.channel, id) ? channelCache : null;
    }

    public static Channel getCachedChannel() {
        return channelCache;
    }

    public static void saveChannel(Channel channel) {
        channelCache = channel;
    }
}
