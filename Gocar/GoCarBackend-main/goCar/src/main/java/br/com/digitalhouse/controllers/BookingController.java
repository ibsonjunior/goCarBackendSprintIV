package br.com.digitalhouse.controllers;

import br.com.digitalhouse.dtos.BookingDto;
import br.com.digitalhouse.services.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping(value = "/bookings")
public class BookingController {

    @Autowired
    BookingService bookingService;

    @GetMapping
    public ResponseEntity<List<BookingDto>> searchBooking() {
        List<BookingDto> bookingDtoList = bookingService.searchAll();
        return ResponseEntity.ok().body(bookingDtoList);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<BookingDto> searchBookingById(@PathVariable Integer id) {
        BookingDto bookingDto = bookingService.searchById(id);
        return ResponseEntity.ok().body(bookingDto);
    }

    @GetMapping(value = "/user-id/{userId}")
    public ResponseEntity<List<BookingDto>> searchBookingsByUserId(@PathVariable Long userId) {
        List<BookingDto> bookingDtoList = bookingService.searchBookingsByUserId(userId);
        return ResponseEntity.ok().body(bookingDtoList);
    }

    @PostMapping
    public ResponseEntity<BookingDto> insertBooking(@RequestBody BookingDto bookingDto) {
        bookingDto = bookingService.insert(bookingDto);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
                .buildAndExpand(bookingDto.getId()).toUri();
        return ResponseEntity.created(uri).body(bookingDto);
    }

}
