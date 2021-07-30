/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ADELINE
 */
public class Peminjaman {
    int id_peminjaman, id_motor, id_user, durasi;
    String tgl_sewa, waktu_ambil, waktu_kembali;

    Koneksi db = null;
       
    public Peminjaman() {
        db = new Koneksi();
    }
    
    public int getId_peminjaman() {
        return id_peminjaman;
    }

    public void setId_peminjaman(int id_peminjaman) {
        this.id_peminjaman = id_peminjaman;
    }

    public int getId_motor() {
        return id_motor;
    }

    public void setId_motor(int id_motor) {
        this.id_motor = id_motor;
    }

    public int getId_user() {
        return id_user;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }

    public int getDurasi() {
        return durasi;
    }

    public void setDurasi(int durasi) {
        this.durasi = durasi;
    }

    public String getTgl_sewa() {
        return tgl_sewa;
    }

    public void setTgl_sewa(String tgl_sewa) {
        this.tgl_sewa = tgl_sewa;
    }

    public String getWaktu_ambil() {
        return waktu_ambil;
    }

    public void setWaktu_ambil(String waktu_ambil) {
        this.waktu_ambil = waktu_ambil;
    }

    public String getWaktu_kembali() {
        return waktu_kembali;
    }

    public void setWaktu_kembali(String waktu_kembali) {
        this.waktu_kembali = waktu_kembali;
    }
    
     public List tampil() {
        List<Peminjaman> data = new ArrayList<Peminjaman>();
        ResultSet rs = null;

        try {
            String sql = "select * from tb_peminjaman";
            rs = db.ambilData(sql);
            while (rs.next()) {
                Peminjaman um = new Peminjaman();
                um.setId_peminjaman(rs.getInt("id_peminjaman"));
                um.setId_user(rs.getInt("id_user"));
                um.setId_motor(rs.getInt("id_motor"));
                um.setTgl_sewa(rs.getString("tanggal_sewa"));
                um.setWaktu_ambil(rs.getString("waktu_ambil"));
                um.setWaktu_kembali(rs.getString("waktu_kembali"));
                um.setDurasi(rs.getInt("durasi_pinjam"));
                data.add(um);

            }
            db.diskonek(rs);
        } catch (Exception ex) {
            System.out.println("Terjadi Kesalahan Saat menampilkan data User" + ex);
        }
        return data;
    }
     
}
