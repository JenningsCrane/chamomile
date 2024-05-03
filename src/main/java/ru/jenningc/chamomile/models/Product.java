package ru.jenningc.chamomile.models;

import lombok.*;

import java.util.Objects;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    private String name;
    private String description;
    private Double price;
    private Boolean available;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product product)) return false;
        return Double.compare(price, product.price) == 0 &&
                available == product.available &&
                name.equals(product.name) &&
                description.equals(product.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, price, available);
    }
}
