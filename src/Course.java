public class Course {
    private Hurdle[] hurdles;
    private int length;

    public Course(int length, Hurdle[] hurdles) {
        this.hurdles = hurdles;
        this.length = length;
        System.out.println("Создана полоса препятствий");
        System.out.println("Длина: " + this.length);
        for (int i = 0; i < hurdles.length; i++) {
            System.out.println(hurdles[i].getHurdle());
        }
    }

    public void doIt(Team team) {
        System.out.println("Начинаем соревнование");
        Member[] members = team.getMembers();
        for (int i = 0; i < members.length; i++) {
            members[i].setCourseResult(members[i].run(length));
            for (int j = 0; j < hurdles.length; j++) {
                if (hurdles[j].getType() == 1) {
                    if (!members[i].doJumpHeight(hurdles[j].getSize())) {
                        members[i].setCourseResult(0);
                        break;
                    }
                }
                if (hurdles[j].getType() == 2) {
                    if (!members[i].doJumpLength(hurdles[j].getSize())) {
                        members[i].setCourseResult(0);
                        break;
                    }
                }
            }
        }
    }
}
