package org.example;

public class ViewSign {

    public String SignField(Integer n) {
        String s = "";
        if (n == 0) s = "\t-  Главное меню  - ";
        if (n == 1) s = "\t-  Добавление игрушек  - ";
        if (n == 2) s = "\t-  Список игрушек  - ";
        if (n == 3) s = "\t-  Розыгрыш игрушек  - ";
        if (n == 4) s = "\t-  Удаление игрушек  - ";
        return s;
    }
}
