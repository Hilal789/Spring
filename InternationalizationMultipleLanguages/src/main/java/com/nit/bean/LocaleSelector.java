package com.nit.bean;

import java.util.Locale;
import java.util.Scanner;

import org.springframework.stereotype.Component;
@Component
public class LocaleSelector {

	public  Locale localSelector() {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter language code (en, hi, te): ");
		String code = sc.nextLine().trim().toLowerCase();

		switch (code) {
		case "hi":
			return new Locale("hi");
		case "te":
			return new Locale("te");
		default:
			return Locale.ENGLISH;
		}

	}

}
