package ma.atos.shoppingcart.repository;

import ma.atos.shoppingcart.model.CartProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CartProductRepository extends JpaRepository<CartProduct,Long> {
}
