package com.moringaschool.loginapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import static androidx.constraintlayout.motion.widget.TransitionBuilder.validate;

public class MainActivity<passwaord> extends AppCompatActivity {
 private EditText ename;
 private EditText epassword;
 private Button button3;

private String Username = "Admin";
private String password = "12345678";

boolean invalid = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ename = findViewById(R.id.ename);
        epassword = findViewById(R.id.epassword);
        button3 = findViewById(R.id.button3);


        ename.setOnClickListener(new View.OnClickListener() {
            @Override
            public int hashCode() {
                return super.hashCode();
            }

            @Override
            public void onClick(View v) {
                String inputName = ename.getText().toString();
                String inputPassword = epassword.getText().toString();
                if (inputName.isEmpty() || inputPassword.isEmpty()) {


                    Toast.makeText(MainActivity.this, "Please enter all the details correctly", Toast.LENGTH_LONG).show();
                }else{
                    invalid = validate(inputName, inputPassword);
                counter--;
                }
s
            }
        });
    }
//private boolean validates(String name,String Passwaord){
//        if(ename.equals(Username) && passwaord.equals(password)){
//            return true;
//        }
//        return false;

}


HDA
