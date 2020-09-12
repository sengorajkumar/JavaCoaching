package excercise2;

public class Max{
  public static void main(String args[]){
      int arr[] = new int[]{9,1,5,8,6,0,10,7};
      System.out.println("Array length : " + arr.length);

      int max = 0;
      for(int i = 0; i < arr.length; i++){
          if (arr[i] > max){
            max = arr[i];
          }
      }

      System.out.println("Max value: " + max);

      //9, 1, 5, 8, 6, 0, 10, 7 - input
      //0, 1, 5, 6, 7, 8, 9, 10 - output (Through sorting)
  }
}
