// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        import java.util.*;

        class Proceso {
            String idProceso;
            long cedula;
            int tiempoCPU;

            public Proceso(String idProceso, long cedula, int tiempoCPU) {
                this.idProceso = idProceso;
                this.cedula = cedula;
                this.tiempoCPU = tiempoCPU;
            }

            @Override
            public String toString() {
                return "Proceso{" +
                        "idProceso='" + idProceso + '\'' +
                        ", cedula=" + cedula +
                        ", tiempoCPU=" + tiempoCPU +
                        '}';
            }
        }

        public class RoundRobin {

            static Queue<Proceso> colaProcesos = new LinkedList<>();
            static Stack<Proceso> historial = new Stack<>();
            static int quantum = 35;
            static int tiempoTotalEjecucion = 0;
            static int numConmutaciones = 0;

            public static void main(String[] args) {
                predefinirProcesos();
                Scanner scanner = new Scanner(System.in);
                int opcion;
                do {
                    System.out.println("===== Menú de opciones =====");
                    System.out.println("1. Imprimir datos personales");
                    System.out.println("2. Predefinir procesos");
                    System.out.println("3. Insertar nuevo proceso");
                    System.out.println("4. Imprimir cola");
                    System.out.println("5. Establecer valor del quantum");
                    System.out.println("6. Ejecutar roundrobin");
                    System.out.println("7. Ver historial");
                    System.out.println("8. Salir");
                    System.out.print("Seleccione una opción: ");
                    opcion = scanner.nextInt();
                    switch (opcion) {
                        case 1:
                            imprimirDatosPersonales();
                            break;
                        case 2:
                            predefinirProcesos();
                            break;
                        case 3:
                            insertarProceso();
                            break;
                        case 4:
                            imprimirCola();
                            break;
                        case 5:
                            establecerQuantum();
                            break;
                        case 6:
                            ejecutarRoundRobin();
                            break;
                        case 7:
                            verHistorial();
                            break;
                        case 8:
                            System.out.println("¡Adiós!");
                            break;
                        default:
                            System.out.println("Opción inválida.");
                            break;
                    }
                } while (opcion != 8);
            }

            private static void imprimirDatosPersonales() {
                System.out.println("Nombre: [nombre]");
                System.out.println("Cédula: [cedula]");
                System.out.println("Código banner: [codigo_banner]");
                System.out.println();
            }

            private static void predefinirProcesos() {
                colaProcesos.clear();
                historial.clear();
                colaProcesos.offer(new Proceso("P1", 1002856059, 100));
                colaProcesos.offer(new Proceso("P2", 1714196743, 15));
                colaProcesos.offer(new Proceso("P3", 1456756888, 40));
                colaProcesos.offer(new Proceso("P4", 1029384756, 30));
                colaProcesos.offer(new Proceso("P5", 3948576234L, 50));
                colaProcesos.offer(new Proceso("P6", 2837465839L, 25));
                System.out.println("Procesos predefinidos insertados en la cola.");
                System.out.println();
            }


        }
}