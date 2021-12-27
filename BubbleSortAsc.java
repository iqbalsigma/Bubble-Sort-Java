import java.util.Scanner;

//Created by : Iqbal Sigma

class BubbleSortAsc {
  public static void main(String []args) {
    int angka, i, j, temp;
    Scanner input = new Scanner(System.in);
	System.out.println(""); 
	System.out.println(""); 
	System.out.println("=======BUBBLE SORT (ASC)======="); 
    System.out.print("Masukkan jumlah angka yang ingin di urutkan: "); 
	angka = input.nextInt();
	
    int array[] = new int[angka];
 
    System.out.println("Masukkan " + angka + " angka: ");
 
    for (i = 0; i < angka; i++) 
      array[i] = input.nextInt();
 
    for (i = 0; i < ( angka - 1 ); i++) {
      for (j = 0; j < angka - i - 1; j++) {
        if (array[j] > array[j+1]) 
        {
          temp = array[j];
          array[j] = array[j+1];
          array[j+1] = temp;
        }
      }
    }
 
    System.out.println("Hasil Pengurutan Angka:");
 
    for (i = 0; i < angka; i++) 
      System.out.println(array[i]);
  }
}



