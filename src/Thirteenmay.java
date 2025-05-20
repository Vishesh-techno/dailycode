public class Thirteenmay {
    public static void main(String[] args) {
//        print oyramid
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

//        print inverse pyramid
        for(int i=5;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

//print number pattern
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println();

//        print character pattern
        char ch = 'A';
        for(int i=1;i<=10;i++){
            for(int j=1;j<=i;j++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
        System.out.println();

//        print hollow triangle
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                if(j==1 || j==i || i==1 || i==5){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();

        //        print hollow rectangle
        int n = 8;
        int m = 8;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(j==1 || j==m || i==1 || i==n){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

}

