package com.example.myapplication;


import static com.example.myapplication.ReadUsers.read;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.text.TextUtils;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.Toast;
import com.example.myapplication.Login;
import com.example.myapplication.Users.AllUsers;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Register extends AppCompatActivity {

    private EditText mUsernameEditText;
    private EditText mPasswordEditText;
    private EditText mConfirmPasswordEditText;
    private Button mSignUpButton;

    private ImageButton mshowPasswordButton1;
    private ImageButton mshowPasswordButton2;

//    String usersFilePath = "java/com/example/myapplication/assets/users.csv";

    private String usersFilePath = "java/users2.csv";
    private List<String[]> theUsers = ReadUsers.read(usersFilePath);

    private AllUsers myUsers = new AllUsers(theUsers);



//        int n =0;
//        boolean theBreak = false;
//        while (n<theUsers.size()){
//            //            It is to check whether the username and the password is correct.
//            theBreak =theBreak||myUsername.equals(theUsers.get(n)[0]);
//            //            {
//            //                System.out.println(theusers.get(n)[0]);
//            //                System.out.println(theusers.get(n)[1]);
//            //                theBreak = true;
//            //                break;
//            //            }
//            n++;
//        }
//        System.out.println(theBreak);
//        // Check if 'quit' is provided.
//        return theBreak;
//    }
//
//    public static void addUsers(String file,String userName,String password){
//        String inString ="";
//        List<String> toCopy = new ArrayList<>();
//        try {
//            BufferedReader reader = new BufferedReader(new FileReader(file));
//            while ((inString = reader.readLine()) != null){
//                toCopy.add(inString);
//            }
//            reader.close();
//            BufferedWriter writer = new BufferedWriter(new FileWriter(file));
//            for (int v=0;v<toCopy.size();v++){
//                writer.append(toCopy.get(v));
//                writer.newLine();
//            }
//            writer.write(userName+","+password);
//            writer.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        mUsernameEditText = findViewById(R.id.signup_username_edittext);
        mPasswordEditText = findViewById(R.id.signup_password);
        mConfirmPasswordEditText = findViewById(R.id.signup_confirm_password);
        mSignUpButton = findViewById(R.id.signup_confirm_button);
        mshowPasswordButton1 = findViewById(R.id.signup_show_password_btn1);
        mshowPasswordButton2 = findViewById(R.id.signup_show_password_btn2);

        // 设置密码输入框为*号显示
        mPasswordEditText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        mConfirmPasswordEditText.setTransformationMethod(PasswordTransformationMethod.getInstance());

        // 点击小眼睛按钮，显示或隐藏密码
        mshowPasswordButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mPasswordEditText.getTransformationMethod() == null) {
                    mPasswordEditText.setTransformationMethod(PasswordTransformationMethod.getInstance());
                } else {
                    mPasswordEditText.setTransformationMethod(null);
                }
            }
        });

        mshowPasswordButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mConfirmPasswordEditText.getTransformationMethod() == null) {
                    mConfirmPasswordEditText.setTransformationMethod(PasswordTransformationMethod.getInstance());
                } else {
                    mConfirmPasswordEditText.setTransformationMethod(null);
                }
            }
        });


        mSignUpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = mUsernameEditText.getText().toString().trim();
                String password = mPasswordEditText.getText().toString().trim();
                String confirmPassword = mConfirmPasswordEditText.getText().toString().trim();
                // 进行注册操作
                // ...
                // Validate user input
                if (TextUtils.isEmpty(username)) {
                    mUsernameEditText.setError("Please enter a username");
                    return;
                }
                if (TextUtils.isEmpty(password)) {
                    mPasswordEditText.setError("Please enter a password");
                    return;
                }

                if (password.length() < 6) {
                    mPasswordEditText.setError("Password must be at least 6 characters long");
                    return;
                }

                if (!password.matches(".*[!@#$%^&*+=?-].*")) {
                    mPasswordEditText.setError("Password must contain at least one special character");
                    return;
                }

                if (!password.equals(confirmPassword)) {
                    mConfirmPasswordEditText.setError("Passwords do not match");
                    return;
                }
                if(!myUsers.check(username)){
                    mUsernameEditText.setError("Username is used");
                    return;
                }else {
                    myUsers.add(username,password,usersFilePath);
                    Toast.makeText(Register.this, "Signup success! Wait for 5 seconds jump to login page", Toast.LENGTH_SHORT).show();
                }

                // Registration successful

                new CountDownTimer(5000, 1000) {

                    public void onTick(long millisUntilFinished) {
                    }

                    public void onFinish() {
                        Intent intent = new Intent(Register.this, Login.class);
                        startActivity(intent);
                        finish();
                    }
                }.start();
                // 跳转到登录界面
                Intent intent = new Intent(Register.this, Login.class);
                startActivity(intent);
                finish();

            }
        });
    }
}
