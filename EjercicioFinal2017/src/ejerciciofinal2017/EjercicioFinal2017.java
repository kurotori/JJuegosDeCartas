package ejerciciofinal2017;

import java.util.Scanner;

public class EjercicioFinal2017 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.______);
        ________ opcion = "";
        String[] nombre = new ______[10];
        String[] apellido = new String[10];
        ________[] _____ = new __________[10];

        ______ (!opcion.equals(_______)) {
            //NOTA: un "!" delante de una condición significa negación del
            //valor de la misma.    
            
            System.out.println("Elige una opción:");
            System.out.println("----------------------------");
            System.out.println("1 - Ver Datos Guardados");
            System.out.println("2 - Agregar Datos Nuevos");
            System.out.println("3 - Modificar Datos");
            System.out.println("4 - Eliminar Datos");
            System.out.println("x - Salir");
            System.out.println("----------------------------");
            System.out.print("Opción: ");
            opcion = teclado.nextLine();

            _____ (opcion.equals("1")) {
                System.out.________("----------------------------");
                System.out.println("Datos Guardados:");
                System.out.println("----------------------------");
                for (int c = ___; c < ____; c++) {
                    System.out.println((c + 1) + " " + nombre[c] + " " + apellido[c] + " " + CI[c]);
                }
                System.out.println("----------------------------");
                System.out.println("Presione ENTER para continuar");
                teclado.nextLine();
               
            }

            if (opcion.equals("2")) {
                ___________________("----------------------------");
                ___________________("Agregar Datos Nuevos:");
                ___________________("----------------------------");
                _____ posicion = 0;
                for (int ___ = 0; ____ < nombre.length; ___++) {
                    if (nombre[c] == null){
                      posicion=c;
                      break;
                        //NOTA: la orden "break" detiene forzosamente un bucle 
                    }
                }
                System.out.println("Escriba el nombre:");
                nombre[posicion] = teclado.__________();
                System.out.println("Escriba el apellido:");
                apellido[posicion] = teclado.________();
                System.out.println("Escriba el número de CI:");
                CI[posicion] = teclado.____________();
                System.out.println("----------------------------");
                System.out.println("Datos Guardados. Presione ENTER para continuar");
                teclado.nextLine();
               
            }

            if (opcion.equals("3")) {
                Scanner tecladoNum = new Scanner(System.in);
                int posicion = 0;
                System.out.println("----------------------------");
                System.out.println("Modificar Datos:");
                System.out.println("----------------------------");
                System.out.println("Escriba el número de registro a modificar:");
                posicion = tecladoNum.__________();
                System.out.println("Escriba el nombre:");
                nombre[(posicion - ___)] = teclado.nextLine();
                System.out.println("Escriba el apellido:");
                apellido[(posicion - ___)] = teclado.nextLine();
                System.out.println("Escriba el número de CI:");
                CI[(posicion - ___)] = teclado.nextLine();
                System.out.println("----------------------------");
                System.out.println("Datos Actualizados. Presione ENTER para continuar");
                teclado.nextLine();
               
            }
            if (opcion.equals("4")) {
                String confirma = "";
                System.out.println("----------------------------");
                System.out.println("Se eliminarán TODOS los datos");
                System.out.print("¿Desea Continuar? (S/N)");
                confirma = teclado.nextLine();
                if (confirma.equals("S")) {
                    ____ (_____________________) {
                        nombre[c]="";
                        apellido[c]="";
                        CI[c]="";
                    }
                }
                System.out.println("----------------------------");
                System.out.println("Datos Eliminados.Presione ENTER para continuar");
                teclado.nextLine();
                
            }
            
            if(opcion.equals("x")){
                break;
            }
        }
    }

}
