package percabangan;

public class PercabanganSwitch {
    public static void main(String[] args) {
        char nilai='D';
        switch(nilai){
            case 'A':
                System.out.println("Mhs    : \"Terima kasih pak\"");
                System.out.println("Dosen  : \"Selamat ya !!\"");
                break;
            case 'B':
                System.out.println("Mhs    : \"Kenapa ulun kada dapat A pak\"");
                System.out.println("Dosen  : \"!@#$%\"");
                break;
            case 'C':
                System.out.println("Mhs    : \"Ulun turun pul Pak ai, tugas pul jua\"");
                System.out.println("Dosen  : \"Tapi bisa lah menjawab ujian?\"");
                System.out.println("Mhs    : \"Hihihi..\"");
                break;
            default:
                System.out.println("Mhs    : \"Ulun turun pul Pak ai, tugas pul jua\"");
                System.out.println("Dosen  : \"Bujur jua kah?\"");
                System.out.println("Dosen  : \"*meriksa berkas\"");
                System.out.println("Dosen  : \"*menceleng\"");
                System.out.println("Mhs    : \"Kabur..\"");
                break;
        }
    }
}

