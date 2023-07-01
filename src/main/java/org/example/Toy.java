package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;


public class Toy implements ViewInterface {

    public void addToy() {
        Map<String, Object> dataS = new HashMap<>();
        long id = idUnix.id();
        String nameKey = "toy_" + String.valueOf(id);
        dataS.put("id", id);
        dataS.put("name", scann.scan_2());
        dataS.put("text", scann.scan_3());
        dataS.put("frequency", scann.scan_4());
        fileJson.addJson(nameKey, dataS);
    }

    public void delToy() {
        String[] s = printData.arrayKey().clone();
        int delNum = Integer.parseInt(scann.scan_5(s.length)) - 1;
        if (delNum != -1) {
            fileJson.getData().remove(s[delNum]);
            fileJson.delJson();
        }
    }

    int generateRandomInt(int upperRange){
        Random random = new Random();
        return random.nextInt(1, upperRange + 1);
    }
    public void raffleToy(){
        String[] s = printData.arrayKey().clone();
        String frequency = "frequency";
        String strB = (String) printData.structureJson(s[0], frequency);
        int b = Integer.parseInt(strB);
        int positionB = 0;
        for (int i = 1; i < s.length; i++) {
            String strA = (String) printData.structureJson(s[i], frequency);
            int a = Integer.parseInt(strA);
            if (a > b) {
                b = a;
                positionB = i + 1;
            }
        }
        int randPosition = generateRandomInt(s.length);
        System.out.println("\t---------------------------------------------");
        if (randPosition == positionB) {
            System.out.println("\t-  Вы выйграли!  -");
            printData.printJsonStructure2(s[positionB-1]);
            fileJson.getData().remove(s[positionB-1]);
            fileJson.delRaffleJson();
        }
        else {
            System.out.println("\t-  Вы проиграли!  -");
            System.out.println("\t---------------------------------------------\n");
        }
    }
}
