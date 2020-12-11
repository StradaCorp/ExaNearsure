package com.solstice.contact.domain;

import javax.persistence.*;

@Entity
@NamedQueries({ @NamedQuery(query = "FROM ContactMovie c WHERE c.contact.contactId = :contactId", name = "ContactMovie.listMoviesByContact") })
public class ContactMovie {

    @Id
    @GeneratedValue
    private Long id;
    @ManyToOne
    @JoinColumn(name = "contact_id")
    private Contact contact;

    @ManyToOne
    @JoinColumn(name = "movie_id")
    private Movie movie;

    private int score;
    private String comments;

    @Override
    public String toString() {
        return "ContactMovie{" +
                "id=" + id +
                ", contact=" + contact +
                ", movie=" + movie +
                ", score=" + score +
                ", comments='" + comments + '\'' +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }
}
