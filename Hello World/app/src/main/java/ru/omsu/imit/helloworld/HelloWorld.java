package ru.omsu.imit.helloworld;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class HelloWorld extends Activity {
    private TextView mHelloTextView;
    private EditText mNameEditText;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mHelloTextView = findViewById(R.id.textView);
        mNameEditText = findViewById(R.id.editTextTextPersonName);
    }

    public void onClick(View view) {
        if(mNameEditText.getText().length() == 0) {
            mHelloTextView.setText("Hello Kitty!");
        } else {
            mHelloTextView.setText("Привет, " + mNameEditText.getText());
        }
    }
}
