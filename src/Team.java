public class Team {
    private Member[] members;
    public Team(){
        members = new Member[4];
        System.out.println("Создана команда:");
        members[0] = new Member( "Игрок 1", 6, 200, 400);
        System.out.println(members[0].getMember());
        members[1] = new Member( "Игрок 2", 3, 100, 100);
        System.out.println(members[1].getMember());
        members[2] = new Member( "Игрок 3", 7, 150, 600);
        System.out.println(members[2].getMember());
        members[3] = new Member( "Игрок 4", 5, 300, 400);
        System.out.println(members[3].getMember());
    }
    public Member[] getMembers() {
        return members;
    }
    public void showResults(){
        for (int i = 0; i < members.length; i++) {
            System.out.println( members[i].getResult());
        }
    }
}
