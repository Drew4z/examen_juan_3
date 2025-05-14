package modelo;
import java.util.Scanner;

public class PuzzleHabilidad extends Puzzle {
    private int intentosMaximos;
    private int intentosRealizados;

    public PuzzleHabilidad(String idPuzzle, String enunciado, int puntos, boolean resuelto, int intentosMaximos) {
        super(idPuzzle, enunciado, puntos, resuelto);
        this.intentosMaximos = intentosMaximos;
        this.intentosRealizados = 0;
    }

    @Override
    public boolean intentarResolver(Scanner scanner) {
        if (getIsResuelto()) {
            System.out.println("Este puzzle ya fue resuelto anteriormente.");
            return true;
        }

        if (intentosRealizados >= intentosMaximos) {
            System.out.println("No te quedan intentos para este juego.");
            return false;
        }

        intentosRealizados++;
        int numero = (int) (Math.random() * 10) + 1;

        if (numero > 6) {
            setResuelto(true);
            System.out.println("¡Resolviste el puzzle, felicidades !!");
            return true;
        } else {
            System.out.println("Fallaste el intento. Intentos restantes: " + (intentosMaximos - intentosRealizados));
            return false;
        }
    }

    @Override
    public String toString() {
        return "Selección: Puzzle de Habilidad"+ ", Intentos restantes: "+(intentosMaximos - intentosRealizados) + super.toString();

    }
}
