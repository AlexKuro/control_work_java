package org.example;

public class Scann implements ViewInterface{

    public Integer scan_1() {
        System.out.print("\nВведите число -> ");
        Integer n = intScanner.nextInt();
        return n;
    }

    public String scan_2() {
        System.out.print("Введите название игрушки -> ");
        String n = stringScanner.nextLine();
        return n;
    }

    public String scan_3() {
        System.out.print("Введите описание игрушки -> ");
        String n = stringScanner.nextLine();
        return n;
    }

    public String scan_4() {
        boolean fl = true;
        String n;

        do {
            System.out.print("Частота выпадения игрушки от 0 до 100 % -> ");
            n =  stringScanner.nextLine();
            try{
                Integer.valueOf(n);
                fl = false;
            } catch (NumberFormatException e) {
                System.out.print("Формат ввода неверный! Введите цифры от 0 до 100\n");
            }
        } while (fl);
        return n;
    }
}
