package demo.productmicrosevice.response;

import lombok.Value;

import java.io.Serializable;

/**
 * DTO for {@link demo.productmicrosevice.model.Product}
 */
@Value
public class ProducResponse implements Serializable {
    String title;
    String description;
    double price;
    String manufacturer;
    String imageUrl;
}
