public class Main {

    public static void main(String[] args) {

        //Заготовка для демострации выброса ошибок
        //Для демонстрации закомментировать установку имени или фамилии
        //Или установитть отрицательный возраст
        try {
            Person ivan = new PersonBuilder()
                    .setFirstName("Ivan")
                    .setLastName("Ivanov")
                    .setAge(45)
                    .setAddress("Moscow")
                    .build();
            System.out.println(ivan);
        } catch (IllegalStateException | IllegalArgumentException exception) {
            exception.printStackTrace();
        }


        //Создаем персону
        Person alex = new PersonBuilder()
                .setFirstName("Alex")
                .setLastName("Alexeev")
                .setAge(29)
                .setAddress("Omsk")
                .build();

        //Создаем ребенка персоны и выводим
        Person tamara = alex.newChildBuilder()
                .setFirstName("Igor")
                .build();
        System.out.println(tamara);
    }
}
