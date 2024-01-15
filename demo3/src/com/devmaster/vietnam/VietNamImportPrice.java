package com.devmaster.vietnam;

import com.devmaster.Product;

public class VietNamImportPrice extends Product {
    private float taxImported; // thue nhap khau
    private float importedPrice;

    public VietNamImportPrice(float taxImported, float importedPrice) {
        this.taxImported = taxImported;
        this.importedPrice = importedPrice;
    }
    public VietNamImportPrice() {
    }
    public float getTaxImported() {
        return taxImported;
    }
    public void setTaxImported(float taxImported) {
        this.taxImported = taxImported;
    }
    public float getImportedPrice() {
        return importedPrice;
    }
    public void setImportedPrice(float importedPrice) {
        this.importedPrice = importedPrice;
    }
    public float calculateSalePrice() {
        float imported_price = getImportedPrice();
        double sale_price = imported_price + taxImported * imported_price + 0.1 * (imported_price + taxImported * imported_price) + 0.5 * imported_price;
        return (float) sale_price;

    }
}
