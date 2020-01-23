package com.julio.sitio.ui.abelhas;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class AbelhasViewModel extends ViewModel {
    private MutableLiveData<String> mText;

    public AbelhasViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is tools fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}