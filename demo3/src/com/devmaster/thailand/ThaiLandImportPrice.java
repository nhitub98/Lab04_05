package com.devmaster.thailand;

import com.devmaster.Product;

public class ThaiLandImportPrice extends Product {
    private float taxImported;
    private float importPriceSupport;
    public ThaiLandImportPrice(String prodId, String prodName, String manufacturer, float producerPrice, float taxImported, float importPriceSupport) {
        super(prodId, prodName, manufacturer, producerPrice);
        this.taxImported = taxImported;
        this.importPriceSupport = importPriceSupport;
    }
    public ThaiLandImportPrice() {
    }
    public float getTaxImported() {
        return taxImported;
    }
    public void setTaxImported(float taxImported) {
        this.taxImported = taxImported;
    }
    public float getImportPriceSupport() {
        return importPriceSupport;
    }
    public void setImportPriceSupport(float importPriceSupport) {
        this.importPriceSupport = importPriceSupport;
    }
    public float calculateSalePrice() {
        float imported_price = getProducerPrice();
        float sale_price = (float) (imported_price + taxImported * imported_price - importPriceSupport * imported_price + 0.1 * (imported_price + taxImported * imported_price - importPriceSupport * imported_price));
        return sale_price;
    }
}