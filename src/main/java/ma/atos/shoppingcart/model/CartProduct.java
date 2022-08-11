package ma.atos.shoppingcart.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "CartProduct")
@Data
public class CartProduct{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private long product_reference;

    private long quantity;

    @ManyToOne
    @JoinColumn(name = "normal_Cart_id")
    @JsonIgnore
    private NormalCart normalCart;



}
