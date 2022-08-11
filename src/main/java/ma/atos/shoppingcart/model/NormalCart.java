package ma.atos.shoppingcart.model;

import lombok.Data;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
@DiscriminatorValue("NormalCart")
@Data
public class NormalCart extends Cart{

    private double total;

    @OneToMany(mappedBy = "normalCart")
    private List<CartProduct> cartProducts;
}
