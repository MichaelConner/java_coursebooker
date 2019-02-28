package com.example.coursebooker.repositories.bookingRepositories;

import com.example.coursebooker.models.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookingRepository extends JpaRepository<Booking, Long>, BookingRepositoryCustom {

    List<Booking> findBookingsByDate(String date);

}
