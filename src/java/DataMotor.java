
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ADELINE
 */
public class DataMotor {
    private Integer id_motor;
    private String plat_motor;
    private String merk_motor;
    private String jenis_motor;
    
    Koneksi db = null;
       
    public DataMotor() {
        db = new Koneksi();
    }

    public Integer getId_motor() {
        return id_motor;
    }

    public void setId_motor(Integer id_motor) {
        this.id_motor = id_motor;
    }

    public String getPlat_motor() {
        return plat_motor;
    }

    public void setPlat_motor(String plat_motor) {
        this.plat_motor = plat_motor;
    }

    public String getMerk_motor() {
        return merk_motor;
    }

    public void setMerk_motor(String merk_motor) {
        this.merk_motor = merk_motor;
    }

    public String getJenis_motor() {
        return jenis_motor;
    }

    public void setJenis_motor(String jenis_motor) {
        this.jenis_motor = jenis_motor;
    }
    
    public List tampil() {
        List<DataMotor> data = new ArrayList<DataMotor>();
        ResultSet rs = null;

        try {
            String sql = "select * from tb_user order by nama asc";
            rs = db.ambilData(sql);
            while (rs.next()) {
                DataMotor um = new DataMotor();
                um.setId_motor(rs.getInt("id_motor"));
                um.setPlat_motor(rs.getString("plat_motor"));
                um.setMerk_motor(rs.getString("merk_motor"));
                um.setJenis_motor(rs.getString("jenis_motor"));
                data.add(um);

            }
            db.diskonek(rs);
        } catch (Exception ex) {
            System.out.println("Terjadi Kesalahan Saat menampilkan data User" + ex);
        }
        return data;
    }

}
