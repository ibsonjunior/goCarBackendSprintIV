package br.com.digitalhouse.repositories;

import br.com.digitalhouse.entities.Booking;
import br.com.digitalhouse.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookingRepository extends JpaRepository<Booking, Integer> {

    //Filter User ID
    List<Booking> findAllBookingsByUserId(Long userId);
}
