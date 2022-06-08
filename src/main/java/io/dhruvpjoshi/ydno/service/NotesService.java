package io.dhruvpjoshi.ydno.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.dhruvpjoshi.ydno.model.Note;
import io.dhruvpjoshi.ydno.repository.NotesRepository;

@Service
public class NotesService {

  @Autowired
  private NotesRepository notes;
  
  public Note createNote(Note note) {
    return notes.save(note);
  }
  
  public List<Note> getNotes() {
    return notes.findAll();
  }
  
  public void removeNote(Long id) {
    notes.deleteById(id);
  }
  
  public Note updateNote(Long id, Note updated) {
    Note existing = notes.findById(id).get();
    existing.setTitle(updated.getTitle());
    existing.setContent(updated.getContent());
    return notes.save(existing);
  }
  
}
