import java.util.Random;
import java.util.Scanner;

public class TanyaJawab {
    public static void main(String[] args) {
        Scanner baca = new Scanner(System.in);
        Random acak = new Random();

        //meminta input kalimat dari user
        System.out.print("Masukkan sebuah kalimat: ");
        String kalimat = baca.nextLine();

        //memecah kalimat dengan random index 
        int start = acak.nextInt(kalimat.length() - 1); //index kalimat awal
        int end = start + 1 + acak.nextInt(kalimat.length() - start - 1); //index kalimat akhir

        //kasih pertanyaan
        System.out.println(""); //for space
        System.out.println("Apa substring dari index " + start + " hingga " + end + "?");

        //menerima jawaban dari user
        String jawaban = baca.nextLine();

        //ambil substring yang benar
        String benar = kalimat.substring(start, end + 1);

        //cek jawaban
        if (jawaban.equals(benar)) {
            System.out.println("Waw, jawaban kamu benar \u2714 !");
        } else {
            System.out.println("\\u2718 Yahh, jawaban kamu kurang tepat. Jawaban yang benar adalah: " + benar);
        }

        baca.close();

        System.out.println(""); //for space
        System.out.println("⠟⠛⠛⢛⣛⡛⠛⠿⢿⣿⣯⣭⢻⣿⢟⣭⣿⣿⡿⠿⠛⣛⣛⠛⠛⠛⢻");
        System.out.println("⣷⣄⠀⢛⣛⢰⣿⣶⣦⣍⠻⣿⡏⡟⣼⡿⢛⣡⣴⣶⣷⡆⣛⡃⠀⣰⣿");
        System.out.println("⣿⣿⣧⠀⢺⣬⡭⢛⣛⣿⢷⣎⠻⠃⢋⣴⢿⣿⣛⡛⢭⣬⡓⠀⣼⣿⣿");
        System.out.println("⣿⣿⣿⣆⠀⠐⠯⡈⠿⠿⡛⢚⡁⠀⣈⡚⣛⠿⠿⠡⠝⠂⢀⣼⣿⣿⣿");
        System.out.println("⣿⣿⣿⣿⣷⡦⠀⣢⣿⡾⣫⢗⢅⢀⢪⡫⣿⢷⣯⣆⠠⣴⣿⣿⣿⣿⣿");
        System.out.println("⣿⣿⣿⣿⣿⡃⠠⡙⡉⡺⣣⡏⣼⣿⡆⢳⡝⠇⣙⣋⠀⢸⣿⣿⣿⣿⣿");
        System.out.println("⣿⣿⣿⣿⣿⣧⠀⠸⢓⢳⡿⢠⣿⣿⣿⡈⣿⠘⡘⠊⠀⣽⣿⣿⣿⣿⣿");
        System.out.println("⣿⣿⣿⣿⣿⣿⣷⡄⣤⣴⣶⣿⣿⣿⣿⣷⣶⣦⡄⢰⣿⣿⣿⣿⣿⣿⣿");
        System.out.println("⣿⣿⣿⣿⣿⣿⡏⢀⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠀⣻⣿⣿⣿⣿⣿⣿");

        String butterfly = new String(Character.toChars(0x1F98B)); // 🦋
        System.out.println("========================================");
        System.out.println("Raihana Nur Azizah " + butterfly + " (NPM: 2406413426)");
    }
}


