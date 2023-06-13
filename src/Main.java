import java.util.Scanner;
/*Лабораторная работа № 7
Создать класс с методами, вычисляющими значения выражения
1) y=3x+5
2) y=(a+b)/(a-b)
3) y=(ax/b)!
Создать три объекта класса*/
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите x: ");
        int x = in.nextInt();
        System.out.print("Введите a: ");
        int a = in.nextInt();
        System.out.print("Введите b: ");
        int b = in.nextInt();

        Calc calc1 = new Calc(x, a, b);
        Calc calc2 = new Calc(x, a, b);
        Calc calc3 = new Calc(x, a, b);
        calc1.UR1();
        calc2.UR2();
        calc3.UR3();
    }
}