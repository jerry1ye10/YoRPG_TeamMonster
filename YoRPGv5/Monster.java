/**********************************************
Tania Cao, Jerry Ye, Eddie Zhu -- Monster
APCS1 pd1
HW#28
2017-11-08

**********************************************/

public class Monster extends Character{
<<<<<<< HEAD
=======
    public abstract boolean critAttack();
>>>>>>> 6445b9e9d430c4f67ba5104aac9fe9fbd2fd57d0

    //constructor
    public Monster(){
	health = 150;
	defense = 20;
	attackRating = 1;
	strength = (int)(Math.random() * 45) + 20;
    }
    public String about(){
	return "A normal monster";
    }
    
}
