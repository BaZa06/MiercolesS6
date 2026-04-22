package ni.edu.uam.servicios;

import ni.edu.uam.interfaces.ProductoInterfaces;
import ni.edu.uam.modelos.Producto;

import java.util.ArrayList;
import java.util.List;


    public class ProductoServicio implements ProductoInterfaces{

        private List<Producto> productos;

        public ProductoServicio() {
            this.productos = new ArrayList<>();

        }

        @Override
        public void agregarProducto(String nombre, double precio, int cantidad) {
            this.productos.add(new Producto(nombre, precio, cantidad));
        }

        @Override
        public List<Producto> getProductos() {
            return productos;
        }

        public double getMonto(){
            double monto=0, total=0;
            for(Producto producto : productos)
            {
                total = producto.getCantidad() * producto.getPrecio();
                monto += total;
            }
            return monto;
        }
    }

