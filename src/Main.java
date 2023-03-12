import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap n");
        n= scanner.nextInt();
        double c;
        c= Math.sqrt(n);
        if (Math.pow(c,2)==n){
            System.out.println("la so cp");
        }
        else {
            System.out.println("khong phai so cp");
        }
    }
}