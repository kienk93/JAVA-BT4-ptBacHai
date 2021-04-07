import java.util.Scanner;

public class ptBacHai {
    int a, b, c;

    public ptBacHai() {
    }

    public ptBacHai(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    private int getDiscriminant() {
        return b * b - 4 * a * c;
    }

    private double getRoot1() {
        return ((-b + Math.sqrt(getDiscriminant())) / 2 * a);
    }

    private double getRoot2() {
        return ((-b - Math.sqrt(getDiscriminant())) / 2 * a);
    }

    public static void main(String[] args) {
        System.out.println("Phương trình bậc 2 : ax2 + bx + c = 0");
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        System.out.print("nhập a:");
        a = sc.nextInt();
        System.out.print("nhập b:");
        b = sc.nextInt();
        System.out.print("nhập c:");
        c = sc.nextInt();
        ptBacHai ptBacHai1 = new ptBacHai(a, b, c);
        ptBacHai1.getDiscriminant();
        System.out.print("Phương trình có denta = ");
        System.out.print(ptBacHai1.getDiscriminant());
        int denta = ptBacHai1.getDiscriminant();
        System.out.println("");
        if (denta > 0) {
            System.out.println("Phương trình có 2 nghiệm : " + "x1 = " + ptBacHai1.getRoot1() + " " + "x2 = " + ptBacHai1.getRoot2());
        } else if (denta == 0) {
            System.out.println("Phương trình có 2 nghiệm = nhau : " + "x1 = x2 = " + ptBacHai1.getRoot1());
        } else {
            System.out.println("Phương trình vô nghiệm");
        }
    }


}
