public class Manager extends Employee {
    
    int type;

    public Manager(String name, long id) {
        super(name,id);
    }

    public void setSalary(int type) {
        this.type = type;
        double pokok = super.getSalary();
        if (type == 1) {
            this.setSalary(pokok * 1.25);// = super.getSalary() * 1.25;
        } else if (type == 2) {
            this.setSalary(pokok * 1.5);
        } else if (type == 3) {
            this.setSalary(pokok * 1.75);
        }
    }
    public static void main(String[] args) {
        Manager mgr1 = new Manager("BOSS1",1234455);
        Manager mgr2 = new Manager("LEADER1",777777);
        mgr1.setSalary(4500000.0);
        mgr2.setSalary(4500000.0);
        mgr1.setSalary(2);
        mgr2.setSalary(2);
        System.out.println("Nama : " + mgr1.getName());
        System.out.println("ID : " + mgr1.getID());
        System.out.println("GAJI : " + mgr1.getSalary());
        System.out.println("Nama : " + mgr2.getName());
        System.out.println("ID : " + mgr2.getID());
        System.out.println("GAJI : " + mgr2.getSalary());
    }
}