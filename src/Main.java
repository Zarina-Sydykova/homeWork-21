import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {


//        fileWriter();
        fileReader();

    }
    public static void fileWriter(){
        try (FileWriter fileWriter = new FileWriter("Alphabet.txt")) {
            fileWriter.write("\n A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y, Z. ");
            fileWriter.write("\n 0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26.");
            throw new ExceptionCatch("Not found such file here.");
        }catch (ExceptionCatch | IOException e){
            e.getMessage();
        }
    }
    public static void fileReader() throws FileNotFoundException {
      try {
          FileReader fileReader = new FileReader("Alphabet.txt");
              Scanner scanner = new Scanner(fileReader);
          while (scanner.hasNextLine())
          {
              System.out.println(scanner.nextLine());
          }
      }catch (IOException e){
          e.printStackTrace();
      }
    }
}