import java.io.FileWriter;
import java.io.IOException;

public class Program {
    public void run() {
        
        try{
        FileWriter fileWriter = new FileWriter("encryptedFile.csv");
        
        Input input = new Input();
        
        String message = input.getMessage();
        int offset = input.getOffset();

        SubEncrypt cipher = new SubEncrypt(message);

        String encrypted = cipher.encrypt(offset);
        String decrypted = cipher.decrypt(encrypted, offset);

        fileWriter.write("Encrypted message: ");
        fileWriter.write(encrypted );
        fileWriter.write("\n");
        fileWriter.write(" Decrypted message: ");
        fileWriter.write(decrypted);
        fileWriter.close();
        System.out.println("\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\\\\\/\\\\/\\\\/\\\\/\\\\/\\\\/\\\\/\\\\/\\\\/\\\\/\\\\/\\\\/\\\\/\\\\/\\\\");
        System.out.println("The program has encrypted then decrypted your message and the message can be found in the csv file ");
        System.out.println("\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\\\\\/\\\\/\\\\/\\\\/\\\\/\\\\/\\\\/\\\\/\\\\/\\\\/\\\\/\\\\/\\\\/\\\\/\\\\");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
