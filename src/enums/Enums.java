/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enums;

/**
 *
 * @author Gustavo
 */
public class Enums {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EnumThrones thrones=EnumThrones.VARYS;
        EnumThrones thrones1=EnumThrones.BARATHEON;
        EnumThrones thrones2=EnumThrones.TARGARYEN;
        
        thrones1.printWords();
        thrones2.printWords();
        thrones.printWords();
    }
    
}
