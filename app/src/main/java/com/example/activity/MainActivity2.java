package com.example.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Bundle args =  getIntent().getExtras();
        String text = args.get("ask").toString();
        TextView askTextView = (TextView) findViewById(R.id.textView);
        askTextView.setText(text);
    }

    public void ButtonClick(View view) {
        EditText editText = (EditText) findViewById(R.id.editTextText2);
        String text = editText.getText().toString();
        Intent intent = new Intent();
        intent.putExtra("answer", text);
        setResult(Activity.RESULT_OK, intent);
        finish();
    }
}