/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listaDobleEnlazada.examen;

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
        boolean bandera = true;
        String opcion = "";
        while (bandera) {
            System.out.println("1. Registrar jugador");
            System.out.println("2. Jugar al Gato");
            System.out.println("3. Salir");
            System.out.println("Seleccionar opción...");
            opcion = sc.next();
            System.out.println("===========================================");
            switch (opcion) {
                case "1":
                    jugador = new Jugador(sc.next(), 0.0, 0);
                    jugadores.add(jugador);
                    System.out.println("Jugador registrado correctamente");
                    break;
                case "2":
                    String[][] gato = {{" ", " ", " "}, {" ", " ", " "}, {" ", " ", " "}};
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
                        boolean finalJuego = true;
                        int posicionSeleccionada = -1, tiradas = 1;
                        String valor = "";
                        while (finalJuego) {
                            do {
                                System.out.println("[1][2][3]");
                                System.out.println("[4][5][6]");
                                System.out.println("[7][8][9]");
                                System.out.println("Seleccione una posición");
                                posicionSeleccionada = sc.nextInt();
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

                                if (verificarGanador(gato, primero, segundo)) {
                                    System.out.println("Juego terminado!");
                                    finalJuego = false;
                                } else {
                                    if (tiradas == 10) {
                                        System.out.println("Empate!");
                                        primero.setPuntuacion(primero.getPuntuacion() + 5);
                                        segundo.setPuntuacion(segundo.getPuntuacion() + 5);
                                        finalJuego = false;
                                    }
                                }
                            } while (finalJuego);
                        }
                    }
                    break;
                case "3":
                    if (jugadores.isEmpty()) {
                        System.out.println("No hay registros");
                    } else {
                        for (Jugador jugadore : jugadores) {
                            System.out.println("Jugador " + jugadore.getNombre());
                            System.out.println("\tG:" + jugadore.getGanados());
                            System.out.println("\tO:" + jugadore.getPuntuacion());
                        }
                    }
                    bandera = false;
                    break;
                default:
                    System.out.println("Opción incorrecta!");
            }
        }
    }

    public static void tablero(String[][] arr) {
        System.out.println("===========================================");
        for (String[] strings : arr) {
            for (String string : strings) {
                System.out.print("[" + string + "]");
            }
            System.out.println("");
        }
        System.out.println("===========================================");
    }

    public static boolean verificarGanador(String gato[][], Jugador primero, Jugador segundo) {
        boolean ganador = false;
        if (winHorizontal(gato).equals("primero") || winVertical(gato).equals("primero")) {
            System.out.println("Jugador " + primero.getNombre() + " gana!");
            primero.setGanados(primero.getGanados() + 1);
            primero.setPuntuacion(primero.getPuntuacion() + 10);
            ganador = true;
        } else if (winHorizontal(gato).equals("segundo") || winVertical(gato).equals("segundo")) {
            System.out.println("Jugador " + segundo.getNombre() + " gana!");
            segundo.setGanados(segundo.getGanados() + 1);
            segundo.setPuntuacion(segundo.getPuntuacion() + 10);
            ganador = true;
        }
        return ganador;
    }

    public static String winHorizontal(String[][] gato) {
        String ganador = "";
        if (gato[0][0].equals("X") && gato[0][1].equals("X") && gato[0][2].equals("X")) {
            ganador = "primero";
        } else if (gato[0][0].equals("O") && gato[0][1].equals("O") && gato[0][2].equals("O")) {
            ganador = "segundo";
        }
        if (gato[1][0].equals("X") && gato[1][1].equals("X") && gato[1][2].equals("X")) {
            ganador = "primero";
        } else if (gato[0][0].equals("O") && gato[0][1].equals("O") && gato[0][2].equals("O")) {
            ganador = "segundo";
        }
        if (gato[2][0].equals("X") && gato[2][1].equals("X") && gato[2][2].equals("X")) {
            ganador = "primero";
        } else if (gato[0][0].equals("O") && gato[0][1].equals("O") && gato[0][2].equals("O")) {
            ganador = "segundo";
        }
        return ganador;
    }

    public static String winVertical(String[][] gato) {
        String ganador = "";
        if (gato[0][0].equals("X") && gato[1][0].equals("X") && gato[2][0].equals("X")) {
            ganador = "primero";
        } else if (gato[0][0].equals("O") && gato[1][0].equals("O") && gato[2][0].equals("O")) {
            ganador = "segundo";
        }
        if (gato[1][0].equals("X") && gato[1][1].equals("X") && gato[1][2].equals("X")) {
            ganador = "primero";
        } else if (gato[0][0].equals("O") && gato[1][0].equals("O") && gato[2][0].equals("O")) {
            ganador = "segundo";
        }
        if (gato[0][2].equals("X") && gato[1][2].equals("X") && gato[2][2].equals("X")) {
            ganador = "primero";
        } else if (gato[0][0].equals("O") && gato[1][0].equals("O") && gato[2][0].equals("O")) {
            ganador = "segundo";
        }
        return ganador;
    }
}
