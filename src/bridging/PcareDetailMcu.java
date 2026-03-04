package bridging;

import java.util.List;
import java.util.ArrayList;

public class PcareDetailMcu {

    // Contoh method untuk tes koneksi / panggil WS
    public boolean tesKoneksi(String noKunjungan) {
        // logika panggil WS di sini
        // return true jika berhasil
        return true;
    }

    // Method untuk mendapatkan data MCU untuk JTable
    public Object[][] getDataMCU(String noKunjungan) throws Exception {
        // Misal di sini panggil WS PCare dan ambil data MCU
        // Contoh dummy data:
        List<Object[]> list = new ArrayList<>();
        list.add(new Object[]{"Tekanan Darah", "120/80", "mmHg", "90/60 - 120/80"});
        list.add(new Object[]{"Berat Badan", "65", "kg", "50 - 70"});
        list.add(new Object[]{"Hemoglobin", "14", "g/dL", "12 - 16"});

        // Ubah List<Object[]> ke Object[][]
        Object[][] data = new Object[list.size()][];
        for (int i = 0; i < list.size(); i++) {
            data[i] = list.get(i);
        }
        return data;
    }
}
