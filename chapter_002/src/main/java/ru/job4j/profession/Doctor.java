package ru.job4j.profession;
/**
 * Шаблон профессии врача.
 *  @author Egor Soroka ( https://vk.com/id428714363)
 *  @version 1.0
 *  @since 13.06.19
 */

public class Doctor {
    /** Вид практики, частрая, либо государственная. */
    private String practice;

    public String getPractice() {
        return practice;
    }

    /**
     * Определение диагноза.
     * @param pacient данные больного.
     * @return диагноз.
     */
    public String diagnose(Pacient pacient){
        String diagnose = "";
        return diagnose;
    }

}
