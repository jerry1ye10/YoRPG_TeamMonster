/**********************************************
Tania Cao, Jerry Ye, Eddie Zhu -- Monster
APCS1 pd1
HW#28
2017-11-08

**********************************************/

public class Character{
    //instance variables
    public String name;
    public int health;
    public int strength;
    public int defense;
    public double attackRating;

    //returns true if health is above 0
    public boolean isAlive(){
	return (health > 0);
    }
    //returns the defense amount
    public int getDefense(){
	return defense;
    }
    //returns the name
    public String getName(){
	return name;
    }
    //reduces health by the damage taken
    public int lowerHP(int damageTaken){
	return (health - damageTaken);
    }
<<<<<<< HEAD
    //returns the damage done to the monster based on formula
    public int attack(Character dude ){
	int damageDone = (int)(strength * attackRating) - dude.getDefense();
	dude.health -= damageDone;
	return damageDone;
    }

=======

    //generates a critAttack value for extra damage based on luck
    public boolean critAttack(){
	return Math.random() * 10 < 5;
    }
    //returns the damage done to the monster based on formula
    public int  attack(Character dude ){
	if (critAttack() == true){
	    int critBonus = (int)(Math.random() * 20);
	    int damageDone = (int)(strength * attackRating) - dude.getDefense() + critBonus;
	    dude.health -= damageDone;
	    return damageDone;
	}
	else{
	    int damageDone = (int)(strength * attackRating) - dude.getDefense();
	    dude.health -= damageDone;
	    return damageDone;
	}

    }

	    
	
	

>>>>>>> 6445b9e9d430c4f67ba5104aac9fe9fbd2fd57d0
}

