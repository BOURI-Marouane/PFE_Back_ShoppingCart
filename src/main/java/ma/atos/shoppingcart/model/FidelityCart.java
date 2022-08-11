package ma.atos.shoppingcart.model;

import lombok.Data;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
@DiscriminatorValue("FidelityCart")
@Data
public class FidelityCart extends Cart{
    private long total_points;

    @OneToMany(mappedBy = "fidelityCart")
    private List<CartFidelityProduct> cartFidelityProducts;
}
