package com.example.bazel;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;

/**
 * Main class for the Bazel Android "Hello, World" app.
 */
public class MainActivity extends Activity {

  private GreetViewModel mGreetViewModel;
  @Override
  public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    Log.v("Bazel", "Hello, Android");

    setContentView(R.layout.activity_main);

    mGreetViewModel = ViewModelProviders.of(this).get(GreetViewModel.class);
    Button clickMeButton = findViewById(R.id.clickMeButton);
    TextView helloBazelTextView = findViewById(R.id.helloBazelTextView);

    mGreetViewModel.currentText().observe(this, helloBazelTextView::setText);

    Greeter greeter = new Greeter();
    clickMeButton.setOnClickListener(v -> helloBazelTextView.setText(greeter.sayHello()));
  }
}
