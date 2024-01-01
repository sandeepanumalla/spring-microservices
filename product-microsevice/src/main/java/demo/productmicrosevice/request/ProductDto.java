package demo.productmicrosevice.request;

import demo.productmicrosevice.model.Product;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Value;

import java.io.Serializable;

/**
 * DTO for {@link Product}
 */
@Value
public class ProductDto implements Serializable {
    @NotEmpty(message = "please provide the title of the product")
    @NotBlank
    String title;

    @Size
    String description;

    @Min(message = "the price for the products should be atleast 2 dollars", value = 2)
    double price;

    @NotEmpty(message = "please provide the manufacturer")
    String manufacturer;

    String imageUrl;

    @Min(message = "please provide the stock quantities of 2", value = 2)
    int stockQuantity;
}
