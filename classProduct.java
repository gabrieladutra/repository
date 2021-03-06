package src;

public class Product {
    private Integer id;
    private String name;
    private Double price;

    public Product(String name, Double price) {
        Integer newId = ProductRepository.getInstance().size + 1;
        this.id = newId;
        this.name = name;
        this.price = price;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    public void setName(String newName) {
        name = newName;
    }

    public void setPrice(Double newPrice) {
        price = newPrice;
    }

    @Override
    public String toString() {
        return id.toString() + "-" + name + "-" + price;
    }

    public Product() {

    }
}