package ru.job4j.profession;

/**
 * Шаблон плана строительства.
 *  @author Egor Soroka ( https://vk.com/id428714363)
 *  @version 1.0
 *  @since 13.06.19
 */

public class PlanBuilding {
    /** бэджет проекта. */
    private double badge;
    /** время на строительство обьекта.*/
    private double constructionTime;
    /** Необходимые материалы. */
    private String materials;

    /**
     * Считает стоимость материалов.
     * @param badge Бэджет проекта.
     * @param materials материлы на строительство.
     * @return озвращает стоимость материалов.
     */
    public double costMaterials(double badge, double materials) {
        double cost = 0;
        return  cost;
    }

    /**
     * Рассчитывает ЗП работников
     * @return ЗП сотрудника.
     */
    public double employeeSalary() {
        double salary = 0;
        return salary;
    }

    /**
     * Считает остаток бюджета после всех процедур.
     * @return остаток баланса.
     */
    public double balance() {
        double balance = 0;
        return balance;
    }

    /**
     * Время строительства в зависимости от количества сотрудников.
     * @return время.
     */
    public String time() {
        String time = "";
        return time;
    }
}
