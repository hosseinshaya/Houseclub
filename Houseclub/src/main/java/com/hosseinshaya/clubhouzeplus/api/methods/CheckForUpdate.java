package com.hosseinshaya.clubhouzeplus.api.methods;

import com.hosseinshaya.clubhouzeplus.api.BaseResponse;

import java.util.HashMap;

import com.hosseinshaya.clubhouzeplus.api.ClubhouseAPIRequest;

public class CheckForUpdate extends ClubhouseAPIRequest<BaseResponse> {
    public CheckForUpdate() {
        super("GET", "check_for_update", BaseResponse.class);
        queryParams = new HashMap<>();
        queryParams.put("is_testflight", "0");
    }
}
