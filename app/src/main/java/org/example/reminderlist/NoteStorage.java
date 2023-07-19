package org.example.reminderlist;

import java.util.ArrayList;

public class NoteStorage {
    private ArrayList<Note> notes = new ArrayList<>();
    private static NoteStorage singleton;

    private NoteStorage() {
    }
    public static NoteStorage getInstance() {
        if (singleton == null) {
            singleton = new NoteStorage();
        }
        return singleton;
    }

    public void addNote(Note note) {
        notes.add(note);
    }

    public void removeNote(int position) {
        notes.remove(position);
    }

    public void sortNotesTime() {
        // using a lambda function where it compares the value LastNames and sorts accordingly
        notes.sort((a,b) -> Long.compare(a.getTime(),b.getTime()));
    }

    public ArrayList<Note> getNotes() {
        return notes;
    }

    public Note getNote(int position) {
        return notes.get(position);
    }

    public void sortNotesLetter() {
        // using a lambda function where it compares the value LastNames and sorts accordingly
        notes.sort( (a, b) -> a.getTitle().toUpperCase().compareTo(b.getTitle().toUpperCase()));
    }
}
