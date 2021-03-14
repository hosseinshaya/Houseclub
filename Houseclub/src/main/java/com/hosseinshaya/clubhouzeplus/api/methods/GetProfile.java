package com.hosseinshaya.clubhouzeplus.api.methods;

import com.hosseinshaya.clubhouzeplus.api.model.FullUser;
import com.hosseinshaya.clubhouzeplus.api.ClubhouseAPIRequest;

public class GetProfile extends ClubhouseAPIRequest<GetProfile.Response> {
    public GetProfile(int id) {
        super("POST", "get_profile", Response.class);
        requestBody = new Body(id);
    }

    private static class Body {
        public int userId;

        public Body(int userId) {
            this.userId = userId;
        }
    }

    public static class Response {
        public FullUser userProfile;
    }
}
