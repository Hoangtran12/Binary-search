import java.util.Scanner;
import binary.search.ObjectBinarySearcher;
import binary.search.ObjectQuickSorter;
public class BinarySearchTest {
    public static void main(String[] args) {

                Scanner sc = new Scanner(System.in);
                ObjectBinarySearcher objectSearcher = new ObjectBinarySearcher();
                System.out.println("Binary Search Project");
                System.out.println("Length of the array: ");
                objectSearcher.setNumberOfElements(Integer.parseInt(sc.nextLine()));
                objectSearcher.setList(new Comparable[objectSearcher.getNumberOfElements()]);
                System.out.println("Enter your strings: ");
                for (int i = 0; i < objectSearcher.getNumberOfElements(); i++) {
                        Comparable temp = sc.nextLine();
                        objectSearcher.addElements(temp, i);
                }
                ObjectQuickSorter objectSorter = new ObjectQuickSorter(objectSearcher.getList());
                objectSearcher.setList(objectSorter.sortElements());
                Comparable[] list = objectSearcher.getList();
                for (int i = 0; i < objectSearcher.getNumberOfElements(); i++) {
                        System.out.println(list[i].toString());
                }
        }
}
