class Main {
    public static void main(String[] args) {
        Square shape0 = new Square();
        Circle shape1 = new Circle();
        Triangle shape2 = new Triangle();
        
        shape0.setSisi(4.3);
        shape1.setJari2x(6.6);
        shape2.setAttr(3.2,5.4,7.5);

        System.out.println("Luas : " + shape0.hitungLuas());
        System.out.println("Keliling : " + shape0.hitungKeliling());
        
        System.out.println("Luas : " + shape1.hitungLuas());
        System.out.println("Keliling : " + shape1.hitungKeliling());
    
        System.out.println("Luas : " + shape2.hitungLuas());
        System.out.println("Keliling : " + shape2.hitungKeliling());
    
    }
}