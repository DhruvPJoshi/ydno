package io.dhruvpjoshi.ydno.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.dhruvpjoshi.ydno.model.Note;

@Repository
public interface NotesRepository extends JpaRepository<Note, Long> { }
