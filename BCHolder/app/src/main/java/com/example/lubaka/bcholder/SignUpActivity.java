package com.example.lubaka.bcholder;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class SignUpActivity extends Activity implements View.OnClickListener{
    Button pesho;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        pesho = (Button) findViewById(R.id.signUpButton);
        pesho.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.signUpButton){
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        }
    }
}
