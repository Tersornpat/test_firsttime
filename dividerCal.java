public class dividerCal {
    private String ans = "";
    private int divider;
    public int[] array = new int[20];

    public dividerCal(int divider){
        this.divider = divider;
    }

    public void inputNum(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i+1;
        }
    }

    public void cal(int[] array, int divider){
        for (int i = 0; i < array.length; i++) {
            if(array[i] % divider == 0){
                ans = ans + array[i] + " ";
            }
        }
    }

    public void display(){
        inputNum(array);
        cal(array, divider);
        System.out.println("Answer : "+ans);
    }
}
