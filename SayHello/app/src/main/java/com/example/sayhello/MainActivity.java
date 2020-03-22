package com.example.sayhello;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText account = (EditText) findViewById(R.id.account);
        final EditText password = (EditText) findViewById(R.id.password);

        Button button = findViewById(R.id.login);
        final TextView text = findViewById(R.id.text);

        final CheckBox pick = findViewById(R.id.checkBox);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("Main","is click");
                String name = account.getText().toString().trim();
                String code = password.getText().toString().trim();
                if(name.isEmpty()){
                    text.setText("please finish your information");
                    Log.d("Wrong","no account");
                }
                else if(!pick.isChecked()){
                    text.setText("Hello "+name+" : Your password is "+code +" and you choose not to remember the password next time.");
                }
                else {
                    text.setText("Hello "+name+" : Your password is "+code +" and you choose to remember the password next time.");
                }
            }
        });
    }
}
