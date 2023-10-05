package TH3;

public class Main {
    public static void main(String[] args) {
        Category dm1 = new Category(1, "Quần");
        Category dm2 = new Category(2, "Áo");
        Product pd1 = new Product(1, "quần âu", 120000, dm1);
        Product pd2 = new Product(1, "quần jean", 150000, dm1);
        Product pd3 = new Product(1, "áo thun", 170000, dm2);
        Product pd4 = new Product(1, "áo sơ mi", 160000, dm2);
        System.out.println("Danh mục sản phẩm");
        pd1.display();
        pd2.display();
        pd3.display();
        pd4.display();
    }
}
