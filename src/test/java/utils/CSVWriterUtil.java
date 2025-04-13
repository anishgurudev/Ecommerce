package utils;

import com.opencsv.CSVWriter;
import java.io.FileWriter;
import java.io.IOException;

public class CSVWriterUtil {

    public static void writeToCSV(String filePath, String[] dataRow) {
        try (CSVWriter writer = new CSVWriter(new FileWriter(filePath, true))) {
            writer.writeNext(dataRow);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writeResultToCSV(String filePath, String[] resultRow) {
            try (CSVWriter writer = new CSVWriter(new FileWriter(filePath, true))) {
                writer.writeNext(resultRow);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

