package org.example.reminderlist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private NoteStorage storage;
    private NoteViewAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        storage = NoteStorage.getInstance();
        recyclerView = findViewById(R.id.rvNotesList);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new NoteViewAdapter(getApplicationContext(), storage.getNotes());
        recyclerView.setAdapter(adapter);

    }

    public void toAddView (View view) {
        Intent intent = new Intent(this, ProcessNoteActivity.class);
        startActivity(intent);
    }

    public void sortTime(View view){
       System.out.println("Sorting");
       NoteStorage.getInstance().sortNotesTime();
       adapter.notifyDataSetChanged();
    }

    public void sortAlph(View view){
        System.out.println("Sorting_2");
        NoteStorage.getInstance().sortNotesLetter();
        adapter.notifyDataSetChanged();
    }


}