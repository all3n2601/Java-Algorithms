import java.util.Scanner;

public class Strobogrammatic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number :");
        String num = sc.nextLine();
        String s1 = "";

        for (int i = 0; i < num.length(); i++) {
            char c = num.charAt(i);

            if (c == '0') {
                s1 = '0' + s1;
            } else if (c == '1') {
                s1 = '1' + s1;
            } else if (c == '6') {
                s1 = '9' + s1;
            } else if (c == '8') {
                s1 = '8' + s1;
            } else if (c == '9') {
                s1 = '6' + s1;
            }
        }

        if(s1.equals(num)){
            System.out.println("Yes It is Strobogrammatic");
        }else{
            System.out.println("No It is not Strobogrammatic");
        }
    }
}
