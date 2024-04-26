package co.edu.uniquindio.poo;

public class App {
    public static void main(String[] args) {
        Producto p = new Producto(1, "tablet", 100);

        // Crear comandos
        Comand validar = new ValidarProducto(p);
        Comand enviarCorreo = new TareaEnvioCorreo(p);

        // Ejecutar comandos
        GestorTareas gt = new GestorTareas();
        gt.ejecutar(validar);
        gt.ejecutar(enviarCorreo);
    }
    
}
