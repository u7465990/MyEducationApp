package com.example.myapplication;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

/**
 * search result adapter
 */
public class SearchResultAdapter extends RecyclerView.Adapter<SearchResultAdapter.ViewHolder> {
    private List<CourseInfo> mData;
    private Context mContext;

    public SearchResultAdapter(Context context) {
        mContext = context;
    }

    public void setData(List<CourseInfo> data) {
        this.mData = data;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_search, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        CourseInfo courseInfo = mData.get(position);
        if (courseInfo == null) {
            return;
        }
        holder.courseNameTv.setText(courseInfo.getCourseName());
        holder.specializationTv.setText(courseInfo.getSpecialization());
        holder.courseLl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(mContext, CourseActivity.class);
                intent.putExtra("name", courseInfo.getCourseName());
                intent.putExtra("skill", courseInfo.getSkill());
                intent.putExtra("specialization", courseInfo.getSpecialization());
                intent.putExtra("link", courseInfo.getCourseLink());
                mContext.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder {
        LinearLayout courseLl;
        TextView courseNameTv;
        TextView specializationTv;

        public ViewHolder(View view) {
            super(view);
            courseLl = view.findViewById(R.id.course_ll);
            courseNameTv = view.findViewById(R.id.course_name_tv);
            specializationTv = view.findViewById(R.id.specialization_tv);
        }
    }
}
