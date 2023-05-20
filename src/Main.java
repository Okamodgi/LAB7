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

        UR1(x);
        UR2(a, b);
        UR3(x, a, b);
    }
    public static void UR1(int X) {
       int Y1= 3*X+5;
        System.out.println("Ответ 1: "+Y1);
    }
    public static void UR2(int a, int b) {
        int Y2 = (a+b)/(a-b);
        System.out.println("Ответ 2: "+Y2);
    }
    public static void UR3(int X, int a, int b) {
        if(b!=0){
            int res = (a*X/b);
            double Y3 = 1;
            for (int i = 1; i <= res; i++) {
                Y3 = Y3 * i;
            }
            System.out.println("Ответ 3: "+ Y3);
        }
    }
}