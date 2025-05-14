package modelo;
import java.util.List;
import java.util.Scanner;

public class Jugador {
    String nombreJugador;
    int puntuacionTotal;
    List<Puzzle> puzzleDisponibles;
// Constructor
    public Jugador(String nombreJugador, List<Puzzle> puzzleDisponibles){
        this.nombreJugador = nombreJugador;
        this.puntuacionTotal = 0;
        this.puzzleDisponibles = puzzleDisponibles;
    }
//Metodos
    public void jugar(){
        Scanner scanner = new Scanner(System.in);
        while (true) {
            boolean hayPendientes = false;
            for (Puzzle p : puzzlesDisponibles) {
                if (!p.getIsResuelto()) {
                    hayPendientes = true;
                    break;
                }
            }
            if (!hayPendientes) {
                break;
            }

            System.out.println("Puzzles disponibles para resolver:");
            for (Puzzle puzzle : puzzlesDisponibles) {
                if (!puzzle.getIsResuelto()) {
                    System.out.println("Id: " + puzzle.getIdPuzzle() + ", enunciado: " + puzzle.toString());
                }
            }

            System.out.print("Ingresa el ID del puzzle que deseas intentar: ");
            String idSeleccionado = scanner.nextLine();

            // Buscar puzzle
            Puzzle puzzleSeleccionado = null;
            for (Puzzle p : puzzlesDisponibles) {
                if (p.getIdPuzzle().equalsIgnoreCase(idSeleccionado)) {
                    puzzleSeleccionado = p;
                    break;
                }
            }

            // Validaciones
            if (puzzleSeleccionado == null) {
                System.out.println("ID no válido. Intenta nuevamente.");
                continue;
            }

            if (puzzleSeleccionado.getIsResuelto()) {
                System.out.println("Este puzzle ya está resuelto. Elige otro.");
                continue;
            }

            // Intentar resolver
            boolean resuelto = puzzleSeleccionado.intentarResolver(scanner);
        }
    }
}



