public class Main{
	public static void main(String[] args){
		Hero hero1=new Hero("IronGentleMan",45,"Throwing Irons");
		Hero hero2=new Hero("SpiderLady",30,"Eats spiders");

		System.out.println(hero1.power+"\n");
		
		System.out.println(hero2.toString());
	}
}