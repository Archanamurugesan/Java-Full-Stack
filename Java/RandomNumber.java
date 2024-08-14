import java.util.Random;

public class RandomNumber {
    public static void main(String[] args) {
        Random random = new Random();

        int randomInt = random.nextInt(); 
        System.out.println("Random Integer: " + randomInt);

        int randomIntInRange = random.nextInt(100); 
        System.out.println("Random Integer between 0 and 99: " + randomIntInRange);

        double randomDouble = random.nextDouble();
        System.out.println("Random Double between 0.0 and 1.0: " + randomDouble);

        boolean randomBoolean = random.nextBoolean();
        System.out.println("Random Boolean: " + randomBoolean);
    }
}