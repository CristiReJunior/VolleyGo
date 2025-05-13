package com.example.volleygo.ui.Reglas;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ReglasViewModel extends ViewModel {

    private final MutableLiveData<String> mText ;

    public ReglasViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Reglas fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }

}
