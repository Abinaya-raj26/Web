
public class Hi {
    public static void main(String[] args) {
        String name = "Abinaya";
        System.out.println(name);
        String surname = new String("Raj");
        System.out.println(name + " " + surname);

        // Stringbuffer
        StringBuffer sb = new StringBuffer("call me gowthami");
        System.out.println(sb.capacity());
        StringBuffer sb2 = new StringBuffer("Noo I'm busy");
        System.out.println(sb.append("" + " ....." + sb2));

        // if we says 4 the charAt will give the value of 4th position ...java will consider space as value too 
        StringBuffer sb3 = new StringBuffer("Feb 14");
        System.out.println(sb3.charAt(4));

        StringBuffer sb4= new StringBuffer("Lover's day");
        System.out.println(sb4.deleteCharAt(0));
    }
}
