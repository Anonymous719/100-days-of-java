
class day4{

    public static void main(String[] args){
        int arr[];
        arr = new int[5];

        for(int i =0; i<5; i++){
            arr[i] = (i+1)*10;
        }

        System.out.println(arr);

        for(int i =0; i<5; i++){
            System.out.println("Array index "+i+" = "+arr[i]);
        }
        
        arr = null;

        System.out.println(arr);
    }
}