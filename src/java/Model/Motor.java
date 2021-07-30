package Model;


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
public class Motor {
    String plat,merk,jenis;
    int id_motor, harga;
    
    Koneksi db = null;
       
    public Motor() {
        db = new Koneksi();
    }

    public String getPlat() {
        return plat;
    }

    public void setPlat(String plat) {
        this.plat = plat;
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public int getId_motor() {
        return id_motor;
    }

    public void setId_motor(int id_motor) {
        this.id_motor = id_motor;
    }
    
    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }
    
    public void hapus(){
        String sql="DELETE FROM tb_motor WHERE `tb_motor`.`id_motor`="+id_motor+"";
        db.simpanData(sql);
        System.out.println("");
    }
    
    public void update(int aa){
    String sql="UPDATE tb_motor SET plat_motor='"+plat+"',merk_motor='"+merk+"',jenis_motor='"+jenis+"', harga='"+harga+"' WHERE `tb_motor`.`id_motor`="+aa+"";
    db.simpanData(sql);
}
    
    public List tampil() {
        List<Motor> data = new ArrayList<Motor>();
        ResultSet rs = null;

        try {
            String sql = "select * from tb_motor";
            rs = db.ambilData(sql);
            while (rs.next()) {
                Motor um = new Motor();
                um.setId_motor(rs.getInt("id_motor"));
                um.setPlat(rs.getString("plat_motor"));
                um.setMerk(rs.getString("merk_motor"));
                um.setJenis(rs.getString("jenis_motor"));
                um.setHarga(rs.getInt("harga"));
                data.add(um);

            }
            db.diskonek(rs);
        } catch (Exception ex) {
            System.out.println("Terjadi Kesalahan Saat menampilkan data User" + ex);
        }
        return data;
    }
    
    public void simpan(){
    String sql="INSERT INTO tb_motor (`id_motor`, `plat_motor`, `merk_motor`, `jenis_motor`, `harga`)VALUES('"+id_motor+"','"+plat+"','"+merk+"','"+jenis+"','"+harga+"')";
    db.simpanData(sql);
  }
    public List cariID() {
        List<Motor> data = new ArrayList<Motor>();
        ResultSet rs = null;

        try {
            String sql = "SELECT * FROM tb_motor WHERE ID='"+id_motor+"'";
            rs = db.ambilData(sql);
            while (rs.next()) {
                Motor m = new Motor();
                m.setId_motor(rs.getInt("id_motor"));
                m.setPlat(rs.getString("plat_motor"));
                m.setMerk(rs.getString("merk_motor"));
                m.setJenis(rs.getString("jenis_motor"));
                m.setHarga(rs.getInt("harga"));
                data.add(m);

            }
            db.diskonek(rs);
        } catch (Exception ex) {
            System.out.println("Terjadi Kesalah Saat menampilkan Cari ID" + ex);
        }
        return data;

    }
}
