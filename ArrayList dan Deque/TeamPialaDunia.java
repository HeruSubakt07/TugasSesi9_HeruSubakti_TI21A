/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PialaDunia;
import java.util.ArrayList;
/**Heru Subakti_20210040071_TI21a
 *
 * @author Heru Subakti
 */
public class TeamPialaDunia {
     public static void main(String[] args) {
    ArrayList<String> teamPialaDunia = new ArrayList<>();
    
    teamPialaDunia.add("Argentina");
    teamPialaDunia.add("Brazil");
    teamPialaDunia.add("Indonesia");
    teamPialaDunia.add("Portugal");
    teamPialaDunia.add("Spanyol");
    teamPialaDunia.add("Uruguay");
    
    
    System.out.println("Daftar Team Piala Dunia :");
    for (int i = 0; i < teamPialaDunia.size(); i++) {
      System.out.println((i+1) + ". " + teamPialaDunia.get(i));
    }
    
    teamPialaDunia.remove(3); 
    teamPialaDunia.remove(2); 
    System.out.println("\nDaftar team Piala Dunia yang dihapus:");
    for (int i = 0; i < teamPialaDunia.size(); i++) {
      System.out.println((i+1) + ". " + teamPialaDunia.get(i));
    }
  }
}
