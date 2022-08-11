package ma.atos.shoppingcart.exception;

import lombok.Data;

@Data
public class NormalCartException extends Exception{
    public NormalCartException(String message)
    {
        super(message);
    }
}
