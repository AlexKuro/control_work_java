package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class View implements ViewInterface{

    private Integer fieldNum = 0;

    public void interface_0() {
        System.out.print("\033[H\033[2J"); // очистка консоли
        System.out.println("\n   - Розыгрыш игрушек в магазине детских товаров -");
    }

    public Integer interface_main() {
        app.setFlag(true);
        System.out.println(viewSign.SignField(getFieldNum()));
        System.out.println("\tДобавление игрушек  - - - - - - - нажмите '1'");
        System.out.println("\tСписок игрушек  - - - - - - - - - нажмите '2'");
        System.out.println("\tРозыгрыш игрушек  - - - - - - - - нажмите '3'");
        System.out.println("\tУдаление игрушек  - - - - - - - - нажмите '4'");
        System.out.println("\tВыход из программы  - - - - - - - нажмите '9'");
        return SCANS.scan_1();
    }

    public Integer interface_main_1() {
        app.setFlag(true);
        System.out.println(viewSign.SignField(getFieldNum()));
        System.out.println("\tДобавление игрушек  - - - - - - - нажмите '1'");
        System.out.println("\tВыход из программы  - - - - - - - нажмите '9'");
        return SCANS.scan_1();
    }

    public void interface_1() {
        app.setFlag(true);
        System.out.println(viewSign.SignField(getFieldNum()));
    }

    public void interface_2() {
        app.setFlag(true);
        System.out.println(viewSign.SignField(getFieldNum()));
    }

    public void interface_3() {
        app.setFlag(true);
        System.out.println(viewSign.SignField(getFieldNum()));
        System.out.print("Сегодня розыгрывается игрушек -> " + fileJson.getToyCount() + "\n");
        System.out.println("Чтобы выйграть игрушку должно выполнится два условия:");
        String s = "" +
                "\t1. Выпадение максимальной частоты.\n" +
                "\t2. Случайное выпадение числа с 1 до " + fileJson.getToyCount() + "." +
                "\nЕсли порядковый номер игрушки c максимальной частотой выпадения и случайное число совпадут, то ВЫ ВЫЙГРАЛИ!";
        System.out.println(s);
        System.out.println("\t-  Начинаем!  -");
    }

    public void interface_4() {
        System.out.println(viewSign.SignField(getFieldNum()));
    }

}
