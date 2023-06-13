public class Calc {
    int x;
    int a;
    int b;
    Calc(int x, int a, int b) {
        this.x = x;
        this.a = a;
        this.b = b;
    }

    public void UR1() {
        int Y1= 3*x+5;
        System.out.println("Ответ 1: "+Y1);
    }
    public void UR2() {
        int s;
        s = a-b;
        if(s!=0){
            int Y2 = (a+b)/(s);
            System.out.println("Ответ 2: "+Y2);
        }
    }
    public void UR3() {
        if(b!=0){
            int res = (a*x/b);
            double Y3 = 1;
            for (int i = 1; i <= res; i++) {
                Y3 = Y3 * i;
            }
            System.out.println("Ответ 3: "+ Y3);
        }
    }
}
