package main;

import java.io.*;
import java.util.*;

public class EscapeRoomManager {
    private List<Puzzle> catalogoPuzzles;
    private double gananciaEconomicaTotal;

    public EscapeRoomManager() {
        this.catalogoPuzzles = new ArrayList<>();
        this.gananciaEconomicaTotal = 0.0;
        cargarDatos();
    }

    // Menú principal
    public void mostrarMenu() {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- MENÚ ESCAPE ROOM ---");
            System.out.println("1. Crear Puzzle");
            System.out.println("2. Iniciar Juego para Nuevo Jugador");
            System.out.println("3. Ver Catálogo de Puzzles");
            System.out.println("4. Salir");
            System.out.print("Selecciona una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    crearPuzzle(scanner);
                    break;
                case 2:
                    iniciarJuego(scanner);
                    break;
                case 3:
                    verCatalogoPuzzles();
                    break;
                case 4:
                    salir();
                    break;
                default:
                    System.out.println("Opción inválida. Intenta de nuevo.");
            }
        } while (opcion != 4);
    }
}