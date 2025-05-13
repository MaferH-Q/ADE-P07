package Actividades;

public class ExceptionIsEmpty extends Exception {
    public ExceptionIsEmpty(String msg) {
        super(msg); // Llama al constructor de la clase Exception con el mensaje
    }

    public ExceptionIsEmpty() {
        super(); // Constructor vacío
    }
}