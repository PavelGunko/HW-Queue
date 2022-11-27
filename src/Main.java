import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<Person> queue = new LinkedList<>(generateClients());

        while (!queue.isEmpty()) {
            Person client = queue.poll();
            client.ticketSume = client.ticketSume - 1;
            System.out.printf("%s %s прокатился на аттракционе\n", client.name, client.surname);
            if (client.ticketSume > 0) {
                queue.add(client);
            }
        }
    }

    private static List<Person> generateClients() {
        return List.of(
                new Person("Олег", "Вещий", 882),
                new Person("Владимир", "Красноe Cолнышко", 978),
                new Person("Ярослав", "Мудрый", 1016),
                new Person("Владимир", "Мономах", 1113),
                new Person("Юрий", "Долгорукий", 1149)
        );


    }


}

