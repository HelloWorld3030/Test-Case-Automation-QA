package com.company;

public class Trapezoid extends Figure {

    public static int midline(){
        return 10;
    }

    public int area = 40;
    public String color = "серый";
    public void type () {
        System.out.println("Фигура: трапеция, " + "площадь: " + area +
                " кв. ед., длина средней линии: " + Trapezoid.midline() + " ед., цвет: "+ color);
    }


}
