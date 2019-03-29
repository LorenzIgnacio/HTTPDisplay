package com.example.httpdisplay;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by ankit on 27/10/17.
 */

public class MovieAdapter extends RecyclerView.Adapter<MovieAdapter.ViewHolder> {

    private Context context;
    private List<Movie> list;

    public MovieAdapter(Context context, List<Movie> list) {
        this.context = context;
        this.list = list;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.single_item, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Movie movie = list.get(position);

        holder.textStatus.setText(movie.getStatus());
        holder.textUsername.setText(movie.getUsername());
        holder.textSubject.setText(movie.getSubject());
        holder.textId.setText(String.valueOf(movie.getDocu_id()));
        holder.textDate.setText(String.valueOf(movie.getFinal_action_date()));
        holder.textRef.setText(String.valueOf(movie.getReference_number()));

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView textStatus, textUsername, textSubject, textId, textDate, textRef;

        public ViewHolder(View itemView) {
            super(itemView);

            textStatus = itemView.findViewById(R.id.main_status);
            textUsername = itemView.findViewById(R.id.main_username);
            textSubject = itemView.findViewById(R.id.main_subject);

            textId = itemView.findViewById(R.id.main_id);
            textDate = itemView.findViewById(R.id.main_date);
            textRef = itemView.findViewById(R.id.main_ref);


        }
    }

}