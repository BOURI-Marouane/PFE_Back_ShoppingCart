package ma.atos.shoppingcart.web.responseDto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ma.atos.shoppingcart.model.CartFidelityProduct;

import javax.persistence.OneToMany;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ResponseFidelityCart extends GeneralResponse
{
    private long customer_id;

    private long total_points;

    private List<CartFidelityProduct> cartFidelityProducts;
}
