-- 1. Ranks
INSERT INTO Ranks (rank_name, max_point, min_point) VALUES
('Bronze', 999, 0),
('Silver', 1999, 1000),
('Gold', 99999, 2000);

-- 2. Users
INSERT INTO Users (role, name, password, email, phone, is_verified, rank_id, address, point) VALUES
(1, 'Alice', 'hashed_password1', 'alice@example.com', '0123456789', TRUE, 1, '123 A Street', 850),
(2, 'Bob Admin', 'hashed_password2', 'admin@example.com', NULL, TRUE, 3, 'Admin HQ', 5000);

-- 3. Movies
INSERT INTO Movies (movie_name, movie_description, duration, poster, release_date, is_active, synopsis) VALUES
('Interstellar', 
 '{"director": "Christopher Nolan", "actors": ["Matthew McConaughey", "Anne Hathaway", "Jessica Chastain"]}',
 169, 'poster_url.jpg', '2014-11-07', TRUE, 'A team travels through a wormhole in search of a new home for humanity.');

-- 4. Genres
INSERT INTO Genres (genre_name) VALUES
('Sci-Fi'),
('Drama'),
('Adventure');

-- 5. MovieGenres
INSERT INTO MovieGenres (movie_id, genre_id) VALUES
(1, 1), -- Interstellar - Sci-Fi
(1, 2), -- Interstellar - Drama
(1, 3); -- Interstellar - Adventure

-- 6. Cinemas
INSERT INTO Cinemas (cinema_name, address, city, map_url) VALUES
('CGV Vincom', '72 Le Thanh Ton', 'Ho Chi Minh', 'https://maps.app.goo.gl/avfUoyqqcSPpvfGVA');

-- 7. Halls
INSERT INTO Halls (cinema_id, hall_name, total_seats) VALUES
(1, 'Hall A', 120);

--  8. SeatTypes
INSERT INTO SeatTypes (seat_type_name, price_multiplier) VALUES
('standard', 1.0),
('vip', 1.2),
('couple', 1.5);

-- 9. Seats
INSERT INTO Seats (hall_id, seat_row, seat_column, seat_type_id) VALUES
(1, 'A', '1', 1),
(1, 'A', '2', 1),
(1, 'B', '1', 2),
(1, 'B', '2', 3);

-- 10. Showtimes
INSERT INTO Showtimes (movie_id, hall_id, start_time, end_time, price) VALUES
(1, 1, '2025-07-20 18:30:00', '2025-07-20 21:00:00', 90000);

-- 11. Bookings
INSERT INTO Bookings (user_id, showtime_id, booking_status) VALUES
(1, 1, 'Pending');

-- 12. BookingSeats
INSERT INTO BookingSeats (booking_id, seat_id) VALUES
(1, 1),
(1, 2);


-- 13. PaymentTransationInfo
INSERT INTO PaymentTransationInfo (booking_id, amount, status) VALUES
(1, 180000, 'Pending');


-- 14. UsersRatings
INSERT INTO UsersRatings (user_id, movie_id, stars, comment) VALUES
(1, 1, 5, 'Tuyệt vời! Phim rất cảm động và ý nghĩa.');


-- 15. ResetTokens
INSERT INTO ResetTokens (token_code, user_id, expires_at, status) VALUES
('abc123xyz', 1, '2026-07-20 23:59:59', TRUE);


