/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifelse;

/**
 *
 * @author Libuseng
 */
public class SwitchStatement {

    public static void main(String[] args) {
        String month = "December";
        float hieght;

        switch (month) {
            default:
                hieght = 13f;
                break;

            case "november":
                hieght = 11.1f;
            case "December":
                hieght = 12.0f;

            case "october":
                hieght = 10.1f;
            
                
        }
        System.out.println(month +hieght);
    }

}
