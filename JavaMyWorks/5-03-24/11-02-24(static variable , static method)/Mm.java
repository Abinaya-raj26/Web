class Mobile
{
    String brand ;
    int price;
    // static variable
    static String name;

    public void show(){
        System.out.println(brand + ": "+price+": "+ name);
    }
    // this is  a static method ... In static method we can call non static variable with the help of object reference.
    public static void show1(Mobile mb3){
        System.out.println(mb3.brand + ": "+mb3.price+": "+ name);
    }
}

public class Mm {
    public static void main(String[] args) {
        
    
    Mobile mb1= new Mobile();
    mb1.brand= "oneplus";
    mb1.price= 30000;
    // static variables called with its class name and the value of name is common to everyone    Mobile.name="smartphone";
    Mobile.name="smartphone";

    Mobile mb2= new Mobile();
    mb2.brand= "Realme";
    mb2.price= 24000;
    Mobile.name="smartphone";


    Mobile mb3= new Mobile();
    mb3.brand= "Oppo";
    mb3.price= 20000;
    Mobile.name="smartphone"; 

    mb1.show();
    mb2.show();
    Mobile.show1(mb3);
    }
}
