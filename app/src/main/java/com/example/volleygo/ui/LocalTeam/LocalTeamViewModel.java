package com.example.volleygo.ui.LocalTeam;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class LocalTeamViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public LocalTeamViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is home fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }

}
