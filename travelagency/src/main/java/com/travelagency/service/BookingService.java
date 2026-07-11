package com.travelagency.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.travelagency.model.Booking;
import com.travelagency.repository.BookingRepository;

@Service
public class BookingService {
    
    @Autowired
    private BookingRepository bookingRepository;

    public Booking saveBooking(Booking booking) {
        return bookingRepository.save(booking);
    }

    public List<Booking> getAllBookings() {
        return bookingRepository.findAll();
    }

    public Optional<Booking> getBookingById(Long id) {
        return bookingRepository.findById(id);
    }

    public Booking updateBooking(Long id, Booking booking) {
        if(bookingRepository.existsById(id)) {
            booking.setId(id);
            return bookingRepository.save(booking);
        }
        return null;
    }

    public boolean deleteBooking(Long id) {
        if(bookingRepository.existsById(id)) {
            bookingRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
