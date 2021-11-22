import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class FilterApple {

    public static final Color GREEN = Color.GREEN;
    public enum Color { RED, GREEN }

    public static List<Apple> filterApplesByWeight(List<Apple> inventory, int weight) {

        List<Apple> result = new ArrayList<>();

        for (Apple apple: inventory) {
            if(apple.getWeight() > weight) {
                result.add(apple);
            }
        }

        return result;
    }

    public static List<Apple> filterApplesByColor(List<Apple> inventory, Color color) {
        List<Apple> result = new ArrayList<>();

        for (Apple apple : inventory) {
            if (apple.getColor().equals(color)) {
                result.add(apple);
            }
        }

        return result;
    }

    public interface ApplePredicate {
        boolean test(Apple apple);
    }

    public class AppleWithHeavyWeight implements ApplePredicate {

        @Override
        public boolean test(Apple apple) {
            return apple.getWeight() > 150;
        }
    }

    public class AppleWithGreenColor implements ApplePredicate {
        @Override
        public boolean test(Apple apple) {
            return apple.getColor().equals(GREEN);
        }
    }

    public static<T> List<T> filter(List<T> list, Predicate<T> predicate)  {
        List<T> result = new ArrayList<>();

        for(T e: list) {
            if(predicate.test(e)) {
                result.add(e);
            }
        }
        return result;
    }

    public static void filterWithComparator (List<Apple> inventory) {
        inventory.sort(Comparator.comparing(Apple::getWeight));
    }

}
