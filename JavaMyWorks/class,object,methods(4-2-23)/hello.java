
class computer {

  public void playgmes() {
    System.out.println("Playing games");
  }

  public String GetMejoystick(int cost) {
    if (cost >= 100)
      return "joystick";
    else
      return "Better luck next time";
  }
}

public class hello {
  public static void main(String[] args0) {

    computer comp = new computer();
    comp.playgmes();
    String str = comp.GetMejoystick(10);
   System.out.println(str);
  }
}
