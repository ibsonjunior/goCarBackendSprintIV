package br.com.digitalhouse.dtos;

import br.com.digitalhouse.entities.User;

import java.io.Serializable;

public class UserForBookingDto implements Serializable {
    public static final long serialVersionUID = 1L;

    private Long id;

    public UserForBookingDto() {
    }

    public UserForBookingDto(Long id) {
        this.id = id;

    }

    public UserForBookingDto(User user) {
        this.id = user.getId();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}
