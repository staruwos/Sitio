package com.julio.sitio.ui.ferramentas;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class FerramentasViewModel extends ViewModel {
    private MutableLiveData<String> mText;

    public FerramentasViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is tools fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}