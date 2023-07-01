package org.example;

import org.json.simple.JSONObject;

import java.util.HashSet;
import java.util.Set;


public class PrintData implements ViewInterface {
    Set<String> setData = new HashSet<>();

    public String[] arrayKey() {
        fileJson.readFile();
        String[] s = new String[fileJson.getData().size() - 1];
        int i = 0;
        for (Object o : fileJson.getData().keySet()) {
            setData.add(o.toString());
            if (!o.toString().equals("toyCount")) {
                s[i] = o.toString();
                i++;
            }
        }
        setData.remove("toyCount");
        return s;
    }

    public void printJsonStructure(String s, Integer i) {
        String name = "name";
        String id = "id";
        String text = "text";
        String frequency = "frequency";
        System.out.println("\t--------------------- " + i + " ---------------------");
        System.out.println("\t         Название игрушки: " + ((JSONObject) fileJson.getData().get(s)).get(name));
        System.out.println("\t         id номер игрушки: " + ((JSONObject) fileJson.getData().get(s)).get(id));
        System.out.println("\t         Описание игрушки: " + ((JSONObject) fileJson.getData().get(s)).get(text));
        System.out.println("\tЧастота выпадения игрушки: " + ((JSONObject) fileJson.getData().get(s)).get(frequency));
    }

    public void printJsonStructure2(String s) {
        String name = "name";
        String text = "text";
        System.out.println("\t         Название игрушки: " + ((JSONObject) fileJson.getData().get(s)).get(name));
        System.out.println("\t         Описание игрушки: " + ((JSONObject) fileJson.getData().get(s)).get(text));
        System.out.println("\t---------------------------------------------");
    }

    public Object structureJson(String s, String name){
        return ((JSONObject) fileJson.getData().get(s)).get(name);
    }

    public void printJson() {
        String[] s = arrayKey().clone();
        for (int i = 0; i < s.length; i++) {
            int r = i + 1;
            printJsonStructure(s[i], r);
        }
        System.out.println("\t---------------------------------------------");
    }

}
