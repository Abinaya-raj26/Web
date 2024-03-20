class guman {
    private int age; // Provide a name for the variable
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int a) { // Assign to the private variable 'age'
        age = a;
    }

    public String getName() {
        return name;
    }

    public void setName(String n) { // Assign to the private variable 'name'
        name = n;
    }
}

public class wooman {
    public static void main(String args[]) {

        guman obj = new guman();
        obj.setAge(21); // Pass the value as an argument
        obj.setName("abi"); // Pass the value as an argument
        System.out.println(obj.getName() + ": " + obj.getAge());
    }
}



    