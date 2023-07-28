package com.jihad.uas_201103653;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class MahasiswaViewHolder extends RecyclerView.ViewHolder
{

    public TextView _jkTextView;
    public TextView _jpTextView;
    public TextView _namaTextView;
    public TextView _nimTextView;

    public MahasiswaViewHolder(View itemView)
    {
        super(itemView);

        _jkTextView = (TextView) itemView.findViewById(R.id.jkTextView);
        _jpTextView = (TextView) itemView.findViewById(R.id.jpTextView);
        _namaTextView = (TextView) itemView.findViewById(R.id.namaTextView);
        _nimTextView = (TextView) itemView.findViewById(R.id.nimTextView);
    }
}
