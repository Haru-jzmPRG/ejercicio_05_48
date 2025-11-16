public class App {
    public static void main(String[] args) throws Exception {
        int num = Integer.parseInt(System.console().readLine("Introduzca un número entero: "));
        int digitos = 0;
        int volteado = 0;
        boolean aparece = false;

        while (num > 0) {
            digitos = num % 10;
            volteado = (volteado * 10) + (digitos);            
            num = num / 10;
        }
        System.out.print("Dígitos que aparecen en el número: ");

        while (volteado > 0) {
            digitos = volteado % 10;
            for (int i = 0; i <= 10; i++) {
                if (digitos == i) {
                    System.out.print(i + " ");
                    aparece = true;
                }else {
                    System.out.print(digitos + " ");
                }
            volteado = volteado / 10;
            }
        }
    }
}
