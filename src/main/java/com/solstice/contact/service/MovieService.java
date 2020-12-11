package com.solstice.contact.service;

import com.solstice.contact.domain.ContactMovie;
import com.solstice.contact.repository.ContactMovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {

    @Autowired
    private ContactMovieRepository contactMovieRepository;

    public Iterable<ContactMovie> listMoviesByContact(long contactId) {
        List<ContactMovie> list = contactMovieRepository.listMoviesByContact(contactId);
        return list;
    }
}
