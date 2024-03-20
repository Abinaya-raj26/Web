 class human{
   private int age=21;
   private String name="Abi";
 
  public int getAge(){
    return age;
  }
  public String getName (){
    return name;
  }

}
//  we can access the private data variables  through methods in the same class 

public class goo {
    public static void main(String args[]){
      
        human obj=new human();
        obj.getAge();
        obj.getName();
        System.out.println(obj.getName()+":"+" "+obj.getAge());
    }
}
