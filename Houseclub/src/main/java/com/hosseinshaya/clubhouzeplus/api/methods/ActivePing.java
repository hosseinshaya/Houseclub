package com.hosseinshaya.clubhouzeplus.api.methods;

import com.hosseinshaya.clubhouzeplus.api.BaseResponse;
import com.hosseinshaya.clubhouzeplus.api.ClubhouseAPIRequest;

public class ActivePing extends ClubhouseAPIRequest<BaseResponse> {
    public ActivePing(String channel) {
        super("POST", "active_ping", BaseResponse.class);
        requestBody = new Body(channel);
    }

    private static class Body {
        public String channel;

        public Body(String channel) {
            this.channel = channel;
        }
    }
}
