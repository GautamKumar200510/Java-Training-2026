import java.util.Date;

public class Product {
    private int preid;
    private String pName;
    private Date dom;
    private String category;

    public Product(int preid, String pName, Date dom, String category) {
        super();
        this.preid = preid;
        this.pName = pName;
        this.dom = dom;
        this.category = category;
    }

    Product(int i, String milk, String drink) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public String toString() {
        return "Product [preid=" + preid + ", pName=" + pName + ", dom=" + dom + ", category=" + category + "]";
    }

}
