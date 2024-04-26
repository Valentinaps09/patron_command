package co.edu.uniquindio.poo;

public class ValidarProducto implements Comand {
    
    private Producto producto;

    public ValidarProducto(Producto producto) {
        this.producto = producto;
    }

    @Override
    public void ejecutar() {
        if (producto.getPrecio() < 100) {
            System.out.println("Producto válido");
        } else {
            System.out.println("Producto inválido");
        }
    }
}

