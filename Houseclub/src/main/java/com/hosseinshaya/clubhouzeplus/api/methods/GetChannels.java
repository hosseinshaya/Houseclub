package com.hosseinshaya.clubhouzeplus.api.methods;

import com.hosseinshaya.clubhouzeplus.api.model.Channel;

import java.util.List;

import com.hosseinshaya.clubhouzeplus.api.ClubhouseAPIRequest;

public class GetChannels extends ClubhouseAPIRequest<GetChannels.Response> {
    public GetChannels() {
        super("GET", "get_channels", Response.class);
    }

    public static class Response {
        public List<Channel> channels;
    }
}
