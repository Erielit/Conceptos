/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author CC-7
 */
public class Test {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Jugador jugador = null;
        List<Jugador> jugadores = new ArrayList<>();
        jugadores.add(new Jugador("Mike", 0, 0));
        jugadores.add(new Jugador("Angel", 0, 0));
        int ganador, posicion;
        double puntuacion;
        boolean bandera = true;
        String opcion = "";
        String[][] gato = new String[3][3];
        gato = inicializar(gato);
        while (bandera) {
            System.out.println("1. Registrar jugador");
            System.out.println("2. Jugar al Gato");
            System.out.println("3. Salir");
            System.out.println("Seleccionar opción...");
            do {
                opcion = sc.next();
                if (!opcion.equals("1")
                        && !opcion.equals("2") && !opcion.equals("3")) {
                    System.out.println("Opción incorrecta");
                }
            } while (!opcion.equals("1")
                    && !opcion.equals("2") && !opcion.equals("3"));
            System.out.println("===========================================");
            switch (opcion) {
                case "1":
                    jugador = new Jugador(sc.next(), 0.0, 0);
                    jugadores.add(jugador);
                    System.out.println("Jugador registrado correctamente");
                    break;
                case "2":
                    if (jugadores.size() < 2) {
                        System.out.println("El juego no puede comenzar");
                    } else {
                        int jugadorSeleccionado = -1, dosJugadores;
                        Jugador primero = null;
                        Jugador segundo = null;
                        do {
                            int cont = 1;
                            for (Jugador jugadore : jugadores) {
                                System.out.println(cont + " - Nombre: " + jugadore.getNombre());
                                cont++;
                            }
                            jugadorSeleccionado = sc.nextInt();
                            if (jugadorSeleccionado > 0 && jugadorSeleccionado <= jugadores.size()) {
                                if (primero == null) {
                                    primero = jugadores.get(jugadorSeleccionado - 1);
                                } else {
                                    if (!primero.equals(jugadores.get(jugadorSeleccionado - 1))) {
                                        segundo = jugadores.get(jugadorSeleccionado - 1);
                                    } else {
                                        System.out.println("Jugador ya seleccionado");
                                    }
                                }
                            } else {
                                System.out.println("Jugador no encontrado");
                            }
                            if (primero != null && segundo != null) {
                                break;
                            }
                        } while (true);
                        tablero(gato);
                        boolean finalJuego = true, tiradaCorrecta = true;
                        int posicionSeleccionada = -1, tiradas = 1;
                        String valor = "";
                        while (finalJuego) {
                            do {
                                System.out.println("1 | 2 | 3");
                                System.out.println("4 | 5 | 6");
                                System.out.println("7 | 8 | 9");
                                System.out.println("Seleccione una posición");
                                posicionSeleccionada = sc.nextInt();
//                                if (tiradaCorrecta(posicionSeleccionada)) {
                                switch (posicionSeleccionada) {
                                    case 1:
                                        valor = gato[0][0];
                                        if (valor.equals(" ")) {
                                            gato[0][0] = ((tiradas % 2 == 0) ? "O" : "X");
                                            tiradas++;
                                            tablero(gato);
                                        } else {
                                            System.out.println("Posición ocupada");
                                        }
                                        break;
                                    case 2:
                                        valor = gato[0][1];
                                        if (valor.equals(" ")) {
                                            gato[0][1] = ((tiradas % 2 == 0) ? "O" : "X");
                                            tiradas++;
                                            tablero(gato);
                                        } else {
                                            System.out.println("Posición ocupada");
                                        }
                                        break;
                                    case 3:
                                        valor = gato[0][2];
                                        if (valor.equals(" ")) {
                                            gato[0][2] = ((tiradas % 2 == 0) ? "O" : "X");
                                            tiradas++;
                                            tablero(gato);
                                        } else {
                                            System.out.println("Posición ocupada");
                                        }
                                        break;
                                    case 4:
                                        valor = gato[1][0];
                                        if (valor.equals(" ")) {
                                            gato[1][0] = ((tiradas % 2 == 0) ? "O" : "X");
                                            tiradas++;
                                            tablero(gato);
                                        } else {
                                            System.out.println("Posición ocupada");
                                        }
                                        break;
                                    case 5:
                                        valor = gato[1][1];
                                        if (valor.equals(" ")) {
                                            gato[1][1] = ((tiradas % 2 == 0) ? "O" : "X");
                                            tiradas++;
                                            tablero(gato);
                                        } else {
                                            System.out.println("Posición ocupada");
                                        }
                                        break;
                                    case 6:
                                        valor = gato[1][2];
                                        if (valor.equals(" ")) {
                                            gato[1][2] = ((tiradas % 2 == 0) ? "O" : "X");
                                            tiradas++;
                                            tablero(gato);
                                        } else {
                                            System.out.println("Posición ocupada");
                                        }
                                        break;
                                    case 7:
                                        valor = gato[2][0];
                                        if (valor.equals(" ")) {
                                            gato[2][0] = ((tiradas % 2 == 0) ? "O" : "X");
                                            tiradas++;
                                            tablero(gato);
                                        } else {
                                            System.out.println("Posición ocupada");
                                        }
                                        break;
                                    case 8:
                                        valor = gato[2][1];
                                        if (valor.equals(" ")) {
                                            gato[2][1] = ((tiradas % 2 == 0) ? "O" : "X");
                                            tiradas++;
                                            tablero(gato);
                                        } else {
                                            System.out.println("Posición ocupada");
                                        }
                                        break;
                                    case 9:
                                        valor = gato[2][2];
                                        if (valor.equals(" ")) {
                                            gato[2][2] = ((tiradas % 2 == 0) ? "O" : "X");
                                            tiradas++;
                                            tablero(gato);
                                        } else {
                                            System.out.println("Posición ocupada");
                                        }
                                        break;
                                    default:
                                        System.out.println("Opción no válida");
                                }
                                if (tiradas == 10) {
                                    winVertical(gato);
                                    winHorizontal(gato);
                                    break;
                                }

                            } while (true);

                        }
                    }
                    break;
                case "3":
                    bandera = false;
                    break;
                default:
                    System.out.println("Error!");
            }
        }
    }

    public static boolean tiradaCorrecta(int posicion) {
        if (posicion != 1 && posicion != 2 && posicion != 3
                && posicion != 4 && posicion != 5 && posicion != 6
                && posicion != 7 && posicion != 8 && posicion != 9) {
            return true;
        }
        return false;
    }

    public static void tablero(String[][] arr) {
        for (String[] strings : arr) {
            for (String string : strings) {
                System.out.print("|" + string + "|");
            }
            System.out.println("");
        }
    }

    public static String[][] inicializar(String[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = " ";
            }
        }
        return arr;
    }

    public static boolean isNumber(String param) {
        int numero;
        try {
            numero = Integer.parseInt(param);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public static void verificarGanador(String gato[][], Jugador primero, Jugador segundo) {
        if (segundo == null) {
            segundo.setGanados(segundo.getGanados() + 1);
            segundo.setPuntuacion(segundo.getPuntuacion() + 10);
        }
    }

    public static void winHorizontal(String[][] gato) {
        boolean superior = false, medio = false, bajo = false;
        if (gato[0][0].equals("X") && gato[0][1].equals("X") && gato[0][2].equals("X")) {
            System.out.println("Primer jugador gana");
            superior = true;
        } else if (gato[0][0].equals("O") && gato[0][1].equals("O") && gato[0][2].equals("O")) {
            System.out.println("Segundo jugador gana");
            superior = true;
        }
        if (gato[1][0].equals("X") && gato[1][1].equals("X") && gato[1][2].equals("X")) {
            System.out.println("Primer jugador gana");
            medio = true;
        } else if (gato[0][0].equals("O") && gato[0][1].equals("O") && gato[0][2].equals("O")) {
            System.out.println("Segundo jugador gana");
            medio = true;
        }
        if (gato[2][0].equals("X") && gato[2][1].equals("X") && gato[2][2].equals("X")) {
            System.out.println("Primer jugador gana");
            bajo = true;
        } else if (gato[0][0].equals("O") && gato[0][1].equals("O") && gato[0][2].equals("O")) {
            System.out.println("Segundo jugador gana");
            bajo = true;
        }
        if (superior || medio || bajo) {
            System.out.println("Juego terminado");
        } else {
            System.out.println("Empate!");
        }
    }

    public static void winVertical(String[][] gato) {
        boolean superior = false, medio = false, bajo = false;
        if (gato[0][0].equals("X") && gato[1][0].equals("X") && gato[2][0].equals("X")) {
            System.out.println("Primer jugador gana");
            superior = true;
        } else if (gato[0][0].equals("O") && gato[1][0].equals("O") && gato[2][0].equals("O")) {
            System.out.println("Segundo jugador gana");
            superior = true;
        }
        if (gato[1][0].equals("X") && gato[1][1].equals("X") && gato[1][2].equals("X")) {
            System.out.println("Primer jugador gana");
            medio = true;
        } else if (gato[0][0].equals("O") && gato[1][0].equals("O") && gato[2][0].equals("O")) {
            System.out.println("Segundo jugador gana");
            medio = true;
        }
        if (gato[0][2].equals("X") && gato[1][2].equals("X") && gato[2][2].equals("X")) {
            System.out.println("Primer jugador gana");
            bajo = true;
        } else if (gato[0][0].equals("O") && gato[1][0].equals("O") && gato[2][0].equals("O")) {
            System.out.println("Segundo jugador gana");
            bajo = true;
        }
        if (superior || medio || bajo) {
            System.out.println("Juego terminado");
        } else {
            System.out.println("Empate!");
        }
    }
}
