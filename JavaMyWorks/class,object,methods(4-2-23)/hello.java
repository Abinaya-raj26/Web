class orange
{
  public int juice(int org1, int org2){
  int r=org1+org2;
  if(org1<=5){
    System.out.println("Orange juice Bhaiya");
  }
  else{
    System.out.println( r);
  }
   return r;
  }
}




public class hello {
    public static void main(String[] args0) {
       int orange1=1;
       int orange2=20;

  orange org= new orange();
   int result= org.juice(orange1, orange2) ;
   System.out.println(result);
    }
  }
