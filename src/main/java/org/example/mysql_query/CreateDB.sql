CREATE DATABASE movie_booking;

use movie_booking;

CREATE TABLE Ranks (
    rank_id INT AUTO_INCREMENT PRIMARY KEY,
    rank_name VARCHAR(255) NOT NULL,
    max_point INT NOT NULL,
    min_point INT NOT NULL
);

CREATE TABLE Users (
    user_id INT AUTO_INCREMENT PRIMARY KEY,
    role INT NOT NULL, -- (1: user, 2: admin)
    name VARCHAR(255) NOT NULL,
    password VARCHAR(255) NOT NULL,
    email VARCHAR(255) NOT NULL UNIQUE,
    phone VARCHAR(255) UNIQUE,
    is_verified BOOLEAN NOT NULL DEFAULT FALSE,
    rank_id INT NOT NULL,
    address VARCHAR(255) NOT NULL,
    point INT DEFAULT 0,
    FOREIGN KEY (rank_id) REFERENCES Ranks(rank_id)
);

CREATE TABLE Movies (
    movie_id INT AUTO_INCREMENT PRIMARY KEY,
    movie_name VARCHAR(255) NOT NULL,
    movie_description JSON,
    duration INT NOT NULL CHECK (duration > 0),
    poster VARCHAR(255) NOT NULL,
    release_date DATE NOT NULL,
    is_active BOOLEAN NOT NULL DEFAULT TRUE,
    synopsis VARCHAR(255) NOT NULL
);

CREATE TABLE Genres (
    genre_id INT AUTO_INCREMENT PRIMARY KEY,
    genre_name VARCHAR(255) NOT NULL UNIQUE
);


CREATE TABLE MovieGenres (
    movie_id INT NOT NULL,
    genre_id INT NOT NULL,
    PRIMARY KEY (movie_id, genre_id),
    FOREIGN KEY (movie_id) REFERENCES Movies(movie_id),
    FOREIGN KEY (genre_id) REFERENCES Genres(genre_id)
);

CREATE TABLE Cinemas (
    cinema_id INT AUTO_INCREMENT PRIMARY KEY,
    cinema_name VARCHAR(255) NOT NULL,
    address VARCHAR(255) NOT NULL,
    city VARCHAR(255) NOT NULL,
    map_url VARCHAR(255)
);

CREATE TABLE Halls (
    hall_id INT AUTO_INCREMENT PRIMARY KEY,
    cinema_id INT NOT NULL,
    hall_name VARCHAR(255) NOT NULL,
    total_seats INT NOT NULL CHECK (total_seats > 0),
    FOREIGN KEY (cinema_id) REFERENCES Cinemas(cinema_id)
);

CREATE TABLE SeatTypes (
    seat_type_id INT AUTO_INCREMENT PRIMARY KEY,
    seat_type_name VARCHAR(50) NOT NULL CHECK (seat_type_name IN ('standard', 'vip', 'couple')),
    price_multiplier DECIMAL(5,2) DEFAULT 1.0
);

CREATE TABLE Seats (
    seat_id INT AUTO_INCREMENT PRIMARY KEY,
    hall_id INT NOT NULL,
    seat_row VARCHAR(10) NOT NULL,
    seat_column VARCHAR(10) NOT NULL,
    seat_type_id INT NOT NULL,
    FOREIGN KEY (hall_id) REFERENCES Halls(hall_id),
    FOREIGN KEY (seat_type_id) REFERENCES SeatTypes(seat_type_id)
);

CREATE TABLE Showtimes (
    showtime_id INT AUTO_INCREMENT PRIMARY KEY,
    movie_id INT NOT NULL,
    hall_id INT NOT NULL,
    start_time DATETIME NOT NULL,
    end_time DATETIME NOT NULL,
    price DECIMAL(10,2) NOT NULL CHECK (price >= 0),
    FOREIGN KEY (movie_id) REFERENCES Movies(movie_id),
    FOREIGN KEY (hall_id) REFERENCES Halls(hall_id)
);

CREATE TABLE Bookings (
    booking_id INT AUTO_INCREMENT PRIMARY KEY,
    user_id INT NOT NULL,
    showtime_id INT NOT NULL,
    booking_status VARCHAR(20) NOT NULL CHECK (booking_status IN ('pending', 'paid', 'canceled')),
    booking_time DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (user_id) REFERENCES Users(user_id),
    FOREIGN KEY (showtime_id) REFERENCES Showtimes(showtime_id)
);

CREATE TABLE BookingSeats (
    booking_id INT NOT NULL,
    seat_id INT NOT NULL,
    PRIMARY KEY (booking_id, seat_id),
    FOREIGN KEY (booking_id) REFERENCES Bookings(booking_id),
    FOREIGN KEY (seat_id) REFERENCES Seats(seat_id)
);

CREATE TABLE PaymentTransationInfo (
    payment_id INT AUTO_INCREMENT PRIMARY KEY,
    booking_id INT NOT NULL,
    amount DECIMAL(10,2) NOT NULL CHECK (amount >= 0),
    status VARCHAR(20) NOT NULL CHECK (status IN ('Success', 'Fail', 'Pending')),
    FOREIGN KEY (booking_id) REFERENCES Bookings(booking_id)
);

CREATE TABLE UsersRatings (
    user_id INT NOT NULL,
    movie_id INT NOT NULL,
    stars INT NOT NULL CHECK (stars BETWEEN 1 AND 5),
    comment TEXT,
    PRIMARY KEY (user_id, movie_id),
    FOREIGN KEY (user_id) REFERENCES Users(user_id),
    FOREIGN KEY (movie_id) REFERENCES Movies(movie_id)
);

CREATE TABLE ResetTokens (
    token_id INT AUTO_INCREMENT PRIMARY KEY,
    token_code VARCHAR(255) NOT NULL,
    user_id INT NOT NULL,
    expires_at DATETIME NOT NULL,
    status BOOLEAN NOT NULL,
    FOREIGN KEY (user_id) REFERENCES Users(user_id)
);


