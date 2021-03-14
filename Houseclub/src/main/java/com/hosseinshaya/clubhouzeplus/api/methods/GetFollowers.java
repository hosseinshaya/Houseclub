package com.hosseinshaya.clubhouzeplus.api.methods;

import com.hosseinshaya.clubhouzeplus.api.model.FullUser;

import java.util.HashMap;
import java.util.List;

import com.hosseinshaya.clubhouzeplus.api.ClubhouseAPIRequest;

public class GetFollowers extends ClubhouseAPIRequest<GetFollowers.Response> {
    public GetFollowers(int userID, int pageSize, int page) {
        super("GET", "get_followers", Response.class);
        queryParams = new HashMap<>();
        queryParams.put("user_id", userID + "");
        queryParams.put("page_size", pageSize + "");
        queryParams.put("page", page + "");
    }

    public static class Response {
        public List<FullUser> users;
        public int count;
    }
}
