import java.util.ArrayList;
import java.util.Collections;

public class Apple implements Comparable<Apple>{
   public int size;
   public String type;
   public AppleColor color;

   public Apple(int size, String type, AppleColor color){
       this.size = size;
       this.type = type;
       this.color = color;
   }

    public int getSize() {
        return size;
    }

    public String getType() {
        return type;
    }

    public AppleColor getColor() {
        return color;
    }

   public int compareTo(Apple rhsApple){
       return 1;
   }

    /**
     * Place your code for comparing Apples by size here.
     * @param rhsApple Apple object that is on the right-hand side
     * @return int result of comparison
     */
   public int compareTo1(Apple rhsApple){
       return 1;
   }
    /**
     * Place your code for comparing Apples by type here.
     * @param rhsApple Apple object that is on the right-hand side
     * @return int result of comparison
     */
    public int compareTo2(Apple rhsApple){
        return 1;
    }
    /**
     * Place your code for comparing Apples by color here.
     * @param rhsApple Apple object that is on the right-hand side
     * @return int result of comparison
     */
    public int compareTo3(Apple rhsApple){
        return 1;
    }

    public String toString(){
        return getColor() + " " + getType() + " apple of size " + getSize();
    }

    public static void main(String[] args) {
        ArrayList<Apple> apples = new ArrayList<>();
        apples.add(new Apple(5, "Granny Smith", AppleColor.GREEN));
        apples.add(new Apple(2, "Golden Delicious", AppleColor.YELLOW));
        apples.add(new Apple(1, "Red Delicious", AppleColor.RED));
        apples.add(new Apple(4, "Honeycrisp", AppleColor.REDYELLOW));
        apples.add(new Apple(3, "Gala", AppleColor.REDYELLOW));
        apples.add(new Apple(2, "Braeburn", AppleColor.REDYELLOW));

        System.out.println("Original List:");
        System.out.println(apples.toString());
        System.out.println("Sorted List:");
        Collections.sort(apples);
        System.out.println(apples);
    }

}
