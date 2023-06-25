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
        System.out.println("\tВыход из программы  - - - - - - - нажмите '9'");
        return scann.scan_1();
    }

    public Integer interface_main_1() {
        app.setFlag(true);
        System.out.println(viewSign.SignField(getFieldNum()));
        System.out.println("\tДобавление игрушек  - - - - - - - нажмите '1'");
        System.out.println("\tВыход из программы  - - - - - - - нажмите '9'");
        return scann.scan_1();
    }

    public void interface_1() {
        app.setFlag(true);
        System.out.println(viewSign.SignField(getFieldNum()));
    }


}
