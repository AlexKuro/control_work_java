package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FileJson implements ViewInterface{

    private long toyCount;
    private JSONObject data = new JSONObject();
    String pathProject = System.getProperty("user.dir");
    String pathFile = pathProject.concat("/file.json");
    File file = new File(pathFile);

    public void fileDataJson() {
        try {
            if (file.createNewFile()) {
                long i = 0;
                data.put("toyCount", i);
                writeFile();
            } else {
                readFile();
            }
        } catch (IOException e) {
            logToy.setLogger("Ошибка при вводе/выводе данных из файла!");
            e.printStackTrace();
        }
        toyCount = (long) data.get("toyCount");
    }

    public void readFile() {
        try (FileReader reader = new FileReader(file)) {
            JSONParser jsonParser = new JSONParser();
            data = (JSONObject) jsonParser.parse(reader);
        } catch (IOException | ParseException e) {
            logToy.setLogger("Ошибка при вводе/выводе данных из файла!");
            e.printStackTrace();
        }
    }

    public void writeFile() {
        try (FileWriter fileWriter = new FileWriter(file)) {
            fileWriter.write(data.toJSONString());
        } catch (IOException e) {
            logToy.setLogger("Ошибка при вводе/выводе данных из файла!");
            e.printStackTrace();
        }
    }

    public void addJson(String key, Object value) {
        data.put(key, value);
        data.put("toyCount", toyCount + 1);
        writeFile();
        toyCount = (long) data.get("toyCount");
        System.out.println("Запись сохранена.");
    }

    public void delJson() {
        data.put("toyCount", toyCount - 1);
        writeFile();
        toyCount = (long) data.get("toyCount");
        System.out.println("Игрушка удалена.");
        System.out.println("Запись сохранена.");
    }

    public void delRaffleJson() {
        data.put("toyCount", toyCount - 1);
        writeFile();
        toyCount = (long) data.get("toyCount");
        System.out.println("\tИгрушка перемещается к Вам!\n");
    }
}
