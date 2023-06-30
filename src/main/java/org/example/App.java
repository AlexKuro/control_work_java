package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class App implements ViewInterface {
    private Boolean flag;
    private Boolean fl1 = true;
    public static void Start() {

        fileJson.fileDataJson();
        logToy.log();
        logToy.setLogger("Запуск программы 'Розыгрыш игрушек в магазине детских товаров'.");
        view.interface_0();
        do {
            System.out.println("\t\tКоличество игрушек в магазине: " + fileJson.getToyCount());
            if (fileJson.getToyCount() > 2) {
                choice.choice_0(view.interface_main());
            }
            else {
                choice.choice_0_1(view.interface_main_1());
            }
        } while (app.end());
    }

    Boolean end() {
        return getFlag();
    }

    public void endProg() {
        System.out.print("Завершение программы 'Розыгрыш игрушек в магазине детских товаров'.\n\n");
        logToy.setLogger("Завершение программы 'Розыгрыш игрушек в магазине детских товаров'.");
        intScanner.close();
        stringScanner.close();
        setFlag(false);
        setFl1(false);

    }



}
