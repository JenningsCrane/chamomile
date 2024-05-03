package ru.jenningc.chamomile.data;

import lombok.Getter;
import ru.jenningc.chamomile.models.Product;

import java.util.HashSet;

@Getter
public class ProductsData {
    private HashSet<Product> productsMap;
}

