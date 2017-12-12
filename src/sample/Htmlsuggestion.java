package sample;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Created by Ram on 05-08-2017.
 */
public class Htmlsuggestion {

    Set<String> s = new LinkedHashSet<>();
          String k =" ";
    public    Set<String>   words(String key) throws IOException {


        System.out.println(key+"from html");
        if (key.charAt(0) == 'a' || key.charAt(0) == 'A') {
            File input = new File("a.txt");
            Document doc = Jsoup.parse(input, "UTF-8", "");
            Elements sugg = doc.select("B");
            k=sugg.text();
            s.clear();

            String str[] =k.split(" ");
            for (String f : str) {
               // System.out.println(f);
                // Restricting to single word
                if (f.charAt(0) == 'A'&&f.startsWith(key)) {
                    s.add(f);
                    // System.out.println(f);
                }


            }
        }
        if (key.charAt(0) == 'b' || key.charAt(0) == 'B') {
            File input = new File("b.txt");
            Document doc = Jsoup.parse(input, "UTF-8", "");
            Elements sugg = doc.select("B");
            k=sugg.text();
            s.clear();

            String str[] =k.split(" ");
            int i=0;
            for (String f : str) {

                i++;
                // Restricting to single word
                if (f.charAt(0) == 'B'&& f.startsWith(key)) {
                    s.add(f);
                    // System.out.println(f);

                }


            }
            return  s;
        }
        if (key.charAt(0) == 'c' || key.charAt(0) == 'C') {
            k="";
            File input = new File("c.txt");
            Document doc = Jsoup.parse(input, "UTF-8", "");
            Elements sugg = doc.select("B");
            k=sugg.text();
            s.clear();

            String str[] = k.split(" ");
            for (String f : str) {
                // Restricting to single word
                if (f.charAt(0) == 'C'&& f.startsWith(key)) {
                    s.add(f);
                    // System.out.println(f);
                }


            }
        }
        if (key.charAt(0) == 'd' || key.charAt(0) == 'D') {
            File input = new File("d.txt");
            Document doc = Jsoup.parse(input, "UTF-8", "");
            Elements sugg = doc.select("B");
            k=sugg.text();
            s.clear();

            String str[] =k.split(" ");
            for (String f : str) {
                // Restricting to single word
                if (f.charAt(0) == 'D'&& f.startsWith(key)) {
                    s.add(f);
                    // System.out.println(f);
                }


            }
        }
        if (key.charAt(0) == 'e' || key.charAt(0) == 'E') {
            File input = new File("e.txt");
            Document doc = Jsoup.parse(input, "UTF-8", "");
            Elements sugg = doc.select("B");
            k=sugg.text();
            s.clear();

            String str[] =k.split(" ");
            for (String f : str) {
                // Restricting to single word
                if (f.charAt(0) == 'E'&& f.startsWith(key)) {
                    s.add(f);
                    // System.out.println(f);
                }


            }
        }
        if (key.charAt(0) == 'f' || key.charAt(0) == 'F') {
            File input = new File("f.txt");
            Document doc = Jsoup.parse(input, "UTF-8", "");
            Elements sugg = doc.select("B");
            k=sugg.text();
            s.clear();

            String str[] =k.split(" ");
            for (String f : str) {
                // Restricting to single word
                if (f.charAt(0) == 'F'&& f.startsWith(key)) {
                    s.add(f);
                    // System.out.println(f);
                }


            }
        }
        if (key.charAt(0) == 'g' || key.charAt(0) == 'G') {
            File input = new File("g.txt");
            Document doc = Jsoup.parse(input, "UTF-8", "");
            Elements sugg = doc.select("B");
            k=sugg.text();
            s.clear();

            String str[] =k.split(" ");
            for (String f : str) {
                // Restricting to single word
                if (f.charAt(0) == 'G'&& f.startsWith(key)) {
                    s.add(f);
                    // System.out.println(f);
                }


            }
        }
        if (key.charAt(0) == 'h' || key.charAt(0) == 'H') {
            File input = new File("h.txt");
            Document doc = Jsoup.parse(input, "UTF-8", "");
            Elements sugg = doc.select("B");
            k=sugg.text();
            s.clear();

            String str[] = k.split(" ");
            for (String f : str) {
                // Restricting to single word
                if (f.charAt(0) == 'H' && f.startsWith(key)) {
                    s.add(f);
                    // System.out.println(f);
                }


            }
        }
        if (key.charAt(0) == 'i' || key.charAt(0) == 'I') {
            File input = new File("i.txt");
            Document doc = Jsoup.parse(input, "UTF-8", "");
            Elements sugg = doc.select("B");
            k=sugg.text();
            s.clear();

            String str[] =k.split(" ");
            for (String f : str) {
                // Restricting to single word
                if (f.charAt(0) == 'I'&& f.startsWith(key)) {
                    s.add(f);
                    // System.out.println(f);
                }


            }
        }
        if (key.charAt(0) == 'j' || key.charAt(0) == 'J') {
            File input = new File("j.txt");
            Document doc = Jsoup.parse(input, "UTF-8", "");
            Elements sugg = doc.select("B");
            k=sugg.text();
            s.clear();

            String str[] =k.split(" ");
            for (String f : str) {
                // Restricting to single word
                if (f.charAt(0) == 'J'&& f.startsWith(key)) {
                    s.add(f);
                    // System.out.println(f);
                }


            }
        }
        if (key.charAt(0) == 'k' || key.charAt(0) == 'K') {
            File input = new File("k.txt");
            Document doc = Jsoup.parse(input, "UTF-8", "");
            Elements sugg = doc.select("B");
            k=sugg.text();
            s.clear();

            String str[] =k.split(" ");
            for (String f : str) {
                // Restricting to single word
                if (f.charAt(0) == 'K'&& f.startsWith(key)) {
                    s.add(f);
                    // System.out.println(f);
                }


            }
        }
        if (key.charAt(0) == 'l' || key.charAt(0) == 'L') {
            File input = new File("l.txt");
            Document doc = Jsoup.parse(input, "UTF-8", "");
            Elements sugg = doc.select("B");
            k=sugg.text();
            s.clear();

            String str[] =k.split(" ");
            for (String f : str) {
                // Restricting to single word
                if (f.charAt(0) == 'L'&& f.startsWith(key)) {
                    s.add(f);
                    // System.out.println(f);
                }


            }
        }

        if (key.charAt(0) == 'm' || key.charAt(0) == 'M') {
            File input = new File("m.txt");
            Document doc = Jsoup.parse(input, "UTF-8", "");
            Elements sugg = doc.select("B");
            k=sugg.text();
            s.clear();

            String str[] =k.split(" ");
            for (String f : str) {
                // Restricting to single word
                if (f.charAt(0) == 'M'&& f.startsWith(key)) {
                    s.add(f);
                    // System.out.println(f);
                }


            }
        }
        if (key.charAt(0) == 'n' || key.charAt(0) == 'N') {

            File input = new File("n.txt");
            Document doc = Jsoup.parse(input, "UTF-8", "");
            Elements sugg = doc.select("B");
            k=sugg.text();
            s.clear();

            String str[] =k.split(" ");
            for (String f : str) {
                // Restricting to single word
                if (f.charAt(0) == 'N'&& f.startsWith(key)) {
                    s.add(f);
                    System.out.println(f);
                }


            }
        }
        if (key.charAt(0) == 'o' || key.charAt(0) == 'O') {
            File input = new File("o.txt");
            Document doc = Jsoup.parse(input, "UTF-8", "");
            Elements sugg = doc.select("B");
            k=sugg.text();
            s.clear();

            String str[] =k.split(" ");
            for (String f : str) {
                // Restricting to single word
                if (f.charAt(0) == 'O'&& f.startsWith(key)) {
                    s.add(f);
                     System.out.println(f);
                }


            }
        }
        if (key.charAt(0) == 'p' || key.charAt(0) == 'P') {
            File input = new File("p.txt");
            Document doc = Jsoup.parse(input, "UTF-8", "");
            Elements sugg = doc.select("B");
            k=sugg.text();
            s.clear();

            String str[] =k.split(" ");
            for (String f : str) {
                // Restricting to single word
                if (f.charAt(0) == 'P'&& f.startsWith(key)) {
                    s.add(f);
                    // System.out.println(f);
                }


            }
        }
        if (key.charAt(0) == 'q' || key.charAt(0) == 'Q') {
            File input = new File("q.txt");
            Document doc = Jsoup.parse(input, "UTF-8", "");
            Elements sugg = doc.select("B");
            k=sugg.text();
            s.clear();

            String str[] =k.split(" ");
            for (String f : str) {
                // Restricting to single word
                if (f.charAt(0) == 'Q'&& f.startsWith(key)) {
                    s.add(f);
                    // System.out.println(f);
                }


            }
        }
        if (key.charAt(0) == 'r' || key.charAt(0) == 'R') {
            File input = new File("r.txt");
            Document doc = Jsoup.parse(input, "UTF-8", "");
            Elements sugg = doc.select("B");
            k=sugg.text();
            s.clear();

            String str[] =k.split(" ");
            for (String f : str) {
                // Restricting to single word
                if (f.charAt(0) == 'R'&& f.startsWith(key)) {
                    s.add(f);
                    // System.out.println(f);
                }


            }
        }
        if (key.charAt(0) == 's' || key.charAt(0) == 'S') {
            File input = new File("s.txt");
            Document doc = Jsoup.parse(input, "UTF-8", "");
            Elements sugg = doc.select("B");
            k=sugg.text();
            s.clear();

            String str[] =k.split(" ");
            for (String f : str) {
                // Restricting to single word
                if (f.charAt(0) == 'S'&& f.startsWith(key)) {
                    s.add(f);
                    // System.out.println(f);
                }


            }
        }

        if (key.charAt(0) == 't' || key.charAt(0) == 'T') {
            File input = new File("t.txt");
            Document doc = Jsoup.parse(input, "UTF-8", "");
            Elements sugg = doc.select("B");
            k=sugg.text();
            s.clear();

            String str[] =k.split(" ");
            for (String f : str) {
                // Restricting to single word
                if (f.charAt(0) == 'T'&& f.startsWith(key)) {
                    s.add(f);
                    // System.out.println(f);
                }


            }
        }
        if (key.charAt(0) == 'u' || key.charAt(0) == 'U') {
            File input = new File("u.txt");
            Document doc = Jsoup.parse(input, "UTF-8", "");
            Elements sugg = doc.select("B");
            k=sugg.text();
            s.clear();

            String str[] =k.split(" ");
            for (String f : str) {
                // Restricting to single word
                if (f.charAt(0) == 'U'&& f.startsWith(key)) {
                    s.add(f);
                    // System.out.println(f);
                }


            }
        }
        if (key.charAt(0) == 'v' || key.charAt(0) == 'V') {
            File input = new File("v.txt");
            Document doc = Jsoup.parse(input, "UTF-8", "");
            Elements sugg = doc.select("B");
            k=sugg.text();
            s.clear();

            String str[] =k.split(" ");
            for (String f : str) {
                // Restricting to single word
                if (f.charAt(0) == 'V'&& f.startsWith(key)) {
                    s.add(f);
                    // System.out.println(f);
                }


            }
        }
        if (key.charAt(0) == 'w' || key.charAt(0) == 'W') {
            File input = new File("w.txt");
            Document doc = Jsoup.parse(input, "UTF-8", "");
            Elements sugg = doc.select("B");
            k=sugg.text();
            s.clear();

            String str[] =k.split(" ");
            for (String f : str) {
                // Restricting to single word
                if (f.charAt(0) == 'W'&& f.startsWith(key)) {
                    s.add(f);
                    // System.out.println(f);
                }


            }
        }
        if (key.charAt(0) == 'x' || key.charAt(0) == 'X') {
            File input = new File("x.txt");
            Document doc = Jsoup.parse(input, "UTF-8", "");
            Elements sugg = doc.select("B");
            k=sugg.text();
            s.clear();

            String str[] =k.split(" ");
            for (String f : str) {
                // Restricting to single word
                if (f.charAt(0) == 'X'&& f.startsWith(key)) {
                    s.add(f);
                    // System.out.println(f);
                }


            }
        }
        if (key.charAt(0) == 'y' || key.charAt(0) == 'Y') {
            File input = new File("y.txt");
            Document doc = Jsoup.parse(input, "UTF-8", "");
            Elements sugg = doc.select("B");
            k=sugg.text();
            s.clear();

            String str[] =k.split(" ");
            for (String f : str) {
                // Restricting to single word
                if (f.charAt(0) == 'Y'&& f.startsWith(key)) {
                    s.add(f);
                    // System.out.println(f);
                }


            }
        }
        if (key.charAt(0) == 'z' || key.charAt(0) == 'Z') {
            File input = new File("z.txt");
            Document doc = Jsoup.parse(input, "UTF-8", "");
            Elements sugg = doc.select("B");
            k=sugg.text();
            s.clear();

            String str[] =k.split(" ");
            for (String f : str) {
                // Restricting to single word
                if (f.charAt(0) == 'Z'&& f.startsWith(key)) {
                    s.add(f);
                    // System.out.println(f);
                }


            }
        }


        // System.out.println(links);
        //System.out.println(sugg.text());

        return s;
    }
}
