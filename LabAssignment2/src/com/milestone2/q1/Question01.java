/**
 * Q1. Implement singleton design pattern, to ensure that a class have only one instance
and provide global point of access to it
While designing singleton pattern consider following factors, what is good progamming 
practice about singleton pattern?

1.	Eager initialization
2.	Static block initialization
3.	Lazy Initialization
4.	Thread Safe Singleton
5.	Serialization issue
6.	Cloning issue
7.	Using Reflection to destroy Singleton Pattern
8.	Enum Singleton
 * **/

package com.milestone2.q1;

import java.io.Serializable;

enum MySingleton {
	INSTANCE;
	// some business logic here..
}

class Singleton implements Serializable, Cloneable {
	private static final long serialVersionUID = 1L;
	//using volatile with double lock checking
	private static volatile Singleton singleton = null;	//lazy instantiation

	private Singleton() {
		if (singleton != null) {
			//AVOIDING REFLECTION ISSUE - if someone tries to access our private constructor
			//throw exception if someone try to use REFLECTION to break singleton pattern
			throw new IllegalStateException();
		}
	}

	public static Singleton getSingleton10() {
		if (singleton == null) {
			if (singleton == null) {
				//using double lock checking with synchronized block to tackle multithreading issue
				synchronized (Singleton.class) {
					singleton = new Singleton();
				}
			}
		}
		return singleton;
	}
	//AVOIDING SERIALIZATION ISSUE
	//By defining readResolve(), we force JVM to not deserialize but invoke
	//the readResolve() method when someone tries to deserialize our object.
	//Hence, returning the same singleton object as generated. [Same hashcode]
	private Object readResolve() {
		return singleton;
	}

	//CLONING ISSUE 
	//When implementing for Cloneable, we may override the clone method and return the
	//singleton object instead explicitly.
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return singleton;
	}
}

public class Question01 {
	public static void main(String[] args) {
		//Implementing Enum singleton pattern, since by default enum is singleton
		//But it is a misuse of Enum concept yet we can create a singleton object.
		MySingleton singletonEnum = MySingleton.INSTANCE;
		System.out.println(singletonEnum.hashCode());
		
		MySingleton singletonEnum2 = MySingleton.INSTANCE;
		System.out.println(singletonEnum2.hashCode());
	}
}
