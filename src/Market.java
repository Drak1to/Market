public class Market {
    private String adress;
    private String name;
    private Product product;

    public Market(String adress, String name, Product product) {
        this.adress = adress;
        this.name = name;
        this.product = product;

    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @Override
    public String toString() {
        return "Market{" +
                "adress='" + adress + '\'' +
                ", name='" + name + '\'' +
                ", product=" + product +
                '}';
    }
}



