package ma.atos.shoppingcart.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class NormalCartDto {

    private long customer_id;

    private double total;
}
