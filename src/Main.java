import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Rectangulo> rectangulos = new ArrayList<>();
        List<Triangulo> triangulos = new ArrayList<>();
        List<Circulo> circulos = new ArrayList<>();

        int opcion = 0;

        while (opcion != 5) {
            System.out.println("Menú de Figuras");
            System.out.println("1. Crear Rectángulo");
            System.out.println("2. Crear Triángulo");
            System.out.println("3. Crear Círculo");
            System.out.println("4. Mostrar Figuras Creadas");
            System.out.println("5. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    if (rectangulos.size() < 3) {
                        System.out.print("Base: ");
                        double base = scanner.nextDouble();
                        System.out.print("Altura: ");
                        double altura = scanner.nextDouble();
                        Rectangulo rectangulo = new Rectangulo(base, altura);
                        rectangulos.add(rectangulo);
                        System.out.println("********");
                        System.out.println("Área: " + rectangulo.calcularArea() + ", Perímetro: " + rectangulo.calcularPerimetro());
                        System.out.println("********");
                    } else {
                        System.out.println("Ya has creado tres Rectángulos.");
                    }
                    break;
                case 2:
                    if (triangulos.size() < 3) {

                        System.out.print("Base: ");
                        double base = scanner.nextDouble();
                        System.out.print("Altura: ");
                        double altura = scanner.nextDouble();
                        System.out.print("Lado 1: ");
                        double lado1 = scanner.nextDouble();
                        System.out.print("Lado 2: ");
                        double lado2 = scanner.nextDouble();
                        System.out.print("Lado 3: ");
                        double lado3 = scanner.nextDouble();
                        Triangulo triangulo = new Triangulo(base, altura, lado1, lado2, lado3);
                        triangulos.add(triangulo);
                        System.out.println("********");
                        System.out.println("Área: " + triangulo.calcularArea() + ", Perímetro: " + triangulo.calcularPerimetro());
                        System.out.println("********");
                    } else {
                        System.out.println("Ya has creado tres Triángulos.");
                    }
                    break;
                case 3:
                    if (circulos.size() < 3) {
                        System.out.print("Radio: ");
                        double radio = scanner.nextDouble();
                        Circulo circulo = new Circulo(radio);
                        circulos.add(circulo);
                        System.out.println("********");
                        System.out.println("Área: " + circulo.calcularArea() + ", Perímetro: " + circulo.calcularPerimetro());
                        System.out.println("********");
                    } else {
                        System.out.println("Ya has creado tres Círculos.");
                    }
                    break;
                case 4:
                    System.out.println("\nFiguras Creadas:");
                    System.out.println("Rectángulos:");
                    for (Rectangulo rectangulo : rectangulos) {
                        System.out.println(rectangulo + " - Área: " + rectangulo.calcularArea() + ", Perímetro: " + rectangulo.calcularPerimetro());
                    }

                    System.out.println("Triángulos:");
                    for (Triangulo triangulo : triangulos) {
                        System.out.println(triangulo + " - Área: " + triangulo.calcularArea() + ", Perímetro: " + triangulo.calcularPerimetro());
                    }

                    System.out.println("Círculos:");
                    for (Circulo circulo : circulos) {
                        System.out.println(circulo + " - Área: " + circulo.calcularArea() + ", Perímetro: " + circulo.calcularPerimetro());
                    }
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Intenta de nuevo.");
            }
        }

        scanner.close();
    }
}
