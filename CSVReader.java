import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CSVReader {
    public static void main(String[] args) {
        String csvFile = "students.csv";
        String line;
        String csvSplitBy = ",";
        int rowCount = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            // Baca header
            String header = br.readLine();
            System.out.println("Header: " + header);
            
            while ((line = br.readLine()) != null) {
                String[] data = line.split(csvSplitBy);
                System.out.println("NIM: " + data[0] + ", Nama: " + data[1] + ", Umur: " + data[2] + ", Prodi: " + data[3]);
                rowCount++;
            }
            System.out.println("Jumlah baris data: " + rowCount);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
