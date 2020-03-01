# cisc275-fall2019-first-git
1. Create java files to make this code compile and run.

2. What five objects are created in the main?
an ArrayList of Dogs called dogs, 3 Dogs, and an instance of an anonymous inner class that implements Comparator<Animal> 
3. Can you spot the Comparator constructor call? Where is the class definition for the Comparator?
The Comparator constructor call is the default constructor call at new Comparator<Animal>(). The class definition is contained in
{ @Override
  public int compare(Animal a, Animal b){
  	  return a.getLegs() - b.getLegs();
   }
}