package br.com.digitalhouse.services;

import br.com.digitalhouse.dtos.BookingDto;
import br.com.digitalhouse.dtos.ProductDtoForBooking;
import br.com.digitalhouse.dtos.ProductForImageDto;
import br.com.digitalhouse.dtos.UserForBookingDto;
import br.com.digitalhouse.entities.Booking;
import br.com.digitalhouse.entities.Product;
import br.com.digitalhouse.entities.User;
import br.com.digitalhouse.repositories.BookingRepository;
import br.com.digitalhouse.repositories.ProductRepository;
import br.com.digitalhouse.repositories.UserRepository;
import br.com.digitalhouse.services.exceptions.DatabaseCarException;
import br.com.digitalhouse.services.exceptions.EntityCarNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class BookingService {
    @Autowired
    BookingRepository bookingRepository;

    @Autowired
    ProductRepository productRepository;

    @Autowired
    UserRepository userRepository;

    // SearchAll
    @Transactional(readOnly = true)
    public List<BookingDto> searchAll() {
        try {
            List<Booking> BookinList = bookingRepository.findAll();
            return BookinList.stream().map(x -> new BookingDto(x)).collect(Collectors.toList());
        } catch (EntityNotFoundException e) {
            throw new DatabaseCarException(
                    "Registros não encontrados!"
            );
        }
    }

    // SearchById
    @Transactional(readOnly = true)
    public BookingDto searchById(Integer id) {
        Optional<Booking> objectImage = bookingRepository.findById(id);
        Booking booking = objectImage.orElseThrow(() -> new EntityCarNotFoundException("Registro: " + id + " não encontrado!"));
        return new BookingDto(booking);
    }

    // SearchByUserId
    @Transactional(readOnly = true)
    public List<BookingDto> searchBookingsByUserId(Long userId) {
        List<Booking> bookingList = bookingRepository.findAllBookingsByUserId(userId);
        List<BookingDto> BookingDtoList = new ArrayList<>();
        for (Booking booking : bookingList) {
            BookingDtoList.add(new BookingDto(booking));
        }
        return BookingDtoList;
    }

    // Insert
    @Transactional
    public BookingDto insert(BookingDto bookingDtoDto) {
        Booking booking = new Booking();
        copyDtoForEntity(bookingDtoDto, booking);
        booking = bookingRepository.save(booking);
        return new BookingDto(booking);
    }

    private void copyDtoForEntity(BookingDto bookingDto, Booking booking) {
        booking.setInitialTime(bookingDto.getInitialTime());
        booking.setInitalDay(bookingDto.getInitalDay());
        booking.setFinalDay(bookingDto.getFinalDay());

        ProductDtoForBooking productDtoForBooking = bookingDto.getProduct();
        Product product = productRepository.getReferenceById( productDtoForBooking.getId());
        booking.setProduct(product);

        UserForBookingDto userForBookingDto = bookingDto.getUser();
        User user = userRepository.getReferenceById(userForBookingDto.getId());
        booking.setUser(user);
    }
}
