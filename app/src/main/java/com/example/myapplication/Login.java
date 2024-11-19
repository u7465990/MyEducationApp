package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.annotation.RequiresPermission;
import androidx.appcompat.app.AppCompatActivity;
import com.example.myapplication.CourseFactory.Reader;

import com.example.myapplication.Users.AllUsers;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Login extends AppCompatActivity {

    private EditText usernameEditText;
    private EditText passwordEditText;
    private ImageButton showPasswordButton;
    private Button loginButton;
    private Button signupButton;

    private List<String> username = new ArrayList<>(
            Arrays.asList("admin","comp2100@anu.au","comp6442@anu.au"));

    private List<String> password = new ArrayList<>(Arrays.asList(
            "123456","comp2100","comp6442"));


    private String usersFilePath1 = "D:/ANU/comp2100/ga-23s1-comp2100-6442/MyEducationApp/app/src/main/java/com/example/myapplication/assets/users.csv";

    private String usersFilePath2 ="D:/ANU/comp2100/ga-23s1-comp2100-6442/MyEducationApp/app/src/main/java";

//    private List<String[]> theUsers = ReadUsers.read(usersFilePath2);
    private String[][] theUsers = Reader.readFile(usersFilePath2);

    private AllUsers myUsers = new AllUsers(theUsers);

    public void signup(String myUsername,String myPassword) {
        //It is to check whether the

        int n =0;
        boolean theBreak = false;
        while (n<username.size()){
//            It is to check whether the username and the password is correct.
            if(myUsername.equals(username.get(n))&&myPassword.equals(password.get(n))){
                theBreak = true;
            }
            n++;
        }
        // Check if 'quit' is provided.
        if(!theBreak){
            username.add(myUsername);
            password.add(myPassword);
        }
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        usernameEditText = findViewById(R.id.username_edittext);
        passwordEditText = findViewById(R.id.password_edittext);
        showPasswordButton = findViewById(R.id.show_password_button);
        loginButton = findViewById(R.id.login_button);
        signupButton = findViewById(R.id.signup_button);
        signupButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Login.this, Register.class);
                startActivity(intent);
            }
        });


        // 设置密码输入框为*号显示
        passwordEditText.setTransformationMethod(PasswordTransformationMethod.getInstance());

        // 点击小眼睛按钮，显示或隐藏密码
        showPasswordButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (passwordEditText.getTransformationMethod() == null) {
                    passwordEditText.setTransformationMethod(PasswordTransformationMethod.getInstance());
                } else {
                    passwordEditText.setTransformationMethod(null);
                }
            }
        });

        // 点击登录按钮，判断用户名和密码是否正确
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = usernameEditText.getText().toString();
                String password = passwordEditText.getText().toString();

                // 判断用户名和密码是否正确
                if (myUsers.check(username,password)) {
                    // 如果正确，进入下一页面
                    Toast.makeText(Login.this, "Login success!", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(Login.this, SearchActivity.class);
                    startActivity(intent);
                } else {
                    // 如果不正确，提示错误信息
                    Toast.makeText(Login.this, "Username or password is incorrect!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

}
