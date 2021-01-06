package Onthi;

import java.util.ArrayList;
import java.util.List;

public class ListMonster {

    public List<Monster> monsterList;
    public double n;

    public ListMonster() {
        monsterList = new ArrayList<>();
    }
    
    public void addMonster(int k, String name) {
        switch (k) {
            case 1:
                FireMonster f = new FireMonster(name);
                monsterList.add(f);
                break;
            case 2:
                WaterMonster w = new WaterMonster(name);
                monsterList.add(w);
                break;
            case 3:
                StoneMonster s = new StoneMonster(name);
                monsterList.add(s);
                break;
            default:
                break;
        }
        
    }
    public void print(){
        monsterList.forEach((list) -> {
            System.out.println(list.Attack());
        });
            
    }

}
