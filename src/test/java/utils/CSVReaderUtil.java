package utils;
import com.opencsv.CSVReader;
import pojo.LoginData;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class CSVReaderUtil {

    public static List<LoginData> getLoginTestData(String filePath) {

        List<LoginData> testData = new ArrayList<>();
        try (CSVReader reader = new CSVReader(new FileReader(filePath))) {
            List<String[]> data = reader.readAll();
            for (int i = 1; i < data.size(); i++) {
                if (data.get(i)[0].isEmpty() || data.get(i)[1].isEmpty()) {
                    System.out.println("Skipping empty row: " + i);
                    continue;
                }
                testData.add(new LoginData(data.get(i)[0], data.get(i)[1]));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return testData;
    }

    public static List<String[]> readCSV(String filePath) {
        List<String[]> csvData = new ArrayList<>();
        try (CSVReader reader = new CSVReader(new FileReader(filePath))) {
            csvData = reader.readAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return csvData;
    }
}