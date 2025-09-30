import java.util.Scanner;

public class Input {
    private Scanner scan = new Scanner(System.in);

    public String getMessage(){
        System.out.println("Enter message");
        return scan.nextLine();
        
    }
    public int getOffset() {
        System.out.println("How many steps do you want to offset:");
        return scan.nextInt();
    }
    public void close() {
        
        scan.close();  
    }
}
