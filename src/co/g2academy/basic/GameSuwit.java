package co.g2academy.basic;

import javax.swing.JOptionPane;

public class GameSuwit {
    public static void main(String[] args) {
        int pointUser = 0;
        int pointCom = 0;
        
        JOptionPane.showMessageDialog(null, "Selamat Datang di Game Suwit by Asep!!!");
        int selectUser = JOptionPane.showConfirmDialog(null, "Apakah Anda Ingin Bermain", "Games Suwit by Asep",
                JOptionPane.YES_NO_OPTION);

        boolean main = selectUser ==JOptionPane.YES_OPTION;
        while (main) {
                String pilihanUser = JOptionPane.showInputDialog(null, "Silahkan Masukkan Pilihan Anda :\nGajah, Semut atau Orang??");
                String hasil = cekHasil(pilihanUser);
                if(hasil.toLowerCase().equals("menang")){
                    pointUser++;
                    tampilScore(pointUser, pointCom);
                } else if(hasil.toLowerCase().equals("kalah")){
                    pointCom++;
                    tampilScore(pointUser, pointCom);
                } else {
                    tampilScore(pointUser, pointCom);
                }

                int confirm = JOptionPane.showConfirmDialog(null, "Anda Ingin Bermain Lagi", "Confirm", JOptionPane.YES_NO_OPTION);
                if (confirm== JOptionPane.YES_OPTION){
                    main=true;
                } else {
                    JOptionPane.showMessageDialog(null, "Terimakasih Telah Bermain", "Games Suwit", JOptionPane.INFORMATION_MESSAGE);
                    main = false;
                }
            
        }
    }

    public static String komputer(double pilihanKomputer) {
        String hasil ="";
        if (pilihanKomputer >0.66) {
            hasil = "Gajah";
        }else if(pilihanKomputer >=0.33 && pilihanKomputer <= 0.66) {
            hasil = "Semut";
        } else {
            hasil = "orang";
        }
        return hasil;
    }

    public static String cekHasil(String inputpilihanUser){
        double pilihanKomputer = (double)Math.random();
        String comp = komputer(pilihanKomputer);
        String hasil="";

        if(comp.toLowerCase().equals(inputpilihanUser.toLowerCase())){
                hasilSeri(pilihanKomputer, inputpilihanUser);
                hasil="seri";
        } else if (inputpilihanUser.toLowerCase().equals("semut")) {
            if(comp.toLowerCase().equals("gajah")){
                hasilMenang(pilihanKomputer, inputpilihanUser);
                hasil = "menang";
            } else {
                hasilKalah(pilihanKomputer, inputpilihanUser);
                hasil = "kalah";
            }
        } else if (inputpilihanUser.toLowerCase().equals("gajah")) {
            if (comp.toLowerCase().equals("orang")) {
                hasilMenang(pilihanKomputer, inputpilihanUser);
                hasil = "menang";
            } else {
                hasilKalah(pilihanKomputer, inputpilihanUser);
                hasil = "kalah";
            }
        } else if (inputpilihanUser.toLowerCase().equals("orang")) {
            if (comp.toLowerCase().equals("semut")) {
                hasilMenang(pilihanKomputer, inputpilihanUser);
                hasil = "menang";
            } else {
                hasilKalah(pilihanKomputer, inputpilihanUser);
                hasil = "kalah";
            }
        } else {
            JOptionPane.showMessageDialog(null, "Maaf Input yang anda Masukkan Salah", "Tanya",
                    JOptionPane.INFORMATION_MESSAGE);
        }
        return hasil;
    }

    public static void hasilMenang(double pilihanKomputer, String inputpilihanUser) {
        String comp = komputer(pilihanKomputer);
        JOptionPane.showMessageDialog(null, "Anda Memilih " + inputpilihanUser + " dan Komputer Memilih " + comp +
        "\n Maka Anda Menang!!!", "Result", JOptionPane.INFORMATION_MESSAGE);
        
    }

    public static void hasilKalah(double pilihanKomputer, String inputpilihanUser) {
        String comp = komputer(pilihanKomputer);
        JOptionPane.showMessageDialog(null, "Anda Memilih " + inputpilihanUser + " dan Komputer Memilih " + comp + "\n Maaf Anda Kalah!!!",
        "Result", JOptionPane.INFORMATION_MESSAGE);
    
    }

    public static void hasilSeri(double pilihanKomputer,  String inputpilihanUser) {
        String comp = komputer(pilihanKomputer);
        JOptionPane.showMessageDialog(null, "Anda Memilih " + inputpilihanUser + " dan Komputer Memilih " + comp +
                "\n Maka Anda Seri!!!", "Result", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void tampilScore(int poinUser , int pointComp) {
        JOptionPane.showMessageDialog(null, "Score Anda vs Computer " + poinUser + " VS " + pointComp , "Result", JOptionPane.INFORMATION_MESSAGE);
    }
}
