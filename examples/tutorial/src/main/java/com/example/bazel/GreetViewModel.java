package com.example.bazel;


import android.app.Application;

public class GreetViewModel extends AndroidViewModel {

    private MutableLiveData<String> currentText;

    public GreetViewModel(Application application) {
        super(application);
        currentText = new MutableLiveData<>();
        currentText.setValue("Hi There this is a test text");
    }

    public MutableLiveData<String> currentText() {
        if (currentText == null) {
            currentText = new MutableLiveData<>();
        }

        return currentText;
    }
}
