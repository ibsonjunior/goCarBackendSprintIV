package br.com.digitalhouse.repositories;


import br.com.digitalhouse.entities.ERole;
import br.com.digitalhouse.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);
}
