
package Onthi;

public class StoneMonster extends Monster{
    public StoneMonster(String name) {
        super(name);
    }
    
    @Override
    public String Attack(){
        return "StoneMonster Attack!";
    }
}
