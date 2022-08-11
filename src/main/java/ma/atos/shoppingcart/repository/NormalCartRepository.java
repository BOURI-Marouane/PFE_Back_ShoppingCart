package ma.atos.shoppingcart.repository;

import ma.atos.shoppingcart.model.NormalCart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface NormalCartRepository extends JpaRepository<NormalCart,Long> {
    @Query("SELECT n FROM NormalCart n where n.customer_id = :customer_id")
    NormalCart findAllByCustomer(@Param("customer_id") long customer_id);
}
