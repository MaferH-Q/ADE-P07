package Actividades.bstreelinklistinterfgeneric;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedBST<Integer> tree = new LinkedBST<>();
        boolean salir = false;

        // Insertamos un árbol por defecto
        try {
            tree.insert(400);
            tree.insert(100);
            tree.insert(700);
            tree.insert(50);
            tree.insert(75);
            tree.insert(200);
        } catch (Exception e) {
            System.out.println("Árbol preconfigurado con duplicados ignorados.");
        }

        while (!salir) {
            System.out.println("\n=== MENÚ PRINCIPAL BST ===");
            System.out.println("1. Recorrido InOrden explicativo");
            System.out.println("2. Recorrido PreOrden explicativo");
            System.out.println("3. Recorrido PostOrden explicativo");
            System.out.println("4. Buscar mínimo desde nodo");
            System.out.println("5. Buscar máximo desde nodo");
            System.out.println("6. Ejercicio 01: contar, altura, amplitud, destruir");
            System.out.println("7. Ejercicio 02: área, dibujo y comparación de árboles");
            System.out.println("8. Ejercicio 03: visualización parenthesize");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = sc.nextInt();
            sc.nextLine(); // limpiar buffer

            try {
                switch (opcion) {
                    case 1:
                        System.out.println("\n>>> RECORRIDO INORDEN EXPLICATIVO <<<");
                        tree.inOrderExplicativo();
                        break;

                    case 2:
                        System.out.println("\n>>> RECORRIDO PREORDEN EXPLICATIVO <<<");
                        tree.preOrderExplicativo();
                        break;

                    case 3:
                        System.out.println("\n>>> RECORRIDO POSTORDEN EXPLICATIVO <<<");
                        tree.postOrderExplicativo();
                        break;

                    case 4:
                        System.out.print("Ingrese nodo raíz para buscar mínimo: ");
                        int nodoMin = sc.nextInt();
                        System.out.println("Mínimo desde " + nodoMin + ": " + tree.findMinDesde(nodoMin));
                        break;

                    case 5:
                        System.out.print("Ingrese nodo raíz para buscar máximo: ");
                        int nodoMax = sc.nextInt();
                        System.out.println("Máximo desde " + nodoMax + ": " + tree.findMaxDesde(nodoMax));
                        break;

                    case 6:
                        System.out.println("Total de nodos: " + tree.countAllNodes());
                        System.out.println("Nodos no-hoja: " + tree.countNodes());
                        System.out.print("Ingrese nodo para calcular altura: ");
                        int x = sc.nextInt();
                        System.out.println("Altura desde " + x + ": " + tree.height(x));
                        System.out.print("Ingrese nivel para calcular amplitud: ");
                        int nivel = sc.nextInt();
                        System.out.println("Nodos en nivel " + nivel + ": " + tree.amplitude(nivel));
                        System.out.println("¿Deseas destruir el árbol? (s/n): ");
                        if (sc.next().equalsIgnoreCase("s")) {
                            tree.destroyNodes();
                            System.out.println("Árbol destruido.");
                        }
                        break;

                    case 7:
                        LinkedBST<Integer> arbol2 = new LinkedBST<>();
                        arbol2.insert(50);
                        arbol2.insert(25);
                        arbol2.insert(75);
                        arbol2.insert(10);
                        arbol2.insert(30);

                        System.out.println("Área del árbol original: " + tree.areaBST());
                        System.out.println("Área de un segundo árbol: " + arbol2.areaBST());
                        System.out.println("¿Tienen la misma área? " + sameArea(tree, arbol2));

                        System.out.println("\nDibujo del árbol original:");
                        tree.drawBST();
                        System.out.println("\nDibujo del segundo árbol:");
                        arbol2.drawBST();
                        break;

                    case 8:
                        System.out.println("\n>>> REPRESENTACIÓN PARENTHESIZE <<<\n");
                        tree.parenthesize();
                        break;

                    case 0:
                        salir = true;
                        System.out.println("¡Hasta luego!");
                        break;

                    default:
                        System.out.println("Opción no válida.");
                }

            } catch (Exception e) {
                System.out.println(" Error: " + e.getMessage());
            }
        }

        sc.close();
    }

    // Método para comparar áreas de dos árboles
    public static boolean sameArea(LinkedBST<?> a, LinkedBST<?> b) {
        return a.areaBST() == b.areaBST();
    }
}