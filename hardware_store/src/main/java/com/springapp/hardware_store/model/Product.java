package com.springapp.hardware_store.model;
import javax.persistence.*;
import java.util.List;

/**
 * Created by radud on 22/11/2015.
 */
@Entity
@Table(name = "product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "product_name")
    private String name;
    @ManyToOne
    @JoinColumn(name = "category_id", nullable = false)
    private ProductCategory category;
    @Column(name = "description")
    private String description;
    @Column(name = "stock")
    private int stock;
    @Column(name = "price")
    private double price;
    @Column(name = "image_source")
    private String imageSource;
    @OneToMany
    @JoinColumn(name = "product_id")
    List<PriceItem> priceItems;

    public Product() {
    }

    public Product(String name, ProductCategory category, String description, int stock, double price, String imageSource) {
        this.name = name;
        this.category = category;
        this.description = description;
        this.stock = stock;
        this.price = price;
        this.imageSource = imageSource;
    }

    public List<PriceItem> getPriceItems() {
        return priceItems;
    }

    public void setPriceItems(List<PriceItem> priceItems) {
        this.priceItems = priceItems;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ProductCategory getCategory() {
        return category;
    }

    public void setCategory(ProductCategory category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getImageSource() {
        return imageSource;
    }

    public void setImageSource(String imageSource) {
        this.imageSource = imageSource;
    }
}
