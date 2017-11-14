/**********************************************
Tania Cao, Jerry Ye, Eddie Zhu -- Monster
APCS1 pd1
HW#28
2017-11-08

**********************************************/

public class normalMonster extends Character{

    //constructor
    public normalMonster(){
	health = 150;
	defense = 20;
	attackRating = 1;
	strength = (int)(Math.random() * 45) + 20;
    }
    
}
