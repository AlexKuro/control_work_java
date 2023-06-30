package org.example;

public class Choice implements ViewInterface {

    public void choice_0(Integer n) {
        switch (n) {
            case 1:
                do {
                    view.setFieldNum(1);
                    view.interface_1();
                    addToy.addToy();
                    app.setFl1(false);
                    view.setFieldNum(0);
                } while (app.getFl1());
                break;
            case 2:
                view.setFieldNum(2);
                view.interface_2();
//                printData.printJson();
                printData.printJson();

                view.setFieldNum(0);
                break;
            case 3:
                do {
                    view.setFieldNum(3);
//                    choice_3(view.interface_3());
                } while (app.getFl1());
                break;
            case 4:
                do {
                    view.setFieldNum(4);
//                    choice_4(view.interface_4());
                } while (app.getFl1());
                break;
            case 9:
                app.endProg();
                break;
            default:
                System.out.print("Формат ввода неверный!\n");
                break;
        }
    }


    public void choice_0_1(Integer n) {
        switch (n) {
            case 1:
                do {
                    view.setFieldNum(1);
                    view.interface_1();
                    addToy.addToy();
                    app.setFl1(false);
                    view.setFieldNum(0);
                } while (app.getFl1());
                break;
            case 9:
                app.endProg();
                break;
            default:
                System.out.print("Формат ввода неверный!\n");
                break;
        }
    }
}
