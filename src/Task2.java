import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Task2 {
    /*
    Программа принимает на вход английский текст, произвольной длины,
обрабатывает его и выводит все слова, которые встречаются в тексте (без
дубликатов) группируя их по первой букве в алфавитном порядке. Знаки
препинания игнорируются. Регистр заглавных букв не учитывается.
Пример:
Входной текст:
Once upon a time a Wolf was lapping at a spring on a hillside, when, looking
up, what should he see but a Lamb just beginning to drink a little lower down. 
Результат работы программы:
A: a at
B: but beginning
D: drink down
….
И так далее…
    * */
    public static void main(String[] args) throws IOException {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        String text = rd.readLine().replaceAll("\\p{Punct}","").toLowerCase();
        String[] word = text.split(" ");
        Arrays.sort(word);
        String c1;
        String c2;

        c1 = word[0].substring(0,1);
        System.out.print(c1 + ": " + word[0] + " ");

        for(int i = 1; i < word.length; i ++){
            c2 = word[i].substring(0,1);
            if(c1.equals(c2)){
                System.out.print(word[i] + " ");
            }
            else {
                c1 = c2;

                System.out.print("\n" + c1 + ": " + word[i] + " ");
            }
        }
    }
}
