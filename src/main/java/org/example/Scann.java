package org.example;

public class Scann implements ViewInterface {

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
            n = stringScanner.nextLine();
            try {
                Integer.valueOf(n);
                Integer t = Integer.valueOf(n);
                if (t > 0 & t < 101) {
                    fl = false;
                } else {
                    System.out.print("Формат ввода неверный! Введите цифры от 1 до 100\n");
                }

            } catch (NumberFormatException e) {
                System.out.print("Формат ввода неверный! Введите цифры от 1 до 100\n");
            }
        } while (fl);
        return n;
    }

    public String scan_5(Integer num) {
        boolean fl = true;
        String n;
        String str = "Для удалении игрушки, " +
                "\nвведите порядковый номер игрушки из списка игрушек от 1 до "
                + num.toString() + "\nили введите '0' для выхода в главное меню" + " -> ";
        do {
            System.out.print(str);
            n = stringScanner.nextLine();
            try {
                Integer.valueOf(n);
                Integer t = Integer.valueOf(n);
                if (t >= 0 & t <= num) {
                    fl = false;
                } else {
                    System.out.print("Формат ввода неверный!\n" + str + "\n");
                }
            } catch (NumberFormatException e) {
                System.out.print("Формат ввода неверный!\n" + str + "\n");
            }
        } while (fl);
        return n;
    }
}
