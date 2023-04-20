import model.CD;
import model.DVD;
import model.Dome;
import model.Elemento;

import java.util.Scanner;

public class Main {
    static Scanner teclado;

    public static void main(String[] args) {
        teclado = new Scanner(System.in);
        boolean seguir = true;
        Dome miDome = new Dome();

        int option = 0;
        while (seguir) {
            System.out.println("1.ver coleccion entera");
            System.out.println("2.ver CDs");
            System.out.println("3.ver DVDs");
            System.out.println("4.agregar a coleccion");
            System.out.println("9.salir");
            option = teclado.nextInt();
            switch (option) {
                case 1:
                    miDome.imprimirColeccion();
                    break;
                case 2:
                    miDome.imprimirCds();
                    break;
                case 4:
                    miDome.agregarColeccion(cargaElemento());
                    break;
                case 9:
                    seguir = false;
                    break;
            }
        }
    }

    public static Elemento cargaElemento() {
        int aux = 0;
        Elemento nuevo = null;
        System.out.println("que vas a agregar?");
        while (aux != 1 && aux != 2) {
            System.out.println("ingrese 1.CD 2.DVD");
            aux = teclado.nextInt();
        }
        if (aux == 1) {
            nuevo = new CD();
            nuevo.setLoTengo(true);
            System.out.println("ingrese el titulo");
            teclado.nextLine();
            nuevo.setTitulo(teclado.nextLine());
            System.out.println("ingrese el genero");
            nuevo.setGenero(teclado.nextLine());
            System.out.println("ingrese el album");
            ((CD) nuevo).setAlbum(teclado.nextLine());
            System.out.println("ingrese el interprete");
            ((CD) nuevo).setInterprete(teclado.nextLine());
            System.out.println("ingrese la cantidad de temas");
            ((CD) nuevo).setNumeroDeTemas(teclado.nextInt());
            teclado.nextLine();
            System.out.println("ingrese un comentario");
            nuevo.setComentario(teclado.nextLine());

        } else if (aux == 2) {
            nuevo = new DVD();
            nuevo.setLoTengo(true);
            System.out.println("ingrese el titulo");
            teclado.nextLine();
            nuevo.setTitulo(teclado.nextLine());
            System.out.println("ingrese el genero");
            nuevo.setGenero(teclado.nextLine());
            System.out.println("ingrese el director");
            ((DVD) nuevo).setDirector(teclado.nextLine());
            System.out.println("ingrese una puntacion");
            ((DVD) nuevo).setPuntacion(teclado.nextInt());
            System.out.println("ingrese un comentario");
            teclado.nextLine();
            nuevo.setComentario(teclado.nextLine());
        }

        return nuevo;

    }

}