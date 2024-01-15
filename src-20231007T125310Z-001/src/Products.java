/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class Products {
    private int id,purchasequantity;
    private float sellingprice;
    private String prodname,description,category;

    public Products() {
        this.id = 0;
        this.purchasequantity = 0;
        this.sellingprice = 0;
        this.category = "";
        this.prodname = "";
        this.description = "";
    }

    
    
    public Products(int id, int purchasequantity, float sellingprice, String buyingprice, String prodname, String description) {
        this.id = id;
        this.purchasequantity = purchasequantity;
        this.sellingprice = sellingprice;
        this.category = category;
        this.prodname = prodname;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPurchasequantity() {
        return purchasequantity;
    }

    public void setPurchasequantity(int purchasequantity) {
        this.purchasequantity = purchasequantity;
    }

    public float getSellingprice() {
        return sellingprice;
    }

    public void setSellingprice(float sellingprice) {
        this.sellingprice = sellingprice;
    }

    public String getcategory() {
        return category;
    }

    public void setcategory(String category) {
        this.category = category;
    }

    public String getProdname() {
        return prodname;
    }

    public void setProdname(String prodname) {
        this.prodname = prodname;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "products{" + "id=" + id + ", purchasequantity=" + purchasequantity + ", sellingprice=" + sellingprice + ", category=" + category + ", prodname=" + prodname + ", description=" + description + '}';
    }
    
    
}
