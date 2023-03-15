package objects;


import java.util.List;

public class methodsForPerson {
	
	public static EncapsulatePerson findPersonByName (List<EncapsulatePerson> myList, String myName) { //static method
		EncapsulatePerson objectToReturn = null;
		
		// Printing the number of objects in myListOfObjects
		for (EncapsulatePerson objectPerson : myList) {
			String nameOfPerson = objectPerson.getName();
			if (nameOfPerson.equalsIgnoreCase(myName))
				objectToReturn=objectPerson;
		}
		return objectToReturn;
   }

	//calling the method, from anywhere
	//className.methodName(passedParams);

}



