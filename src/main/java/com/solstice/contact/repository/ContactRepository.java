package com.solstice.contact.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.solstice.contact.domain.Contact;

public interface ContactRepository extends CrudRepository<Contact, Long> {
	List<Contact> listContactsByEmail(@Param("email") String email);

	List<Contact> listContactsByPhoneNumber(@Param("phoneNumber") String phoneNumber);

	List<Contact> listContactsByCity(@Param("city") String city);

	List<Contact> listContactsByState(@Param("state") String state);

}
