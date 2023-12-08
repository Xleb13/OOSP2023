package Pattern10;

public class FacadePatternExample {
    public static void main(String[] args) {
        EmailFacade emailFacade = new EmailFacade();

        emailFacade.sendEmail("\nМеня зовут Бакаре Тунде, брат первого нигерийского космонавта, майора ВВС Нигерии Абака Тунде. В 1979 году мой брат стал первым африканским космонавтом, отправившимся на секретную миссию к советской станции Салют-6.\nПозже он участвовал в полете Союза Т-16З к секретной станции Салют-8Т. В 1990 году, при падении СССР, он остался на станции. Несмотря на присутствие духа, ему не хватило места в корабле и с тех пор он находится на орбите, снабжаемый лишь грузовыми кораблями Прогресс\nЗа годы в космосе он заработал 15 миллионов долларов, хранящихся в банке в Лагосе.Сейчас нужна ваша помощь, так как нам, нигерийским госслужащим, запрещены операции с иностранными счетами.\nМы хотим оплатить Роскосмосу требуемые 3 миллиона долларов и организовать возвращение брата на Землю.",
                "russian_bear@yandex.ru", "mail.example.com");
    }
}
