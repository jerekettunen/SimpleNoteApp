package org.example.reminderlist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.time.Instant;

public class ProcessNoteActivity extends AppCompatActivity {
    private int pos;
    private EditText title, details;
    private long timestamp;
    private Note note;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_process_note);

        title = findViewById(R.id.txtNoteTitle);
        details = findViewById(R.id.txtNoteDetails);

        pos = getIntent().getIntExtra("position",-1);


        if (pos > -1){
            note = NoteStorage.getInstance().getNote(pos);
            title.setText(note.getTitle());
            details.setText(note.getDetails());
        }

    }

    public void saveNoteClick(View view) {
        if (pos == -1) {
            timestamp = Instant.now().getEpochSecond();
            Note note = new Note(title.getText().toString(), details.getText().toString(), timestamp);
            NoteStorage.getInstance().addNote(note);
        } else {
            note.setTitle(title.getText().toString());
            note.setDetails(details.getText().toString());
        }

        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}