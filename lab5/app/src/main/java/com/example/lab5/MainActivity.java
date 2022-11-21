package com.example.lab5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText edittextMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edittextMessage=findViewById(R.id.editTextTextMessage);
    }

    public void onClickSendMessage(View view) {
        String msg=edittextMessage.getText().toString();
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_TEXT,msg);
        Intent chosenIntent = Intent.createChooser(intent,getString(R.string.chooser_title));
        startActivity(chosenIntent);

    }
}