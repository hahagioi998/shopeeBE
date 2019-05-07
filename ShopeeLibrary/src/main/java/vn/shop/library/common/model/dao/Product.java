package vn.shop.library.common.model.dao;

import java.io.Serializable;

/**
 * Created by lttung on 4/22/2019.
 */
public class Product implements Serializable {
    /**
     *
     * */
    private static final long serialVersionUID = 1L;

//    private Integer productID;
    private String productCode;
    private String productName;
    private Float productPrice;
    private String productPicture;
    private String productDescription;
    private Integer categoryID_FK;

//    public Integer getProductID() {
//        return productID;
//    }
//
//    public void setProductID(Integer productID) {
//        this.productID = productID;
//    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Float getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(Float productPrice) {
        this.productPrice = productPrice;
    }

    public String getProductPicture() {
        return productPicture;
    }

    public void setProductPicture(String productPicture) {
        this.productPicture = productPicture;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public Integer getCategoryID_FK() {
        return categoryID_FK;
    }

    public void setCategoryID_FK(Integer categoryID_FK) {
        this.categoryID_FK = categoryID_FK;
    }
}
