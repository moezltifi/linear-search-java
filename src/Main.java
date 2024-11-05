public class Main {
    public static void main(String[] args) {
        int[] intarray = {20,15,-15,7,1,-8,9};
        System.out.println(linearSearch(intarray,20));
        System.out.println(linearSearch(intarray,-15));
        System.out.println(linearSearch(intarray,2));
        System.out.println(linearSearch(intarray,-8));
    }

    public static int linearSearch(int[] input,int value){
        for (int i = 0; i < input.length; i++){
            if (input[i] == value){
                return i;
            }
        }
        return -1;
    }
}