/**
 * Created by rashverm on 3/12/2017.
 */
public class Pyramid {
    public static void main(String[] args) {
        for(int i=0;i<5;i++) {
            for(int j=0;j<5-i;j++) {
                System.out.print("R");
            }
            for(int k=0;k<=i;k++) {
                System.out.print("$ ");
            }
            System.out.println();
        }
    }
}
