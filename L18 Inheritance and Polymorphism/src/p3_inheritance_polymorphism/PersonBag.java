package p3_inheritance_polymorphism;

public class PersonBag {
	private Person[] arr;
	private int nElems;
	
	public PersonBag(int maxSize) {
		arr = new Person[maxSize];
		nElems = 0;
	}
	
	public void insert(Person person) {
		arr[nElems++] = person;
	}
	
	public void display() {
		for(int i = 0; i < nElems; i++) {
			System.out.println(arr[i]);
		}
	}
}
