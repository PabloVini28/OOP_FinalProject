import java.util.Objects;
import java.util.Scanner;

public class IO {

    private static Scanner scan = new Scanner(System.in);

    public static String input(){
        return scan.nextLine();
    }
    public static int inputInt(){
        return scan.nextInt();
    }

    public static float inputFloat(){
        return scan.nextFloat();
    }

    public static void println(Objects str){
        System.out.println(str);
    }
}
