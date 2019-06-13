package ru.job4j.profession;

/**
 * Шаблон пациента врача.
 *  @author Egor Soroka ( https://vk.com/id428714363)
 *  @version 1.0
 *  @since 13.06.19
 */

public class Pacient {
    /** Имя больного. */
    private String name;
    /** Возраст больного. */
    private int age;
    /** Рост больного. */
    private double height;
    /** Вес больного. */
    private double weight;
    /** Симптомы больного. */
    private String symptoms;

    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public double getHeight(){
        return height;
    }
    public double getWeight(){
        return weight;
    }
    public  String getSymptoms(){
        return symptoms;
    }
}
