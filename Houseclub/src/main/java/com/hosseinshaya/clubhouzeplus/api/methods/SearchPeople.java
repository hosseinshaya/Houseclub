package com.hosseinshaya.clubhouzeplus.api.methods;

import com.hosseinshaya.clubhouzeplus.api.model.SearchUser;

import java.util.List;

import com.hosseinshaya.clubhouzeplus.api.ClubhouseAPIRequest;

public class SearchPeople extends ClubhouseAPIRequest<SearchPeople.Resp> {

    public SearchPeople(String query) {
        super("POST", "search_users", Resp.class);
        requestBody = new Body(query);
    }

    private static class Body {

        public String query;
        public Body(String query) {
            this.query = query;
        }
    }

    public static class Resp {
        public List<SearchUser> users;
    }
}
