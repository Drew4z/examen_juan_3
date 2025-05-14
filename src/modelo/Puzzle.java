package modelo;
import java.util.Scanner;

public abstract class Puzzle {
    private String idPuzzle;
    private String enunciado;
    private int puntos;
    private boolean resuelto;

// Constructor
    public Puzzle(String idPuzzle, String enunciado, int puntos, boolean resuelto) {
        this.idPuzzle = idPuzzle;
        this.enunciado = enunciado;
        this.puntos = puntos;
        this.resuelto = resuelto;
    }

// Getters
    public String getIdPuzzle() {
        return idPuzzle;
    }

    public String getEnunciado() {
        return enunciado;
    }

    public int getPuntos() {
        return puntos;
    }

    public boolean getIsResuelto() {
        return resuelto;
    }

// Setters
    public void setIdPuzzle(String idPuzzle) {
        this.idPuzzle = idPuzzle;
    }

    public void setEnunciado(String enunciado) {
        this.enunciado = enunciado;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public void setResuelto(boolean resuelto) {
        this.resuelto = resuelto;
    }

//Métodos
    public abstract boolean intentarResolver(Scanner scanner);

    @Override
    public String toString() {
        return "Descripción: " + enunciado + ", puntos: " + puntos;
    }

}




