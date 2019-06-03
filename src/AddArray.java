import java.util.Scanner;

public class AddArray {
    public static void main(String[] args) {
        System.out.println("Nhập giá trị cho mảng 1");

        Scanner scanner=new Scanner(System.in);

        int[] arr1= new int[5];
        int[] arr2= new int[5];

        for (int i=0; i<arr1.length; i++){
            System.out.println("index"+i);
            int input=scanner.nextInt();
            arr1[i]=input;
        }

        System.out.println("Nhập giá trị cho mảng 2");
        for (int i=0; i<arr2.length; i++){
            System.out.println("index"+i);
            int input=scanner.nextInt();
            arr2[i]=input;
        }

        int[] arr3=new int[10];

        for (int i=0; i<arr3.length; i++){
            if(i<arr1.length){
                arr3[i]=arr1[i];
            }else {
                arr3[i]=arr2[i-5];
            }
        }

        String addArr="";

        for (int i=0; i<arr3.length; i++){
           addArr+=""+arr3[i]+"  ";
        }
        System.out.println(addArr);
    }
}
