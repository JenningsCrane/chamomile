package ru.jenningc.chamomile.factories;

import org.springframework.stereotype.Component;
import ru.jenningc.chamomile.dto.ProductDto;
import ru.jenningc.chamomile.models.Product;

@Component
public class ProjectDtoFactory {

    public ProductDto makeProductDto(Product product) {
        return ProductDto.builder()
                .name(product.getName())
                .description(product.getDescription())
                .price(product.getPrice())
                .available(product.isAvailable())
                .build();
    }
}
