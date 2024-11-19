package com.example.myapplication;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;

/**
 * course activity
 */
public class CourseActivity extends Activity {
    private TextView mTvCourseName;
    private TextView mTvSkill;
    private TextView mTvSpecialization;
    private TextView mTvLink;
    private Button mBackBt;


//    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.course_activity);
        mTvCourseName = findViewById(R.id.course_name_tv);
        mTvSkill = findViewById(R.id.course_skill_tv);
        mTvSpecialization = findViewById(R.id.specialization_tv);
        mTvLink = findViewById(R.id.course_link_tv);
        mBackBt = findViewById(R.id.back_bt);
        Intent intent = getIntent();
        String course = intent.getStringExtra("name");
        String skill = intent.getStringExtra("skill");
        String specialization = intent.getStringExtra("specialization");
        String link = intent.getStringExtra("link");
        mTvCourseName.setText(course);
        mTvSkill.setText(skill);
        mTvSpecialization.setText(specialization);
        mTvLink.setText(link);
        mBackBt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }

}

