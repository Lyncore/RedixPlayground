package com.example.prof_project;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MediatorLiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Transformations;
import androidx.lifecycle.ViewModel;

public class SignUpViewModel extends ViewModel {
    public MutableLiveData<String> name = new MutableLiveData<>("");
    public MutableLiveData<String> pass = new MutableLiveData<>("");
    public MutableLiveData<Boolean> isAcceptec = new MutableLiveData<>(false);
    public LiveData<Boolean> isValid;

    public SignUpViewModel(){
        isValid =  Transformations.switchMap(name, v -> {
            return Transformations.switchMap(pass, p -> {
                return Transformations.map(isAcceptec, a -> {
                    return  !v.isEmpty() && !p.isEmpty() && a;
                });
            });
        });
    }
}
