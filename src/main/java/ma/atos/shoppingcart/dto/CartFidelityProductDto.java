package ma.atos.shoppingcart.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@ToString
public class CartFidelityProductDto {

    private long product_reference;

    private long quantity;

    private long product_fidelity_reference;

    private long fidelityCart;

}
