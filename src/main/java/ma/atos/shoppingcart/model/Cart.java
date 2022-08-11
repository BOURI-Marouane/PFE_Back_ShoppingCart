package ma.atos.shoppingcart.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "Cart")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "type_cart")
@DiscriminatorValue("Cart")
@Data
public abstract class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private long customer_id;



}
