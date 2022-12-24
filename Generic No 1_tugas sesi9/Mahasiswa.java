/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugassesi9mahasiswa;

/**Heru Subakti_20210040071_TI21a
 *
 * @author Heru Subakti
 */
    public class Mahasiswa<mahasiswanim, mahasiswanama, mahasiswakelas> {
    private mahasiswanim nim;
    private mahasiswanama nama;
    private mahasiswakelas kelas;
    
    public void setNim(mahasiswanim nim) {
        this.nim = nim;
    }
    
    public mahasiswanim getNim() {
        return nim;
    }
    
    public void setNama(mahasiswanama nama) {
        this.nama = nama;
    }
    
    public mahasiswanama getNama() {
        return nama;
    }
    
    public void setClass(mahasiswakelas kelas) {
        this.kelas = kelas;
    }
    
    public mahasiswakelas getKelas() {
        return kelas;
    }
    }
