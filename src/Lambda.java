import java.util.Scanner;

/*
* Напишите калькулятор 1 методом. Метод должен принимать 2 цифровых значения и кое-что ещё.\
*
* Что должен уметь этот метод
* Складывать;
* умножать;
* делить;
* вычитать;
* вычислять корень;
* возводить в степень;
* возводить в степень сумму аргументов поделенную на первое число + 117;
* и все любые другие операции, которые сможете придумать.
*
* Что нельзя использовать:
* if-else;
* char как указатель операции;
* switch-case;
* и все остальное что вам придет в голову.
*/

public class Lambda {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        System.out.println(calculate(a, b, (x, y) -> x * y));
    }

    public static double calculate(double a, double b, Calculator calculator){
        return calculator.calculate(a, b);
    }
}

interface Calculator {
    double calculate(double x, double y);
}
