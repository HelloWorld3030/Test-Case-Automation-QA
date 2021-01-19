package com.company;

public class Triangle extends Figure {
    public static float hypotenuse (){
        return 7.1f;
    }
    public float area = 12.5f;
    public String color = "желтый";
    public void type () {
        System.out.println("Фигура: треугольник, " + "площадь: " + area +
                " кв. ед., длина гипотенузы: " + Triangle.hypotenuse() + " ед., цвет: "+ color);
    }


}
