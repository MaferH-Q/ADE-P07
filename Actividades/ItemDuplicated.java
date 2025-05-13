package Actividades;


public class ItemDuplicated extends Exception {
    // Constructor con mensaje de error
    public ItemDuplicated(String msg) {
        super(msg); // Llama al constructor de la clase Exception con el mensaje
    }

    // Constructor sin mensaje de error
    public ItemDuplicated() {
        super(); // Llama al constructor vacío de la clase Exception
    }
}