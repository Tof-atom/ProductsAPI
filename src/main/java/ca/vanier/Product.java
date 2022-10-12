package ca.vanier;

class Product {
    private String name;
    private String title;
    private int id;
    private double price;

    public Product(String name, String title, int id, double price) {
        this.name = name;
        this.title = title;
        this.id = id;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product [name=" + name + ", title=" + title + ", id=" + id + ", price=" + price + "]";
    }

}