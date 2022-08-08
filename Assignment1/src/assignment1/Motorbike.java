
package assignment1;

public class Motorbike extends viechle{
    private String model;

    public Motorbike(String model, double max_speed,int no_tires) {
        this.model = model;
        super.setMax_speed(max_speed);
        super.setNo_tires(no_tires);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public void Viechle_sound() {
        System.out.println("bike sound"); //To change body of generated methods, choose Tools | Templates.
    }
    
}
