/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan36;

/**
 *
 * @author 
 * NAMA		: Dandi Muhammad Iqbal
 * KELAS	: PBO11K
 * NIM		: 10118911
 * 
 */
public class Saldo {
    private int saldo_awal;
    private int saldo;
    private double bunga;
    private int targetSaldo;
    private int i;
    
    private int hitungBunga(int parSaldoAwal, double parBunga) {
        return (int) ((int) parSaldoAwal * parBunga);
    }
    
    public void hitungSaldo(int parSaldoAwal, double parBunga, int parTagetSaldo) {
        
        saldo_awal = parSaldoAwal;
        bunga = parBunga;
        saldo = saldo_awal;
        targetSaldo = parTagetSaldo;
        i = 1;
        do {
            saldo = saldo + hitungBunga(saldo, bunga);
            System.out.printf("Saldo di bulan ke-"+i+" Rp.%,10d%n",saldo);
            i++;
        } while (saldo < targetSaldo);
    }
    
}
