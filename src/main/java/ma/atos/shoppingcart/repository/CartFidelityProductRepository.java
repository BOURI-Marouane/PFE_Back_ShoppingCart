package ma.atos.shoppingcart.repository;

import ma.atos.shoppingcart.model.CartFidelityProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CartFidelityProductRepository extends JpaRepository<CartFidelityProduct,Long> {
}
