package br.com.cod3r.factory.apple.basic;

import br.com.cod3r.factory.apple.basic.factory.IPhone11ProFactory;
import br.com.cod3r.factory.apple.basic.factory.IPhoneFactory;
import br.com.cod3r.factory.apple.basic.factory.IPhoneXFactory;

public class Client {

	public static void main(String[] args) {
		IPhoneFactory factory = null;

		System.out.println("### Ordering an iPhone X");
		factory = new IPhoneXFactory();
		factory.orderIphone();

		System.out.println("\n\n### Ordering an iPhone 11 HighEnd");
		factory = new IPhone11ProFactory();

	}
}
