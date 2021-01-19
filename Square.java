package com.company;

public class Square extends Figure {
    public static int side (){
        return 5;
    }


    public int area = 25;
    public String color = "синий";
    public void type () {
        System.out.println("Фигура: квадрат, " + "площадь: " + area +
                " кв. ед., длина стороны: " + Square.side() + " ед., цвет: "+ color);
    }

}
