package ma.atos.shoppingcart.web.responseDto;

import lombok.*;
import ma.atos.shoppingcart.model.CartProduct;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseNormalCart extends GeneralResponse
{

    private long customer_id;

    private double total;

    private List<CartProduct> cartProducts;

}
