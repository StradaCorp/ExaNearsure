INSERT INTO movie (movie_id,name) VALUES  (1,'Star Wars'),  (2,'The Fifth Element');

INSERT INTO address (address_id, street, unit, city, state, zip) VALUES  (1, 'Street', 'unit', 'city', 'state', 'zip');

INSERT INTO contact (contact_id, name, company, profile_image, email, birthdate, personal_phone_number, work_phone_number, address_address_id)
 VALUES  (1,'Clark Kent', 'company', 'profile_image', 'email', null, 'personal_phone_number', 'work_phone_number', 1);

INSERT INTO contact_movie (id, contact_id, movie_id, score, comments) VALUES  (1, 1, 2, 5, 'Best movie ever');