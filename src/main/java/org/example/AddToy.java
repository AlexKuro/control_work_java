package org.example;

import java.util.HashMap;
import java.util.Map;


public class AddToy implements ViewInterface {

    public void addToy() {
        Map<String, Object> dataS = new HashMap<String, Object>();
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
        Integer delNum = Integer.valueOf(scann.scan_5(s.length)) - 1;
        if (delNum != -1) {
            fileJson.getData().remove(s[delNum]);
            fileJson.delJson();
        }
    }

}
