class A
{
  public A(){
    System.out.println("in A");
  }
  public A(int n){
    System.out.println("in A int ");
  }
}

class B extends A
{
    public B(){
        System.out.println("in B");
    }
    public B(int n){
        this();
        System.out.println("in B int");
    }
}




public class power {
    public static void main(String[] args) {
        // B obj = new B(3);
    }
}
