package homework21;

import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.IOException;
import java.util.Comparator;
/*
* Оранжерея. Растения, содержащиеся в оранжерее, имеют следующие характеристики:
— Name — название растения;
— Soil — почва для посадки, которая может быть следующих типов: подзолистая, грунтовая,
дерново-подзолистая;
— Origin — место происхождения растения;
— Visual рarameters (должно быть несколько) — внешние параметры: цвет стебля, цвет
листьев, средний размер растения;
— Growing tips (должно быть несколько) — предпочтительные условия произрастания:
температура (в градусах), освещение (светолюбиво либо нет), полив (мл в неделю);
— Multiplying — размножение: листьями, черенками либо семенами.
Корневой элемент назвать Flower.
1) Создать файл XML и соответствующую ему схему XSD.
2) При разработке XSD использовать простые и комплексные типы, перечисления, шаблоны и
предельные значения.
3) Создать класс, соответствующий данному описанию.
4) Создать приложение для разбора XML-документа и инициализации коллекции объектов
информацией из XML-файла. Для разбора использовать SAX, DOM и StAX парсеры. Для
сортировки объектов использовать интерфейс Comparator. Вывести на экран коллекцию.
5) Произвести проверку XML-документа с привлечением XSD.*/

public class SaxExample {
    public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
        final String fileName = "src/homework21/flowers.xml";
        SAXParserFactory factory = SAXParserFactory.newInstance();
        SAXParser parser = factory.newSAXParser();

        XmlHandler xmlHandler = new XmlHandler();

        parser.parse(fileName,xmlHandler);
        XmlHandler.listOfFlower.stream().sorted(Comparator.comparing(Flower::getOrigin)).forEach(System.out::println);
    }
    }

