public class HalfRightAngledTriangle {
        public static void main(String[] args) {
            int n = 5; // height of the triangle
            printHalfRightAngledTriangle(n);
        }
        public static void printHalfRightAngledTriangle(int n) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j <= i; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }
    
