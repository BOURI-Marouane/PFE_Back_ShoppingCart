package ma.atos.shoppingcart.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "CartFidelityProduct")
@Data
public class CartFidelityProduct {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private long product_reference;

    private long quantity;

    private long product_fidelity_reference;

    @ManyToOne
    @JoinColumn(name = "fidelity_Cart_id")
    @JsonIgnore
    private FidelityCart fidelityCart;
}
