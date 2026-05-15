public class Return {
    public static void main(String[] args) {
        int i;
        for(i=1;i<=10;i++){
            if(i==6){
                return;
            }
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("success");
    }
}
