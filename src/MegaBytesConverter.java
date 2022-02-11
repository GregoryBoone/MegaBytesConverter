public class MegaBytesConverter {
    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        int XX = kiloBytes;
        int YY = kiloBytes / 1024;
        int ZZ = kiloBytes % 1024;

        if(kiloBytes < 0){
            System.out.println("Invalid Value");
        }
        else {
            System.out.println(XX + " KB = " + YY + " MB and " + ZZ + " KB");
        }
    }
}