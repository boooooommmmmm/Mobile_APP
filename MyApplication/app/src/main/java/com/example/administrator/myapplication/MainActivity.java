package com.example.administrator.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button bt_click_me, bt_login, bt_exit;
    TextView textView;
    EditText edit_text_account_name, edit_text_password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        edit_text_account_name = (EditText) findViewById(R.id.TextFile_account_name);
        edit_text_password = (EditText) findViewById(R.id.TextFile_password);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bt_click_me = (Button) findViewById(R.id.button_click_me);
        bt_click_me.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Click button once", Toast.LENGTH_LONG).show();
            }
        });


        bt_exit = (Button) findViewById(R.id.button_exit);
        bt_exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Click button 2", Toast.LENGTH_LONG).show();
            }
        });


        bt_login = (Button) findViewById(R.id.button_login);
        bt_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String strAccountName = String.valueOf(edit_text_account_name.getText());
                String strPassword = String.valueOf(edit_text_password.getText());

//                if (strAccountName.equals("123") && strPassword.equals("321")) {
//                    Toast.makeText(getApplicationContext(), "FFF!!!", Toast.LENGTH_LONG).show();
//                }
//
//                else{
//                    Toast.makeText(getApplicationContext(), "Wrong account name / password, please try again...", Toast.LENGTH_LONG).show();
//                }
            }
        });
    }
}
