import java.util.Scanner;



public class showArray {
    public static void main (String []args) {
        int number;
        int [] setNumber;
        Scanner scan = new Scanner(System.in);
        System.out.print("โปรดระบุจำนวนข้อมูล ");
        number = scan.nextInt();
        setNumber= new int[number];
        for(int i =0;i<number;i++) {
            System.out.print("ตัวเลขตัวที่ "+(i+1)+ " คือ ");
            int j=number-1-i;
            setNumber[j]=scan.nextInt();
            //System.out.println(setNumber[i]);
        }
        System.out.print("ตัวเลขทั้งหมดคือ ");
        for (int k=0;k<number;k++) {
            System.out.print(setNumber[k]+" ");
        }
    }
}
