import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;

public class test {
    public static void main(String[] args) throws IOException {
        Document doc = Jsoup.connect("https://www.eldorado.ru/c/vse-igrovye-pristavki/b/MICROSOFT/").get();
        doc.parser();
        int a =1;
//        log(doc.title());
//        Elements newsHeadlines = doc.select("#mp-itn b a");
//        for (Element headline : newsHeadlines) {
//            log("%s\n\t%s",
//                    headline.attr("title"), headline.absUrl("href"));
//        }
    }

}
