package com.hosseinshaya.clubhouzeplus.api.methods;

import com.hosseinshaya.clubhouzeplus.api.BaseResponse;
import com.hosseinshaya.clubhouzeplus.api.ClubhouseAPIRequest;

public class UpdateName extends ClubhouseAPIRequest<BaseResponse> {
    public UpdateName(String name) {
        super("POST", "update_name", BaseResponse.class);
        requestBody = new Body(name);
    }

    private static class Body {
        public String name;

        public Body(String name) {
            this.name = name;
        }
    }
}
