/**********************************************
Tania Cao, Jerry Ye, Eddie Zhu -- Monster
APCS1 pd1
HW#28
2017-11-08

**********************************************/

public abstract class Protagonist extends Character{

<<<<<<< HEAD
    //instance variables
    private int monstersSlain; 
    //abstract methods 
    public abstract void normalize ();
    public abstract void specialize ();
    public abstract String about ();
=======
    //instant variables
    public abstract void normalize ();
    public abstract void specialize ();
    public abstract String about ();
    public abstract boolean critAttack();
>>>>>>> 6445b9e9d430c4f67ba5104aac9fe9fbd2fd57d0

    //constructor
    public Protagonist(String newName){
	name = newName;
	health = 125;
	strength = 100;
	defense = 40;
	attackRating = 0.4;
    }
<<<<<<< HEAD
    public void killMonster(){
	this.monstersSlain += 1;
    }
    public int getMonstersSlain(){
	return this.monstersSlain;
    }
=======
>>>>>>> 6445b9e9d430c4f67ba5104aac9fe9fbd2fd57d0
}
