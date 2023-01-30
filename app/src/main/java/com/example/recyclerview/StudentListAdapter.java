package com.example.recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.snackbar.Snackbar;

public class StudentListAdapter extends
        RecyclerView.Adapter<StudentListAdapter.StudentViewHolder> {
    private final StudentData[] mStudentList;
    private final LayoutInflater mInflater;

    public StudentListAdapter(Context context, StudentData[] mStudentList) {
        this.mStudentList = mStudentList;
        mInflater = LayoutInflater.from(context);

    }

    @NonNull
    @Override
    public StudentListAdapter.StudentViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View mItemView = mInflater.inflate(R.layout.student_list_item, parent, false);
        return new StudentViewHolder(mItemView, this);
    }

    @Override
    public void onBindViewHolder(@NonNull StudentListAdapter.StudentViewHolder holder, int position) {
        StudentData student = mStudentList[position];
        holder.studentTitleView.setText(student.getStudentName());
        holder.studentImageView.setImageResource(student.getProfileImage());
        holder.studentEmailView.setText(student.getEmail());
        holder.studentPhoneView.setText(student.getPhone());
        holder.studentInterestView.setText(student.getEventInterest());
    }

    @Override
    public int getItemCount() {
        return mStudentList.length;
    }

    class StudentViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        public final TextView studentTitleView;
        public final ImageView studentImageView;
        public final TextView studentEmailView;
        public final TextView studentPhoneView;
        public final TextView studentInterestView;
        final StudentListAdapter mAdapter;

        public StudentViewHolder(@NonNull View itemView, StudentListAdapter adapter) {
            super(itemView);
            studentTitleView = itemView.findViewById(R.id.student_name);
            studentImageView = itemView.findViewById(R.id.student_list_image);
            studentEmailView = itemView.findViewById(R.id.student_email);
            studentPhoneView = itemView.findViewById(R.id.student_phone);
            studentInterestView = itemView.findViewById(R.id.student_interest);
            this.mAdapter = adapter;
            studentTitleView.setOnClickListener(this);
            studentImageView.setOnClickListener(this);
            studentEmailView.setOnClickListener(this);
            studentPhoneView.setOnClickListener(this);
            studentInterestView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            // Get the position of the item that was clicked.
//            int mPosition = getLayoutPosition();
//            // Use that to access the affected item in mWordList.
//            String student = mStudentList[mPosition].getStudentName();
//            Snackbar.make(studentTitleView,
//                    student + " clicked!",
//                    Snackbar.LENGTH_SHORT).show();
//            Snackbar.make(studentImageView,
//                    student + " clicked!",
//                    Snackbar.LENGTH_SHORT).show();
//            Snackbar.make(studentEmailView,
//                    student + " clicked!",
//                    Snackbar.LENGTH_SHORT).show();
//            Snackbar.make(studentPhoneView,
//                    student + " clicked!",
//                    Snackbar.LENGTH_SHORT).show();
//            Snackbar.make(studentInterestView,
//                    student + " clicked!",
//                    Snackbar.LENGTH_SHORT).show();

        }
    }
}
