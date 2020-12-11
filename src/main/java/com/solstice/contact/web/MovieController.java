package com.solstice.contact.web;

import com.solstice.contact.domain.ContactMovie;
import com.solstice.contact.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SuppressWarnings("rawtypes")
@RestController
@RequestMapping("movie")
public class MovieController {

    @Autowired
    private MovieService movieService;

    @GetMapping("{contactId}")
    public Iterable<ContactMovie> listMoviesByContact(@PathVariable("contactId") Long contactId) {
        System.out.println("In listMoviesByContact");
        System.out.println("contactId : " + contactId);
        Iterable<ContactMovie> contactMovies = movieService.listMoviesByContact(contactId);

        contactMovies.forEach(System.out::println);

        return contactMovies;
    }
}
