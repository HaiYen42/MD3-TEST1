import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Menu\n"+
                "1. Nhập số phần tử và giá trị cho các phần tử của mảng \n"+
                "2. In ra giá trị các phần tử trong mảng \n"+
                "3. Tính tổng và in ra các phần tử có giá trị lẻ trong mảng\n"+
                "4. In ra giá trị lớn nhất và nhỏ nhất trong mảng \n"+
                "5. Thống kê số lượng phần tử chia hết cho 2 và 3 trong mảng\n"+
                "6. Mảng đảo ngược \n"+
                "7. In ra các phần tử và tổng số các phần tử là số nguyên tố trong mảng\n"+
                "8. Sắp xếp mảng tăng dần \n"+
                "9. Thoát\n");
        System.out.println("Vui lòng chọn 1 lựa chọn");

        int [] array = new int[100];
        int option = input.nextInt();
        switch (option){
            case 1:
                //Nhập số phần tử và giá trị các phần tử trong mảng
                ElementofArr(array);
                break;
            case 2:
                //In ra các giá trị phần tử trong mảng
                PrintElementArray(array);
                break;
            case 3:
                // Tính tổng và in ra các phần tử có giá trị lẻ trong mảng
                PrintTotalAndOdd(array);
                break;
            case 4:
                //In ra giá trị Max và Min trong mảng
                PrintMaxAndMin(array);
                break;
            case 5:
                //Phần tử chia hết cho 2 và 3
                Divide2And3(array);
                break;
            case 6:
                //Mảng đảo ngược
                ReverseArr(array);
                break;
            case 7:
                //Số nguyên tố
                printPrime(array);
                break;
            case 8:
                //Sắp xếp mảng tăng dần
                SortInArr(array);
                break;
            case 9:
                //Thoát
                System.out.println("Bạn đã thoát khỏi chương trình");
                break;
        }
    }
    public static void ElementofArr(int [] array){
        int n;
        Scanner input= new Scanner(System.in);
        do{
          System.out.println("Nhập số phần tử trong mảng");
            n= input.nextInt();
          if (n<=0||n>100) {
              System.out.println("Vui lòng nhập n đúng định dạng >0 và <100");
          }
      }
      while(n<0||n>100);
        for (int i = 0; i < n; i++) {
            System.out.println("Phần tử thứ "+ (i+1) +" là ");
            array[i]= input.nextInt();
        }
    }
    public static void PrintElementArray(int [] array){
        int n;
        Scanner input= new Scanner(System.in);
        do{
            System.out.println("Nhập số phần tử trong mảng");
            n= input.nextInt();
            if (n<=0||n>100) {
                System.out.println("Vui lòng nhập n đúng định dạng >0 và <100");
            }
        }
        while(n<0||n>100);
        for (int i = 0; i < n; i++) {
            System.out.println("Phần tử thứ "+ (i+1) +" là ");
            array[i]= input.nextInt();
        }
        System.out.println("Phần tử trong mảng là");
        for (int i = 0; i < n; i++) {
            System.out.print("\t "+ array[i]);
        }
    }
    public static void PrintTotalAndOdd(int [] array){
        int n;
        int total=0;
        Scanner input= new Scanner(System.in);
        do{
            System.out.println("Nhập số phần tử trong mảng");
            n= input.nextInt();
            if (n<=0||n>100) {
                System.out.println("Vui lòng nhập n đúng định dạng >0 và <100");
            }
        }
        while(n<0||n>100);
        for (int i = 0; i < n; i++) {
            System.out.println("Phần tử thứ "+ (i+1) +" là ");
            array[i]= input.nextInt();
        }
        System.out.println("Phần tử lẻ trong mảng là");
        for (int i = 0; i < n; i++) {
            total+=array[i];
            if(array[i]%2!=0){
                System.out.print("\t"+ array[i]);
            }
        }

            System.out.println("\nTổng của mảng là "+ total);
    }
    public static void PrintMaxAndMin(int [] array){
        int n;
        Scanner input= new Scanner(System.in);
        do{
            System.out.println("Nhập số phần tử trong mảng");
            n= input.nextInt();
            if (n<=0||n>100) {
                System.out.println("Vui lòng nhập n đúng định dạng >0 và <100");
            }
        }
        while(n<0||n>100);
        for (int i = 0; i < n; i++) {
            System.out.println("Phần tử thứ "+ (i+1) +" là ");
            array[i]= input.nextInt();
        }
        int max=array[0];
        for (int i = 0; i < n; i++) {
            if (array[i]>max){
                max=array[i];
            }
        }
        System.out.println("Giá trị lớn nhất của mảng là: "+ max);
        int min= array[0];
        for (int i = 0; i < n; i++) {
            if (array[i]<min){
                min=array[i];
            }
        }
        System.out.println("Giá trị nhỏ nhất trong mảng là: "+ min);
    }
    public static void Divide2And3(int [] array){
        int n;
        Scanner input= new Scanner(System.in);
        do{
            System.out.println("Nhập số phần tử trong mảng");
            n= input.nextInt();
            if (n<=0||n>100) {
                System.out.println("Vui lòng nhập n đúng định dạng >0 và <100");
            }
        }
        while(n<0||n>100);
        for (int i = 0; i < n; i++) {
            System.out.println("Phần tử thứ "+ (i+1) +" là ");
            array[i]= input.nextInt();
        }
        System.out.println("Phần tử chia hết cho 2 trong mảng là: ");
        for (int i = 0; i < n; i++) {
            if (array[i]%2==0){
                System.out.print("\t"+ array[i]);
            }
        }
        System.out.println("\nPhần tử chia hết cho 3 trong mảng là: ");
        for (int i = 0; i < n; i++) {
            if (array[i]%3==0){
                System.out.print("\t"+ array[i]);
            }
        }
    }
    public static void ReverseArr(int [] array){
        int n;
        Scanner input= new Scanner(System.in);
        do{
            System.out.println("Nhập số phần tử trong mảng");
            n= input.nextInt();
            if (n<=0||n>100) {
                System.out.println("Vui lòng nhập n đúng định dạng >0 và <100");
            }
        }
        while(n<0||n>100);
        for (int i = 0; i < n; i++) {
            System.out.println("Phần tử thứ "+ (i+1) +" là ");
            array[i]= input.nextInt();
        }
        System.out.println("Phần tử trong mảng là");
        for (int i = 0; i < n; i++) {
            System.out.print("\t "+ array[i]);
        }

        for (int i = 0, j =(n-1); i <j ; i++,j--) {
            int temp = array[i];
            array[i]= array[j];
            array[j]= temp;
        }
        System.out.println("\nMảng đảo ngược là ");
        for (int i = 0; i < n; i++) {
            System.out.print("\t"+ array[i]);
        }
    }

    public static boolean checkPrime(int n){
        boolean flag= true;
        if (n<=1){
//            System.out.println("ko phải số nguyên tố");
            flag= false;
        } else{
            for (int i = 2; i < n; i++) {
                if (n%i==0){
//                    System.out.println("Ko phải là số nguyên tố");
                    flag= false;
                    break;
                }
            }
        }
        return flag;
    }
    public static void printPrime(int [] array){
        int n;
        Scanner input= new Scanner(System.in);
        do{
            System.out.println("Nhập số phần tử trong mảng");
            n= input.nextInt();
            if (n<=0||n>100) {
                System.out.println("Vui lòng nhập n đúng định dạng >0 và <100");
            }
        }
        while(n<0||n>100);
        for (int i = 0; i < n; i++) {
            System.out.println("Phần tử thứ "+ (i+1) +" là ");
            array[i]= input.nextInt();
        }
        int total=0;
        System.out.println("Số nguyên tố trong mảng là: ");
        for (int i = 0; i <n ; i++) {
            boolean checkStatus = checkPrime(array[i]);
            if (checkStatus){
                System.out.print("\t"+ array[i]);
                total+=array[i];
            }
        }
        System.out.println("\n Tổng của các số nguyên tố trong mảng là "+ total);
    }
    public static void SortInArr(int [] array){
        int n;
        Scanner input= new Scanner(System.in);
        do{
            System.out.println("Nhập số phần tử trong mảng");
            n= input.nextInt();
            if (n<=0||n>100) {
                System.out.println("Vui lòng nhập n đúng định dạng >0 và <100");
            }
        }
        while(n<0||n>100);
        for (int i = 0; i < n; i++) {
            System.out.println("Phần tử thứ "+ (i+1) +" là ");
            array[i]= input.nextInt();
        }
        //In mảng
        System.out.println("Phần tử trong mảng là");
        for (int i = 0; i < n; i++) {
            System.out.print("\t "+ array[i]);
        }
        //Sắp xếp mảng
        int temp= array[0];
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if(array[i]>array[j]){
                    temp= array[j];
                    array[j]=array[i];
                    array[i]= temp;
                }
            }
        }
        System.out.println("\n Mảng sau khi sắp xếp tăng dần là");
        for (int i = 0; i < n; i++) {
            System.out.print("\t"+ array[i]);
        }
    }
}