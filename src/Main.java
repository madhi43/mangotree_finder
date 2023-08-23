import java.util.Scanner;
public class Main
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int tree = sc.nextInt();

        if (isMangoTree(r, c, tree)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    static boolean isMangoTree(int rows, int cols, int treeNumber) {
        if (treeNumber == 1||treeNumber <= cols || treeNumber % cols == 1 || treeNumber % cols == 0) {
            return true;}
        return false;
    }
}