package com.example.myapplication;

import android.app.Activity;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

/**
 * search activity
 */
public class SearchActivity extends Activity {
    private RecyclerView mSearchResultRv;
    private RecyclerView mCommentRv;
    private EditText mEditText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.search_activity);
        mSearchResultRv = findViewById(R.id.search_result_rv);
        mCommentRv = findViewById(R.id.comment_rv);
        mEditText = findViewById(R.id.search_et);
        initSearchResult();
        initComment();
    }

    /**
     * init search result view
     */
    private void initSearchResult() {
        List<CourseInfo> courseInfos = new ArrayList<>();
        for (int i = 0; i < 8; i++) {
            CourseInfo courseInfo = new CourseInfo();
            courseInfo.setCourseName(getString(R.string.courseName1));
            courseInfo.setSpecialization(getString(R.string.specialization1));
            courseInfo.setSkill(getString(R.string.skill1));
            courseInfo.setCourseLink("......");
            courseInfos.add(courseInfo);
        }
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        layoutManager .setOrientation(LinearLayoutManager.VERTICAL);
        mSearchResultRv.setLayoutManager(layoutManager);
        SearchResultAdapter adapter = new SearchResultAdapter(this);
        adapter.setData(courseInfos);
        mSearchResultRv.setAdapter(adapter);
    }

    /**
     * init comment view
     */
    private void initComment() {
        List<CommentInfo> commentInfos = new ArrayList<>();
        for (int i = 0; i < 8; i++) {
            CommentInfo commentInfo = new CommentInfo();
            commentInfo.setUserName("comp2100@anu.au");
            commentInfo.setContent("This course is very interesting. The teacher\'s lectures are witty and humorous,\n" +
                    "        and I have learned a lot about Python from them.");
            commentInfos.add(commentInfo);
        }
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        layoutManager .setOrientation(LinearLayoutManager.HORIZONTAL);
        mCommentRv.setLayoutManager(layoutManager);
        CommentAdapter adapter = new CommentAdapter();
        adapter.setData(commentInfos);
        mCommentRv.setAdapter(adapter);
    }

}


