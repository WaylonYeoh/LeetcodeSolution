public class App {
    public static void main(String[] args) {
        System.out.println("Welcome LeetCode Solution");
        int t=-123456;
        int d=0,r=0;
        while (t!=0){
            d=t%10;
            r = 10*r+d;
            System.out.println("t="+t+"  d="+d+"   r="+r);
            t=t/10;
        }
        System.out.println("t="+t+"  d="+d+"   r="+r);
    }
}
