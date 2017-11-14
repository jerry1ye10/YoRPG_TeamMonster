publc class devilMonster extends Monster{
    public devilMonster(String name){
	super(name);
	health = 10000;
	defense = 1000;
	attackRating = 10000;
	strength = 100000;
    }
    public static String about(){
	return "The scariest and strongest devil Monster!"
	    }
}
