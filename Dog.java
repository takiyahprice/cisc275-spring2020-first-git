public class Dog extends Animal {

    public Dog(String n,int l) {
	name=n;
	legs=l;
    }
    public String toString() {
	return name+": "+String.valueOf(legs)+" legs";
    }
}