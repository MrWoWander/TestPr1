import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Loader {
    public static void main(String[] args) {

        String number = "А667МР77";
        String regex = "[АВЕКМНОРСТУХ][0-9]{3}[АВЕКМНОРСТУХ]{2}[0-9]{2,3}";

        System.out.println(number.matches(regex));

        String text = "Добрый день!\nПросьба перейти на сайт https://mirea.ru/uhawidawd для того чтобы посмотреть расписание!";

        regex = "https://[^,\\s]+";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            int start = matcher.start();
            int end = matcher.end();

            System.out.println(text.substring(start, end));
        }

        text = "Привет,            мир!    Какая      прекасная     погода!";

        String[] words = text.split("\\s+");

        for(String word: words) {
            System.out.println(word);
        }
    }
}
