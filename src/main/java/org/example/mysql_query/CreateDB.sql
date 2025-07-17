CREATE DATABASE movie_booking;

use movie_booking;

CREATE TABLE Ranks (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    max_point INT NOT NULL,
    min_point INT NOT NULL
);

CREATE TABLE Users (
    id INT AUTO_INCREMENT PRIMARY KEY,
    role INT NOT NULL DEFAULT 1, -- (0: guest, 1: user, 2: admin)
    name VARCHAR(255) NOT NULL,
    password VARCHAR(255) NOT NULL,
    email VARCHAR(255) NOT NULL UNIQUE,
    address VARCHAR(255) NOT NULL,
    date_of_birth DATE NOT NULL,
    gender TINYINT NOT NULL, -- (0: Unknown, 1: Male, 2: Female)
    phone VARCHAR(255) NOT NULL UNIQUE,
    is_verified BOOLEAN NOT NULL DEFAULT FALSE,
    rank_id INT NOT NULL,
    point INT DEFAULT 0,
    FOREIGN KEY (rank_id) REFERENCES Ranks(id)
);

CREATE TABLE Requests (
    id INT AUTO_INCREMENT PRIMARY KEY NOT NULL,
    user_id INT NOT NULL,
    message TEXT NOT NULL,
    status INT NOT NULL DEFAULT '0', -- 0: Pending, 1: Resolved
    FOREIGN KEY (user_id) REFERENCES Users(id)
);

CREATE TABLE Movies (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    description JSON,
    duration INT NOT NULL CHECK (duration > 0),
    poster VARCHAR(255) NOT NULL,
    release_date DATE NOT NULL,
    is_active BOOLEAN NOT NULL DEFAULT TRUE
);

CREATE TABLE Genres (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL UNIQUE
);


CREATE TABLE MovieGenres (
    movie_id INT NOT NULL,
    genre_id INT NOT NULL,
    PRIMARY KEY (movie_id, genre_id),
    FOREIGN KEY (movie_id) REFERENCES Movies(id),
    FOREIGN KEY (genre_id) REFERENCES Genres(id)
);

CREATE TABLE Cinemas (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    address VARCHAR(255) NOT NULL,
    city VARCHAR(255) NOT NULL,
    map_url VARCHAR(255)
);

CREATE TABLE Halls (
    id INT AUTO_INCREMENT PRIMARY KEY,
    cinema_id INT NOT NULL,
    name VARCHAR(255) NOT NULL,
    total_seats INT NOT NULL CHECK (total_seats > 0),
    FOREIGN KEY (cinema_id) REFERENCES Cinemas(id)
);

CREATE TABLE SeatTypes (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(50) NOT NULL CHECK (name IN ('standard', 'vip', 'couple')),
    price_multiplier DECIMAL(5,2) DEFAULT 1.0
);

CREATE TABLE Seats (
    id INT AUTO_INCREMENT PRIMARY KEY,
    hall_id INT NOT NULL,
    seat_row VARCHAR(10) NOT NULL,
    seat_column VARCHAR(10) NOT NULL,
    seat_type_id INT NOT NULL,
    FOREIGN KEY (hall_id) REFERENCES Halls(id),
    FOREIGN KEY (seat_type_id) REFERENCES SeatTypes(id)
);

CREATE TABLE Showtimes (
    id INT AUTO_INCREMENT PRIMARY KEY,
    movie_id INT NOT NULL,
    hall_id INT NOT NULL,
    start_time DATETIME NOT NULL,
    end_time DATETIME NOT NULL,
    status INT NOT NULL DEFAULT 1, -- 0: Cancelled, 1: Available
    price DECIMAL(10,2) NOT NULL CHECK (price >= 0),
    FOREIGN KEY (movie_id) REFERENCES Movies(id),
    FOREIGN KEY (hall_id) REFERENCES Halls(id)
);

CREATE TABLE Bookings (
    id INT AUTO_INCREMENT PRIMARY KEY,
    user_id INT NOT NULL,
    showtime_id INT NOT NULL,
    status INT NOT NULL DEFAULT 0, -- 0: Pending, 1: Confirmed, 2: Cancelled, 3: Expired (Hết hạn giữ vé do quá thời gian thanh toán)
    created_at DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (user_id) REFERENCES Users(id),
    FOREIGN KEY (showtime_id) REFERENCES Showtimes(id)
);

CREATE TABLE BookingSeats (
    booking_id INT NOT NULL,
    seat_id INT NOT NULL,
    PRIMARY KEY (booking_id, seat_id),
    FOREIGN KEY (booking_id) REFERENCES Bookings(id),
    FOREIGN KEY (seat_id) REFERENCES Seats(id)
);

CREATE TABLE PaymentTransationInfo (
    id INT AUTO_INCREMENT PRIMARY KEY,
    booking_id INT NOT NULL,
    amount DECIMAL(10,2) NOT NULL CHECK (amount >= 0),
    status INT NOT NULL DEFAULT 0, -- 0: Pending, 1: Success, 2: Fail
    FOREIGN KEY (booking_id) REFERENCES Bookings(id)
);

CREATE TABLE Ratings (
    user_id INT NOT NULL,
    movie_id INT NOT NULL,
    stars INT NOT NULL CHECK (stars BETWEEN 1 AND 5),
    comment TEXT,
    PRIMARY KEY (user_id, movie_id),
    FOREIGN KEY (user_id) REFERENCES Users(id),
    FOREIGN KEY (movie_id) REFERENCES Movies(id)
);

CREATE TABLE ResetTokens (
    id INT AUTO_INCREMENT PRIMARY KEY,
    token VARCHAR(255) NOT NULL,
    user_id INT NOT NULL,
    expires_at DATETIME NOT NULL,
    status BOOLEAN NOT NULL,
    FOREIGN KEY (user_id) REFERENCES Users(id)
);


