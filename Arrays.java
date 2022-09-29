/**
 * Write a description of class RenameThisClass here.
 *
 * @author (your name)
 * @version 9-28-22
 */
public class Arrays
{
    public static void main(String[] args) {
        String[] strArray = {"Alpha","Bravo","Charlie","Delta","Echo"};
        for (String l : strArray) {
            System.out.println(l);
        }
        System.out.println();
        for (String f : strArray) {
            System.out.print(f);
        }
        System.out.println("\s");
        for (int i = 0; i < strArray.length; i++) {
            if (i > 0) {
                System.out.print("-" + strArray[i]);
            }
            if (i<1) {
                System.out.print(strArray[0]);
            }
        }
    }
}