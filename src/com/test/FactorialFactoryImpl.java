package com.test;

public class FactorialFactoryImpl implements IFactorialFactory {

	@Override
	public IFactorial create() {
		IFactorial factIterator = new FactorialRecursive();
		
		return factIterator;
	}

}
