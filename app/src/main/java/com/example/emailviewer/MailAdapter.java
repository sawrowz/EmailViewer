package com.example.emailviewer;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MailAdapter extends RecyclerView.Adapter<MailViewHolder> {

    private List<EmailItem> emailItems;
    public MailAdapter(List<EmailItem> emailItems) {
        this.emailItems = emailItems;
    }

    @NonNull
    @Override
    public MailViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recyclerview_mail_item, parent, false);

        return new MailViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MailViewHolder holder, int position) {
        EmailItem currentItem = emailItems.get(position);
        holder.initialTextView.setText(currentItem.getTitleInitial());
        holder.titleView.setText(currentItem.getTitle());
        holder.contentView.setText(currentItem.getContent());
    }



    @Override
    public int getItemCount() {
        return emailItems.size();
    }
}

class MailViewHolder extends RecyclerView.ViewHolder{

    public TextView initialTextView;
    public  TextView titleView;
    public  TextView contentView;


    public MailViewHolder(@NonNull View itemView) {
        super(itemView);

        initialTextView = itemView.findViewById(R.id.initial);
        titleView = itemView.findViewById(R.id.title);
        contentView = itemView.findViewById(R.id.content);
    }
}