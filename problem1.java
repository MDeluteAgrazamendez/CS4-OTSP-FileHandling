import java.io.*;

public class Main {
    public static void main(String[] args) {
        BufferedReader fileReader = null;

        try {
            // Ask user for filename (input comes from INPUT box)
            BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter filename: ");
            String filename = input.readLine();

            // Prevent errors if input is empty (important for OnlineGDB auto-run)
            if (filename == null || filename.trim().isEmpty()) {
                return;
            }

            // Open the file
            fileReader = new BufferedReader(new FileReader(filename));

            // Read first line
            String firstLine = fileReader.readLine();

            // Display result
            System.out.println("First Line: " + firstLine);

        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found.");
        } catch (IOException e) {
            System.out.println("Error reading the file.");
        } finally {
            try {
                if (fileReader != null) {
                    fileReader.close(); // Close file properly
                }
            } catch (IOException e) {
                System.out.println("Error closing the file.");
            }
        }
    }
}
