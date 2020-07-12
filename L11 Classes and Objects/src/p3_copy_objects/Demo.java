package p3_copy_objects;

public class Demo {

	public static void main(String[] args) {
//		Animal cat1 = new Animal("Cat", 5, 5.5);
//		System.out.println(cat1);
//		
//		// shollow copy
//		Animal cat2;
//		cat2 = cat1;
//		System.out.println(cat2);
//		
//		cat1.setAge(100);
//		System.out.println(cat1.getAge());
//		System.out.println(cat2.getAge());
//		
////		cat1=null;
////		cat2=null;
//		System.out.println(cat2.getAge());
//		
//		System.out.println(cat1==cat2);
		
//		Animal cat1 = new Animal("Cat", 5, 5.5);
//		Animal cat2 = new Animal("Cat", 5, 5.5);
//		System.out.println(cat1 == cat2);
//		cat1.setAge(100);
//		System.out.println(cat1.getAge());
//		System.out.println(cat2.getAge());
		
		Animal cat1 = new Animal("Cat" , 5, 5.5);
		Animal cat2 = new Animal(cat1);
		Animal cat3 = new Animal(cat2);
		cat3.setWeight(100);
		System.out.println(cat1);
		System.out.println(cat2);
		System.out.println(cat3);
		
		Animal cat4 = cat3.deepCopy(cat3);
		
		System.out.println(cat3 == cat4);
		System.out.println(cat4);
		
		Animal cat5 = cat4.shallowCopy(cat4);
	}

}
