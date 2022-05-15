import java.util.Scanner;


public class ArrayOperator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please insert array size ");
        int size = scan.nextInt();
        int[] box1 = new int[size];
        int[] box2 = new int[size];
        int[] box3 = new int[size];
        int sum=0;

        for (int j=0;j<2;j++) {
            if (j == 0) {
                for (int i = 0; i < size; i++) {
                    System.out.print("Please insert " + (i + 1) + " number of Box1 = ");
                    box1[i] = scan.nextInt();
                }
            }
            else {
                for (int i = 0; i < size; i++) {
                    System.out.print("Please insert " + (i + 1) + " number of Box2 = ");
                    box2[i] = scan.nextInt();
                }
            }
        }
        for (int i=0;i<size;i++){
            box3[i]=box1[i]*box2[i];
            sum = sum+box3[i];
        }
        for (int i=0; i<size;i++){
            System.out.print(box3[i]+" ");
        }
        System.out.println("\n"+sum);

    }
}
