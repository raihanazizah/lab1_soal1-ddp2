import java.util.Scanner;

public class MinMaxCount {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Masukkan bilangan A: ");
        int A = scan.nextInt();
        System.out.println(" "); //buat space

        System.out.println("Masukkan bilangan B: ");
        int B = scan.nextInt();
        System.out.println(" "); //buat space

        System.out.println("Masukkan bilangan C: ");
        int C = scan.nextInt();
        System.out.println(" "); //buat space

        System.out.println("Masukkan bilangan D: ");
        int D = scan.nextInt();
        System.out.println(" "); //buat space

        //tentuin nilai min dan max
        int min = A;
        String minVar = "A";

        if (B < min) {
            min = B;
            minVar = "B";
        }

        if (C < min) {
            min = C;
            minVar = "C";
        }

        if (D < min) {
            min = D;
            minVar = "D";
        }

        int max = A;
        String maxVar = "A";

        if (B > max) {
            max = B;
            maxVar = "B";
        }

        if (C > max) {
            max = C;
            maxVar = "C";
        }

        if (D > max) {
            max = D;
            maxVar = "D";
        }

        System.out.println("Bilangan terkecil adalah " + minVar + " dengan nilai " + min);
        System.out.println("Bilangan terbesar adalah " + maxVar + " dengan nilai " + max);
        System.out.println(" "); //buat space


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

        scan.close();
    }
}



