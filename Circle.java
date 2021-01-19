package com.company;

public class Circle extends Figure {

    public static int radius (){
        return 2;
    }

    public float area = 12.56f;
    public String color = "красный";
    public void type () {
        System.out.println("Фигура: круг, " + "площадь: " + area +
                " кв. ед., радиус: " + Circle.radius() + " ед., цвет: "+ color);
    }

}
