package org.java;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

// 5. different pack import --extend, object creation
// 6. inheritance -- keyword extends
import org.diff.DifferentPack;
import org.diff.Interface;
import org.diff.MultilevelI;

//1. class syntax
//11. static in class level -- not possible
//12. final in class level -- inheritance impossible
public class FullClass extends MultilevelI implements Interface{
	//24. constructor -- whenever create an object it will invoke the default constructor
	public FullClass() {}
	//11.static in variable level-- the value can be changed and it can be used anywhere throughout the program
	//8. static variable
	static String x = "0";
	//12. final in variable level-- can't change the value
	final String z = "0";
	//8. global variable
	int j=0;
	//void = heap memory
	// 2. method syntax
	public void method() {System.out.println("method syntax");}
	//11. Static in method level -- no need to create an object,
	//-- call by methodname, -- other class classname.methodname
	public static void methodStatic() {}
	//12. final in method level -- we can't override the method
	public final void methodFinal() {}
	//13. return method -- we need to mention return to get the value, void is return type
	public String X() {return z;}
	//14. overloading or static binding - using same method name, same class  but different types
	public void method(int o) {}
	//15.overriding or dynamic binding- using same method name, same datatypes, but different class  we can overwrite the method logic
	//-- override done in extended class
	public void interF() {}
	//16. abstraction
	//16. 1. partial abstraction -- contains both main methods and templates,-- keyword abstract, it can be inherited by extends keyword
	//16. 2. fully abstraction or interface -- multiple inheritance can be done, -- keyword for inheritance is implements
	//17. encapsulation - wrapping up the data and code acting up on the data under a single unit
	//check on encapsulation class
	//18. control statements
	//18.1.1. for loop -- set initial value, -- set condition, -- how to be operated
	//18.1.2. foreach -- (datatype newvariable : oldvariable)
	//18.2. while -- set initial value, -- set condition, -- then operation. entry level check 
	//18.3. do while -- set initial value, -- output,-- operation, -- then contion. exit level check
	//18.4 if else conditions -- if(i<j){sysout}, -- else {another condition}
	//18.5. nested if conditions -- multiple if else conditions
	//18.6. switch case-- checking the condition based on the case given by us
	//18.7. break -- to break the loop at that line
	//18.8. continue -- it will skip the present line
	//18.9. system.close -- it will end the process
	//19. String -- it is a predefined class which is used to store set of characters
	//19. methods in string -- 1..length(), 2..charAt(),3..contains(),4..startsWith(),5..endsWith(),
	//19.--6..toUpperCase(), 7..toLowerCase(), 8..equals(), 9..equalsIgnoreCase(),10..indexOf(),11..lastIndexOf(),12..trim(),13..split(),14..compareTo()
	//19.1.1 Literal String --it will share the memory for duplicate values. syntax String s ="";
	//19.1.2 NonLiteral String -- it will not share the memory for duplicate values. syntax String s = new String("");
	//19.2.1 immutable string -- we cant able to change the value in the memory. to add the string keyword concat.
	//19.2.2 mutable string -- we can able to change the value in the memory. type string buffer, string builder . keyword append
	// to get the memory stub use system.identityHashCode(string name);
	//20. Arrays -- it is used to store multiple values in a single variable,-- it allows duplicates,-- it is index based
	//20. methods in array --1..length, 
	//21. collections -- to overcome disadvantages of arrays, -- it is used to store dissimilar datatypes, -- memory wastage is low
	//21. types -- List, Set, Map --(all are interface)
		//List -- it will allow duplicates, -- it is index based, -- it will print in insertion order
		//List types -- 1. ArrayList, 2. LinkedList, 3.VectorList
		//Methods in List --1.add(), 2.size(), 3.get(), 4.remove(), 5.indexOf(), 6. lastIndexOf(), 7. addAll(), 8.removeAll(),9.set(), 10. retainAll()

	//generics-- it is used to store similar datatypes, it is launched from java 1.5


		//Set -- it will not allow duplicates, -- it is value value based, -- it will print in random order
		//Set Types -- 1. HashSet, 2. LinkedHashSet, 3. TreeSet
		//Methods in Set -- 1. add(), 2.size(), 3.equals(), 4.contains(), 5.removeAll(), 6.addAll(), 7.retainAll().

		//Map -- it is key value pair combination, -- key will not allow duplictes, value allows duplicates
		//Map Types -- 1.HashMap, 2.LinkedHashMap, 3.TreeMap, 4.HashTable
		//Methods in Map -- 1.put(), 2.get(key)-value, 3.keySet()-key, 4.values()-collections, 5.entrySet()-iteration,5.1 getKey(), 5.2 getValues()
	//22. Exception -- it is kind of error, if it occurs program will terminate at that line
	//22. Types exception --1. compileTimeexception, 2.runtimeexception
	//compileTimeexception can be handled by using 1. throws and 2. try catch
	//runtimeexception can be handled only by using trycatch method
	//runtime exception - arrayindex, stringindex, index, nullpointer, numberformat, inputmismatch, arithmetic
	//compiletime -- io, filenotfound, sql
	//23. FileOperations -- files can be operated using java.. files are  .txt, .xlsx, .databases, .json, .xml, .csv etc
	//Methods in FileOperations -- 1.mkdir(), 2.mkdirs(), 3.createNewFile(), 4.isDirectory, 5. isFile(), 6.delete(), 7.getPath(), 8. isHidden(), 9.listFiles(), 10.list()
	// 7. datatypes
	public void dataTypes() {
		// 8. local variable
		int i =0;
		//9. to convert int to String 
		String conver = String.valueOf(i);
		System.out.println("byte=0,short=0,int=0,long=0,float=0.0,double=0.0,char=space,String=null,boolean=false");
	}
	public static void main(String[] args) throws IOException {
		// 3. object syntax
		FullClass f = new FullClass();	
		// 4. same package
		SamePack s = new SamePack();
		// 5. different package
		DifferentPack d = new DifferentPack();
		//9. to convert string to int datatype
		int conversion = Integer.parseInt(x);
		//10. Scanner class -- get input from user in runtime
		Scanner S = new Scanner(System.in);
		//10. String input
		String name = S.next();
		//17. encapsulation object  
		Encapsulation e = new Encapsulation();
		//e.setPhone("hkjk");
		//e.setName(8897869800l);
		//23. file operation object
		File F = new File("path");
		//23. write in file object
		FileWriter F1 = new FileWriter(F);
		//23. read the file object
		FileReader F2 = new FileReader(F);
	}

}
