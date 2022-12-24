/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugassesi9mahasiswa;

/** Heru Subakti_20210040071_TI21a
 *
 * @author Heru Subakti
 */
public class Mahasiswaku {
    public static void main(String[] args) {
        Mahasiswa <String, String, Integer> m = new Mahasiswa<>();
        m.setNim("202100888999");
        m.setNama("Herman Buston");
        m.setClass(21);

        System.out.println(m.getNim());
        System.out.println(m.getNama());
        System.out.println(m.getClass());
    }
}

