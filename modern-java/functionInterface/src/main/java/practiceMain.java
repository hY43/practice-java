import java.util.function.Function;

public class practiceMain {

    public static void main(String[] args) {
        Function<Integer, Integer> plus10 = (i) -> i + 10;
        System.out.println(plus10.apply(10));
        Function<Integer, Integer> mul10 = (i) -> i * 10;
        System.out.println(mul10.apply(7));

        // 7 * 10 + 10 = 80
        // compose -> apply 하기 전에 먼저
        System.out.println(plus10.compose(mul10).apply(7));

        // 6 + 10 * 10 = 160
        // andThen -> apply 한후에
        System.out.println(plus10.andThen(mul10).apply(6));
    }
}
