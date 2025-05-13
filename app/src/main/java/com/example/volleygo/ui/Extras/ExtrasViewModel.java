package com.example.volleygo.ui.Extras;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ExtrasViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public ExtrasViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is home fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }

}
