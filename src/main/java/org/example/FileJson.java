package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.json.simple.JSONArray;
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
    private JSONArray dataArray = new JSONArray();

    public void fileDataJson() {
        try {
            String pathProject = System.getProperty("user.dir");
            String pathFile = pathProject.concat("/file.json");
            File file = new File(pathFile);

            if (file.createNewFile()) {
                long i = 0;
                data.put("toyCount", i);
                FileWriter fileWriter = new FileWriter(file, true);
                fileWriter.write(data.toJSONString());
                fileWriter.flush();
                fileWriter.close();
            } else {
                FileReader reader = new FileReader(file);
                JSONParser jsonParser = new JSONParser();
                data = (JSONObject) jsonParser.parse(reader);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        toyCount = (long) data.get("toyCount");
    }

    public void addFile() {
        try {
            String pathProject = System.getProperty("user.dir");
            String pathFile = pathProject.concat("/file.json");
            File file = new File(pathFile);
            try (PrintWriter pw = new PrintWriter(file)) {
            } catch (IOException e) {
                e.printStackTrace();
            }
            FileWriter fileWriter = new FileWriter(file, true);
            fileWriter.write(data.toJSONString());
            fileWriter.flush();
            fileWriter.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void addJson(String key, Object value) {
        data.put(key, value);
        data.put("toyCount", toyCount + 1);
        addFile();
        toyCount = (long) data.get("toyCount");
        System.out.println("Запись сохранена.");
    }


}
