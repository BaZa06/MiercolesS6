package ni.edu.uam;
import ni.edu.uam.servicios.ProductoServicio;

public class Main {
    public static void main(String[] args) {
        ProductoServicio productos = new ProductoServicio();

        productos.agregarProducto("Cafe", 40.0, 3);
        productos.agregarProducto("tajadas con queso", 60.0, 3);

        System.out.println("factura");
        System.out.println(productos.getProductos());
        System.out.println("Total pagar " + productos.getMonto());
    }
}
