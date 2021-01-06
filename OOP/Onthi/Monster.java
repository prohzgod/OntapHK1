
package Onthi;

public abstract class Monster {
    public String name;
    public Monster(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name=name;
    }
    public abstract String Attack();
    
}
