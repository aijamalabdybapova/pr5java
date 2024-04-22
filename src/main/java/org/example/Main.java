package org.example;
import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    // Статические функции

    // Функция для генерации случайного номера камеры
    public static int generateRandomCellNumber() {
        Random random = new Random();
        return random.nextInt(1000) + 1; // Генерируем случайное число от 1 до 1000
    }

    // Функция для расчета срока заключения в месяцах
    public static int calculateMonthsInPrison(int years) {
        return years * 12;
    }

    // Функция для проверки, является ли заключенный опасным
    public static boolean isDangerousPrisoner(String name) {
        return name.startsWith("V") || name.endsWith("X"); // Проверяем начало и конец имени
    }

    // Обычные функции

    // Функция для вывода информации о заключенном
    public void printPrisonerInfo(String name, int age) {
        System.out.println("Имя заключенного: " + name);
        System.out.println("Возраст: " + age);
    }

    // Функция для вычисления суммы срока заключения двух заключенных
    public int calculateTotalSentence(int sentence1, int sentence2) {
        return sentence1 + sentence2;
    }

    // Функция для определения категории заключенного по сроку
    public String prisonerCategory(int months) {
        if (months < 12) {
            return "Легкий режим";
        } else if (months >= 12 && months < 60) {
            return "Средний режим";
        } else {
            return "Строгий режим";
        }
    }

    // Функция для проверки, является ли заключенный агрессивным
    public boolean isAggressivePrisoner(String name) {
        // Предположим, что агрессивный заключенный имеет в имени слово "Тигр"
        return name.contains("Тигр");
    }

    // Функции относящиеся к ответвлению от стандартных функций

    // Функция, возвращающая имя заключенного с добавлением приставки "Уважаемый"
    public String addRespectToPrisonerName(String name) {
        return "Уважаемый " + name;
    }

    // Функция, проверяющая, является ли заключенный рецидивистом
    public boolean isRecidivist(String name) {
        // Предположим, что Рецидивист - это заключенный, у которого имя состоит из двух слов
        return name.contains(" ");
    }

    // Функция для вычисления времени до освобождения заключенного в днях
    public int daysUntilRelease(int remainingMonths) {
        return remainingMonths * 30; // Предполагаем, что в месяце 30 дней
    }

    public static void main(String[] args) {
        // Пример использования функций
        int randomCellNumber = generateRandomCellNumber();
        System.out.println("Случайный номер камеры: " + randomCellNumber);
    }
}