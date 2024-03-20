class Calc {
    public int add(int n1, int n2) {
        return n1 + n2;
    }
}
When two methods have the same name then the method will be override
class AdvCalc {
    public int add(int n1, int n2) {
        return n1 + n2 + 1;
    }
}

public class Method {
    public static void main(String[] args) {
        AdvCalc obj = new AdvCalc();
        int r = obj.add(2, 2);
        System.out.println(r);
    }
}