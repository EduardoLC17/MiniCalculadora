//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {



    String menu = """
                        Introduce la opcion deseada
                        1--Valor absoluto
                        2--Raiz cuadrada
                        0--Cerrar
    
                        """;
    System.out.println(menu);
    Scanner sc = new Scanner(System.in);

    int opcion = sc.nextInt();


    do {
        System.out.println(menu);
        opcion = sc.nextInt();

        switch (opcion) {
            case 1 -> {
                System.out.println("Introduce el numero para el calculo");
                double numero1 = sc.nextDouble();
                System.out.println(miniCalculadoraEjemplo.valorAbsoluto(numero1));
            }
            case 2 -> {
                System.out.println("Introduce el numero para el calculo");
                double numero1 = sc.nextDouble();
                System.out.println(miniCalculadoraEjemplo.raizCuadrada(numero1));
            }
            case 0 -> System.out.println("Cerrando");
        }
    } while (opcion != 0);
    sc.close();



}
