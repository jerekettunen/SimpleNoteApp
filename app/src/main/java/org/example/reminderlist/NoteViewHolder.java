package org.example.reminderlist;


import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class NoteViewHolder extends RecyclerView.ViewHolder {
    TextView title, details;
    ImageView editImage, removeImage;

    public NoteViewHolder(@NonNull View itemView) {
        super(itemView);
        title = itemView.findViewById(R.id.txtTitle);
        details = itemView.findViewById(R.id.txtDetails);
        removeImage = itemView.findViewById(R.id.btnRemoveItem);
        editImage = itemView.findViewById(R.id.btnEditInfo);
    }
}
