package com.aa.myfunctional.interfcae.test;

import java.util.HashMap;
import java.util.Map;

@FunctionalInterface
interface CardService {
	String getCardImageName(String cardType);
}

class CardDataParsee {

	public Map<String, String> getAllcardDetails(CardService cardService) {
		Map<String, String> result = new HashMap<String, String>();
		result.put("CARD NAME", "VISA CARD");
		result.put("IMAGE NAME", cardService.getCardImageName("VISA CARD"));
		return result;
	}
}

public class MyFunctionalInterfaceTester {

	public static void main(String[] args) {

		CardDataParsee cardParse = new CardDataParsee();

		Map<String, String> allcardDetails = cardParse.getAllcardDetails(x -> "00.png");

		allcardDetails.forEach((k, v) -> {
			System.out.println(k + " - " + v);
		});
	}

}
