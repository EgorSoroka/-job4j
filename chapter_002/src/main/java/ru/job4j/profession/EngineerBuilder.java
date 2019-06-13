package ru.job4j.profession;

/**
 * Инженер строитель.
 *  @author Egor Soroka ( https://vk.com/id428714363)
 *  @version 1.0
 *  @since 13.06.19
 */

public class EngineerBuilder extends  Engineer {

    public String timeManagement(){
        PlanBuilding planA = new PlanBuilding();
        return planA.time();
    }
}
