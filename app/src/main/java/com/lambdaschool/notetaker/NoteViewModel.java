package com.lambdaschool.notetaker;

public class NoteViewModel {

    private MutableLiveData<ArrayList<Note>> noteList;
    private NoteRepository repo;

    public LiveData<ArrayList<Note>> getNotesList() {
        if (noteList == null) {
            //create list
        }
        return noteList;
    }

    private void loadList() {
        repo = new NoteRepository();
        noteList = repo.getNotes();
    }

    public void addNote(Note note) {
        if(noteList != null) {
            noteList.setValue(repo.addNote(note));
        }
    }
}
