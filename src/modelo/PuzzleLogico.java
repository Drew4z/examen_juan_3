package modelo;
import java.util.Scanner;

public class PuzzleLogico extends Puzzle{
    private String respuestaCorrecta;

// Constructor
    public PuzzleLogico(String idPuzzle, String enunciado, int puntos, boolean resultado, String respuestaCorrecta){
        super(idPuzzle,enunciado,puntos,resultado);
        this.respuestaCorrecta = respuestaCorrecta;
    }
    @Override
    public boolean intentarResolver(Scanner scanner) {
        System.out.println("Ingresa tu respuesta:");
        String respuestaUsuario = scanner.nextLine();
        if (respuestaUsuario.equalsIgnoreCase(respuestaCorrecta)) {
            setResuelto(true);
            System.out.println("Tu respuesta es... Correcta!!");
            return true;
        } else {
            System.out.println("Respuesta incorrecta, vuelve a intentarlo");
            return false;
        }
    }

    @Override
    public String toString() {
        return "Selección: Puzzle lógico" + super.toString();
    }
}