import java.io.IOException;
import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;

public class FileIO {
    public static void main(String[] args) throws Exception {
        BufferedReader inputStream = null;
        String line = null;
        PrintWriter outputStream = null;
        double sum = 0.0;
        
        try {
            inputStream = new BufferedReader(new FileReader("numbers.txt"));
            outputStream = new PrintWriter("average.txt");

            while ((line = inputStream.readLine()) != null) {
                System.out.println(line);
                String[] numbers = line.split(" ");

                for (int i = 0; i < numbers.length; i ++) {
                    sum += Integer.parseInt(numbers[i]);
                }
                outputStream.println(sum / numbers.length);
            }
        } catch (FileNotFoundException exception) {
            System.out.println("Error opening file.");
        } catch (IOException exception) {
            System.out.println("Problem creating or writing to the file.");
            exception.printStackTrace();
        } finally {
            if (inputStream != null) {
                inputStream.close();
            } else {
                outputStream.close();
            }
        }
    }
}