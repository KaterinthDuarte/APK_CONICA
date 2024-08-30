package com.example.miapp.ui.ad;


import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class AdViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public AdViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Esta es la factura");
    }

    public LiveData<String> getText() {
        return mText;
    }
}