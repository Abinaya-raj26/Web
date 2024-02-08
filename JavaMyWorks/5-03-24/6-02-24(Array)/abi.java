public class abi {
    public static void main(String[] args) {

        int hello[][] = new int[3][4];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                hello[i][j]= (int)(Math.random()*100);
                System.out.println(hello[i][j]);
            }
        }

        String bike[] = { "Hreo Honda", "Pulsar", "Duke", "RE" };
        for (String i : bike) {
            System.out.println(i);
        }

        String cars[] = { "BMW", "Ford", "Audi" };
        for (int i = 0; i <= 2; i++) {
            System.out.println(cars[i]);
        }

        int num[] = { 5, 6, 7, 8 };
        System.out.println(num[2]);

    }
}
