package br.com.digitalhouse.repositories;

import br.com.digitalhouse.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

    List<Product> findAllProductsByCategoryId(Integer categoryId);

    List<Product> findAllProductsByCityId(Integer cityId);
    //Filter dates
    @Query(
            value = "SELECT * FROM product p WHERE p.ID NOT IN (SELECT id_product FROM booking ad WHERE ad.inital_day <= ?1 and ad.final_day >= ?2)",
            nativeQuery = true
    )
    List<Product> findProductByDate(LocalDate dateEnd, LocalDate dateStart);


}
























//    @Query(value = "SELECT * FROM products p " +
//            "INNER JOIN bookings b ON ((p.id <> b.id_produto) OR (p.id = b.id_produto " +
//            "WHERE (CONVERT(?1, DATE) < b.inicio_reserva AND CONVERT(?2, DATE) < b.inicio_reserva) OR " +
//            "(CONVERT(?1, DATE) > b.fim_reserva AND CONVERT(?2, DATE) > b.fim_reserva)))",
//            nativeQuery = true)
//    List<Product> findByDatas(String dataInicio, String dataFim);