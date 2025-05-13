package Actividades;
public class ItemNoFound extends Exception {
    public ItemNoFound(String msg) {
        super(msg); // Llama al constructor de la clase Exception con el mensaje
    }

    public ItemNoFound() {
        super(); // Constructor vacío
    }
}