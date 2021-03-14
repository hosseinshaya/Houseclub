package com.hosseinshaya.clubhouzeplus.api.methods;

import com.hosseinshaya.clubhouzeplus.api.BaseResponse;
import com.hosseinshaya.clubhouzeplus.api.ClubhouseAPIRequest;

public class UpdateUsername extends ClubhouseAPIRequest<BaseResponse> {
    public UpdateUsername(String name) {
        super("POST", "update_username", BaseResponse.class);
        requestBody = new Body(name);
    }

    private static class Body {
        public String username;

        public Body(String username) {
            this.username = username;
        }
    }
}
