package ru.job4j.profession;

/**
 * Шаблон профессий.
 *  @author Egor Soroka ( https://vk.com/id428714363)
 *  @version 1.0
 *  @since 13.06.19
 */

public class Profession {
    /** Стаж работы. */
    private double standing;
    /** имя сотрудника. */
    private String name;
    /** Фамилия сотрудника. */
    private String surname;
    /** Образование сотрудника. */
    private String education;
    /** Оклад сотрудника. */
    private double salary;
    /** График работы сотрудника. */
    private String timetable;





    public double getStanding() {
        return standing;
    }
    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public String getEducation() {
        return education;
    }
    public double getSalary() {
        return salary;
    }
    public String getTimetable() {
        return timetable;
    }
}
