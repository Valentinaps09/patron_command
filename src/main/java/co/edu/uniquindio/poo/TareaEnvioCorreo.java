package co.edu.uniquindio.poo;

public class TareaEnvioCorreo implements Comand{

    private Producto producto;

    public TareaEnvioCorreo(Producto producto) {
        this.producto = producto;
    }

    @Override
    public void ejecutar() {
        System.out.println(producto.getNombre() + " enviado por correo");
    }
    
}
