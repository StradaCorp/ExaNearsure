package com.solstice.contact.repository;

import com.solstice.contact.domain.ContactMovie;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ContactMovieRepository  extends CrudRepository<ContactMovie, Long> {

    List<ContactMovie> listMoviesByContact(@Param("contactId") long contactId);

}
