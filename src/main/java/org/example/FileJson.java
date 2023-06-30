package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FileJson {

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
            e.printStackTrace();
        }
        toyCount = (long) data.get("toyCount");
    }

    public void readFile() {
        try (FileReader reader = new FileReader(file)) {
            JSONParser jsonParser = new JSONParser();
            data = (JSONObject) jsonParser.parse(reader);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public void writeFile() {
        try (FileWriter fileWriter = new FileWriter(file)) {
            fileWriter.write(data.toJSONString());
//            fileWriter.flush();
        } catch (IOException e) {
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


}
