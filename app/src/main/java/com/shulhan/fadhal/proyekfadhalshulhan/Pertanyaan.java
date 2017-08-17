package com.shulhan.fadhal.proyekfadhalshulhan;

public class Pertanyaan {
    public String jenisPertanyaan[] = {
            "Teks proklamasi kemerdekaan Indonesia yang otentik diketik oleh...", //Pertanyaan 1
            "Yang dipercaya dan beranggung jawab dalam penyebarluasan berita proklamasi adalah...", //Pertanyaan 2
            "Salah satu inti pidato singkat Ir. Soekarno sebelum membacakan teks proklamasi kemerdekaan  Indonesia adalah....", //Pertanyaan 3 //Soal 3
            "Naskah proklamasi disusun di....", //Pertanyaan 4 //Soal 11
            "Proklamasi kemerdekaan 17 Agustus 1945 bagi bangsa Indonesia mempunyai arti seperti tersebut di  bawah ini, kecuali ...", //Pertanyaan 5 //Soal 28
            "Perselisihan golongan muda dan golongan tua sejak peristiwa Rengasdengklok berakhir setelah...",//Pertanyaan 6 //Soal 25
            "Perselisihan antara golongan pemuda dengan golongan tua dalam peristiwa Rengas Dengklok dapat berakhir setelah", //Pertanyaan 7 //Soal 26
            "Usaha pertama bangsa Indonesia dalam mempertahankan kemerdekaan  dilakukan  dengan cara....", //Pertanyaan 8 //Soal 29
            "Peran pemuda Suhud dalam peristiwa proklamasi kemerdekaan Indonesia adalah ", //Pertanyaan 9 //Soal 30
            "Setelah naskah proklamasi ditulis dan dibacakan Ir. Soekarno dihadapan para pemuda, muncul masalah baru yaitu...", //Pertanyaan 10 //Soal 27


    };

    private String jenisPilihan[][] = {
            {"B.M. Diah", "Sukarni", "Chaerul Saleh", "Sayuti Melik"}, //Jawab1
            {"B.M. Diah", "Yusuf Kunto", "Adam Malik", "Sayuti Melik"}, //Jawab2
            {"Perlunya mewujudkan kehidupan berbangsa menuju masyarakat yang adil dan makmur", "Perjuangan  kemerdekaan Indonesia sudah berakhir", "Kemerdekaan adalah hak segala bangsa", "Perjuangan bangsa  Indonesia untuk mencapai kemerdekaan tidak pernah berhenti"}, //Jawab3
            {"Markas Menteng 31 milik pemuda", "Jln Pegangsaan  Timur  no  65 Jakarta", "Jalan Imam Bonjol No. 1", "Jln Pegangsaan Timur No 56 Jakarta"}, //Jawab4
            {"Indonesia terbukti mendapat hadiah kemerdekaan dari Jepang", "Mulailah revolusi Indonesia dari  masyarakat terjajah menjadi masyarakat yang merdeka", "Akhirnya Negara dan bangsa Indonesia yang merdeka", "Indonesia terlepas dari janji-janji hadiah kemerdekaan Jepang"}, //Jawab5
            {"Datangnya pasukan sekutu di Indonesia", "Proklamasi kemerdekaan", "Jepang meninggalkan Indonesia", "Datangnya Ahmad Soebarjo ke Rengasdengklok"}, //Jawab6
            {"Ir. Soekarno- Hatta kembali ke Jakarta memimpin sidang PKI", "Jepang menyerah pada sekutu", "Proklamasi kemerdekaan  Indonesia", "Ir. Soekarno dan Moh. Hatta terpilih sebagai presiden dan wakil presiden."}, //Jawab7
            {"Peningkatan taraf hidup rakyat", "Konfrontasi dan diplomasi", "Pembentukan angkatan perang yang kuat", "Perjuangan fisik"}, //Jawab8
            {"Mengamankan  jalannya  upacara  proklamasi", "Pengibar bendera Merah Putih dalam upacara proklamasi", "Memimpin  pelaksanaan  proklamasi kemerdekaan", "Mendampingi pembacaan teks proklamasi kemerdekaan"}, //Jawab9
            {"Soal siapa yang menanda tangani naskah proklamasi", "Siapa yang membacakan naskah proklamasi", " Soal tulisan yang  tidak jelas", "Soal perijinan dari pemerintah Jepang"}, //Jawab10

    };

    private String jenisJawabanBenar[] = {"Sayuti Melik", "B.M. Diah", "Perlunya mewujudkan kehidupan berbangsa menuju masyarakat yang adil dan makmur", "Jalan Imam Bonjol No. 1", "Indonesia terbukti mendapat hadiah kemerdekaan dari Jepang", "Jepang meninggalkan  Indonesia", "Proklamasi kemerdekaan Indonesia", "Perjuangan fisik", "Pengibar bendera Merah Putih dalam upacara proklamasi", "Soal perijinan dari pemerintah Jepang",
    };

    public String dapatPertanyaan(int a) {
        String pertanyaan = jenisPertanyaan[a];
        return pertanyaan;
    }

    public String dapatPilihan1(int a) {
        String pilihan = jenisPilihan[a][0];
        return pilihan;
    }

    public String dapatPilihan2(int a) {
        String pilihan = jenisPilihan[a][1];
        return pilihan;
    }

    public String dapatPilihan3(int a) {
        String pilihan = jenisPilihan[a][2];
        return pilihan;
    }

    public String dapatPilihan4(int a) {
        String pilihan = jenisPilihan[a][3];
        return pilihan;
    }

    public String dapatJawabanBenar(int a) {
        String jawaban = jenisJawabanBenar[a];
        return jawaban;
    }
}
