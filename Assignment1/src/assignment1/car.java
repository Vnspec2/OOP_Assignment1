
package assignment1;

public class car extends viechle{
    private String model;

    public car(String model, double max_speed,int no_doors,int no_tires) {
        this.model = model;
        super.setMax_speed(max_speed);
        super.setNo_door(no_doors);
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
       System.out.println("car sound"); //To change body of generated methods, choose Tools | Templates.
    }

    
}
