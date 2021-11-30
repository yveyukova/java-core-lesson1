public class Lesson1 {

    public static void main(String[] args) {
        Hurdle [] h = new Hurdle[3];
        h[0] = new Hurdle(1,150);
        h[1] = new Hurdle(1,200);
        h[2] = new Hurdle(2,300);
        Course c = new Course( 800, h ); // Создаем полосу препятствий
        Team team = new Team(); // Создаем команду
        c.doIt(team); // Просим команду пройти полосу
        team.showResults(); // Показываем результаты
    }
}
