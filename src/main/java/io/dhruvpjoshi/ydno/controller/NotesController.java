package io.dhruvpjoshi.ydno.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.dhruvpjoshi.ydno.model.Note;
import io.dhruvpjoshi.ydno.service.NotesService;

@RestController
@RequestMapping("/api")
public class NotesController {
  
  @Autowired
  private NotesService notes;
  
  @RequestMapping(value = "/notes", method = RequestMethod.POST)
  public Note newNote(@RequestBody Note note) {
    return notes.createNote(note);
  }
  
  @RequestMapping(value = "/notes", method = RequestMethod.GET)
  public List<Note> readNotes() {
    return notes.getNotes();
  }
  
  @RequestMapping(value = "/notes/{id}", method = RequestMethod.PUT)
  public Note updateNotes(@PathVariable(value = "id") Long id, @RequestBody Note updated) {
    return notes.updateNote(id, updated);
  }
  
  @RequestMapping(value = "/notes/{id}", method = RequestMethod.DELETE)
  public void deleteNote(@PathVariable(value = "id") Long id) {
    notes.removeNote(id);
  }
  
}
