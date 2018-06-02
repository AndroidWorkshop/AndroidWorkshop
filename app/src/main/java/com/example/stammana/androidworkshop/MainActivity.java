package com.example.stammana.androidworkshop;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static final String USERNAME = "swecha";
    private static final String PASSWORD = "swecha";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void login(View view) {
        TextView userNameView = (TextView) findViewById(R.id.username);
        TextView passwordView = (TextView) findViewById(R.id.password);
        String username = userNameView.getText().toString();
        String password = passwordView.getText().toString();
        Intent intent=new Intent(MainActivity.this,HomeActivity.class);
        if(username.equals(USERNAME) && password.equals(PASSWORD)){
            startActivity(intent);
        }
        else {
            Toast.makeText(this,"Please Enter valid details",Toast.LENGTH_SHORT).show();
        }
    }
}
