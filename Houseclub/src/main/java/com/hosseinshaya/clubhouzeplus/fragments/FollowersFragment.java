package com.hosseinshaya.clubhouzeplus.fragments;

import android.app.Activity;

import com.hosseinshaya.clubhouzeplus.api.methods.GetFollowers;

import me.grishka.appkit.api.SimpleCallback;
import com.hosseinshaya.clubhouzeplus.R;

public class FollowersFragment extends UserListFragment {

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        setTitle(R.string.followers_title);
    }

    @Override
    protected void doLoadData(int offset, int count) {
        currentRequest = new GetFollowers(getArguments().getInt("id"), 50, offset / 50 + 1)
                .setCallback(new SimpleCallback<GetFollowers.Response>(this) {
                    @Override
                    public void onSuccess(GetFollowers.Response result) {
                        currentRequest = null;
                        onDataLoaded(result.users, data.size() + preloadedData.size() + result.users.size() < result.count);
                    }
                })
                .exec();
    }
}
