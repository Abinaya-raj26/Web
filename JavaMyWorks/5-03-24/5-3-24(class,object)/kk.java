class computer {
    public int add(int num1, int num2) {
        return num1 + num2;
    }

    public int add(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    public double add(double new1, double new2) {
        return new1 + new2;
    }
}

public class kk {
 public static void main(String[] args) {
    int num1 = 5;
    int num2 = 5;
    int num3 =5;
    double new1 = 9.9;
    double new2 = 1.1;

    computer com=new computer();
    int r= com.add(num1, num2);
    int g= com.add(num1, num2, num3);
    double p= com.add (new1, new2);

    System.out.println(r);
    System.out.println(g);
    System.out.println(p);
    
 }
}