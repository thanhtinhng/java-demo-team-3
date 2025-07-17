-- 1. Ranks
INSERT INTO Ranks (name, max_point, min_point) VALUES
('Bronze', 999, 0),
('Silver', 1999, 1000),
('Gold', 99999, 2000);

-- 2. Users
INSERT INTO Users (role, name, password, email, address, date_of_birth, gender, phone, is_verified, rank_id, point) VALUES
(1, 'Alice', 'hashed_password1', 'alice@example.com', '123 A Street', '2004-07-20', 1, '0123456789', TRUE, 1, 850),
(2, 'Bob Admin', 'hashed_password2', 'admin@example.com', 'Admin HQ', '2004-07-20', 1, '0123456799', TRUE, 3, 5000);

-- Requests
INSERT INTO Requests (user_id, message, status) VALUES
(1, 'Trợ giúp đặt vé', 0);

-- 3. Movies
INSERT INTO Movies (name, description, duration, poster, release_date, is_active) VALUES
('Interstellar', 
 '{"director": "Christopher Nolan", "actors": ["Matthew McConaughey", "Anne Hathaway", "Jessica Chastain"], "synopsis": "A team travels through a wormhole in search of a new home for humanity."}',
 169, 'poster_url.jpg', '2014-11-07', TRUE);

-- 4. Genres
INSERT INTO Genres (name) VALUES
('Sci-Fi'),
('Drama'),
('Adventure');

-- 5. MovieGenres
INSERT INTO MovieGenres (movie_id, genre_id) VALUES
(1, 1), -- Interstellar - Sci-Fi
(1, 2), -- Interstellar - Drama
(1, 3); -- Interstellar - Adventure

-- 6. Cinemas
INSERT INTO Cinemas (name, address, city, map_url) VALUES
('CGV Vincom', '72 Le Thanh Ton', 'Ho Chi Minh', 'https://maps.app.goo.gl/avfUoyqqcSPpvfGVA');

-- 7. Halls
INSERT INTO Halls (cinema_id, name, total_seats) VALUES
(1, 'Hall A', 120);

--  8. SeatTypes
INSERT INTO SeatTypes (name, price_multiplier) VALUES
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
INSERT INTO Showtimes (movie_id, hall_id, start_time, end_time, status, price) VALUES
(1, 1, '2025-07-20 18:30:00', '2025-07-20 21:00:00', 1, 90000);

-- 11. Bookings
INSERT INTO Bookings (user_id, showtime_id, status) VALUES
(1, 1, 1);

-- 12. BookingSeats
INSERT INTO BookingSeats (booking_id, seat_id) VALUES
(1, 1),
(1, 2);


-- 13. PaymentTransationInfo
INSERT INTO PaymentTransationInfo (booking_id, amount, status) VALUES
(1, 180000, 1);


-- 14. Ratings
INSERT INTO Ratings (user_id, movie_id, stars, comment) VALUES
(1, 1, 5, 'Tuyệt vời! Phim rất cảm động và ý nghĩa.');


-- 15. ResetTokens
INSERT INTO ResetTokens (token, user_id, expires_at, status) VALUES
('abc123xyz', 1, '2026-07-20 23:59:59', TRUE);


