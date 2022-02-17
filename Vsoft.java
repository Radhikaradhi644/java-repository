package Ramya;

public class Vsoft {

        String president;
        String managers;
        String Developers;

        public Vsoft(String prsdnt){
            this.president = prsdnt ;
        }
        public void Vsoft (String president){
            this.president = president;
            //this.Managers=Manager;
            //this.Developers=Dvevelopers;
        }
        void display () {
            System.out.println("president is : " + president);
        }
    }

    class Manager {


    public Manager(String president, int managers) {
        super();
    }

    void display() {
        System.out.println("number of managers in each department under president :" + "managers");
    }
}
class Department extends Vsoft {
    int servicenow = 3;
    int azure = 2;
    int aws = 3;
    int java = 6;
    int mulesoft = 5;

    public Department(String president, String managers, String Department) {
        super("president");
    }

    void d1() {
        System.out.println("Servicenow department has" + " " + servicenow + " " + "managers");
        System.out.println("Azure department has" + " " + azure + " " + "managers");
        System.out.println("Aws department has" + " " + aws + " " + "managers");
        System.out.println("Java department has" + " " + java + " " + "managers");
        System.out.println("Mulesoft department has" + " " + mulesoft + " " + "managers");
        System.out.println("Total number of managers in each department under president : " + (servicenow + azure + aws + java + mulesoft));
    }
}
class developers extends Vsoft {
    int servicedevelopers = 42;
    int azuredevelopers = 11;
    int awsdevelopers = 33;
    int javadeveloprs = 11;
    int mulesoftdevelopers = 33;

    developers(String president, String department, String developers) {
        super("president");
    }

    void f1() {
        System.out.println("Servicenow department has" + " " + servicedevelopers + " " + "developers");
        System.out.println("Azure department has" + " " +  azuredevelopers + " " + "developers");
        System.out.println("Aws department has" + " " + awsdevelopers + " " + "developers");
        System.out.println("Java department has" + " " + javadeveloprs + " " + "developers");
        System.out.println("Mulesoft department has" + " " + mulesoftdevelopers + " " + "developers");
        System.out.println("Total number of managers in each department under president : " + (servicedevelopers + azuredevelopers + awsdevelopers + javadeveloprs +  mulesoftdevelopers));
    }
}
class main {
    public static void main(String[] args) {
        Vsoft v1 = new Vsoft("Poorna Veer");
        v1.display();
        System.out.println("");
        Department d2 = new Department("president", "managers", "departments");
        d2.d1();
        System.out.println("");
        developers f3 = new developers("president", "departments", "developers");
        f3.f1();


    }
}
