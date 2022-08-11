package ma.atos.shoppingcart.repository;

import ma.atos.shoppingcart.model.FidelityCart;
import ma.atos.shoppingcart.model.NormalCart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface FidelityCartRepository extends JpaRepository<FidelityCart,Long> {
    @Query("SELECT n FROM FidelityCart n where n.customer_id = :customer_id")
    FidelityCart findAllByCustomer(@Param("customer_id") long customer_id);
}
