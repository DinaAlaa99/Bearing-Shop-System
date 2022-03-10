/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bearingshop;

/**
 *
 * @author HP
 */
public class items {
    private String code, brand, supplier_name;
    private int available_quantity, original_quantity, min_limit;
    private double selling_price;
    
   
    public items(String code, String brand,  int available_quantity, int original_quantity, int min_limit, double selling_price,String supplier_name) {
        this.code = code;
        this.brand = brand;
        this.available_quantity = available_quantity;
        this.original_quantity = original_quantity;
        this.min_limit = min_limit;
        this.selling_price = selling_price;
        this.supplier_name = supplier_name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getSupplier_name() {
        return supplier_name;
    }

    public void setSupplier_name(String supplier_name) {
        this.supplier_name = supplier_name;
    }

    public int getAvailable_quantity() {
        return available_quantity;
    }

    public void setAvailable_quantity(int available_quantity) {
        this.available_quantity = available_quantity;
    }

    public int getOriginal_quantity() {
        return original_quantity;
    }

    public void setOriginal_quantity(int original_quantity) {
        this.original_quantity = original_quantity;
    }

    public int getMin_limit() {
        return min_limit;
    }

    public void setMin_limit(int min_limit) {
        this.min_limit = min_limit;
    }

    public double getSelling_price() {
        return selling_price;
    }

    public void setSelling_price(double selling_price) {
        this.selling_price = selling_price;
    }
    
}
