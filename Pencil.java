public class Pencil {
    public String color = "blue";

    public void setColor(String newCOL) {
        color = newCOL;
    }

    public static void main(String[] args) {
        Pencil p = new Pencil();
        System.out.println("COLOR BEFORE : " + p.color);
        p.setColor("RED");
        System.out.println("COLOR AFTER : " + p.color);
    }
}