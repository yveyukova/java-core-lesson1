public class Hurdle {


    private int type; //1-барьер, 2-яма
    private int size; // для барьера высота, для ямы длина
    public Hurdle(int type, int size){
        this.type = type;
        this.size = size;
    }
    public String getHurdle(){
        return ( type == 1 ? "Барьер " : "Яма " ) + "размер: " + size;
    }
    public int getType() {
        return type;
    }
    public int getSize() {
        return size;
    }
}
