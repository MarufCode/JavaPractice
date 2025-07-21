package src.OOPS_Concept.Encapsulation;

public class ICICIBank {

    String name;

    public String getName() {
        return name;
    }

    public ICICIBank(String name, int bal) {
        this.name = name;
        this.bal = bal;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBal() {
        return bal;
    }

    public void setBal(int bal) {
        if (bal > 0) {
            this.bal = bal;
        }else{
            System.out.println("Not allowed!!");
        }
    }

    int bal;


}
