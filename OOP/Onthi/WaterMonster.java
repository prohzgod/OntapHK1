
package Onthi;

public class WaterMonster extends Monster{
    public WaterMonster(String name) {
        super(name);
    }
    
   @Override
    public String Attack() {
        return "WaterMonster Attack!";
    }
    
}
