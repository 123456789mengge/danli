class Animal {
	public Animal()
	{
		System.out.println("this is an animal");
	}
	public Animal(String name){
		System.out.println("����һֻ"+name);
	}
}
class Dog extends Animal {
	public Dog(){
		
	}
}
public class Example05 {
     public static void main(String[] args){
    	 Dog dog=new Dog();
     }
}
