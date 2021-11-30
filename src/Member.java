public class Member {

    private String name;
    private int speed;

    private int jumpHeight;
    private int jumpLength;
    private int courseResult;
    public Member(String name, int speed, int jumpHeight, int jumpLength) {
        this.name = name;
        this.speed = speed;
        this.jumpHeight = jumpHeight;
        this.jumpLength = jumpLength;
    }
    public String getMember() {
        return name + ". Скорость: " + speed + " Прыжок вверх: " + jumpHeight + " Прыжок в длину: " + jumpLength;
    }
    public int getCourseResult() {
        return courseResult;
    }

    public void setCourseResult(int courseResult) {
        this.courseResult = courseResult;
    }

    public boolean doJumpHeight(int size){
        return jumpHeight >= size;
    }
    public boolean doJumpLength(int size) {
        return jumpLength >= size;
    }
    public int run(int length){
        return length/speed;
    }
    public String getResult(){
        return "Результат "+ name + " - " + ( courseResult == 0 ? "выбыл " : courseResult );
    }
}
