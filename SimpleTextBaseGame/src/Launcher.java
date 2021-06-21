import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class Launcher {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		list.add("January");
		list.add("Febrauary");
		list.add("March");
		list.add("April");
		list.add("May");
		list.add("June");
		list.add("July");
		list.add("Augest");
		list.add("September");
		list.add("October");
		list.add("November");
		list.add("December");
		list.add("October");
		list.add("Novmber");
		list.add("Decmber");
//		java.util.Iterator<String> itr=list.iterator();  
//		while(itr.hasNext()){  
//		System.out.println(itr.next());  
	//}
		
		//both methods work but this is the fastest 
		for(String months: list) {
			System.out.println(months);
		}
		
		String jan=list.get(0);
		String feb=list.get(1);
		String mar=list.get(2);
		String apr=list.get(3);
		String may=list.get(4);
		String jun=list.get(5);
		String jul=list.get(6);
		String aug=list.get(7);
		String sep=list.get(8);
		String oct=list.get(9);
		String nov=list.get(10);
		String dec=list.get(11);
		
		//create a map
		Map<String,String> map=new HashMap<String,String>(); 
		map.put(jan, "AQUARIUS ZODIAC SIGN");
		map.put(feb, "PISCES ZODIAC SIGN PISCES HOROSCOP");
		map.put(mar, "ARIES ZODIAC SIGN ARIES HOROSCOPE");
		map.put(apr, "TAURUS ZODIAC SIGN TAURUS HOROSCOPE");
		map.put(may, "GEMINI ZODIAC SIGN GEMINI HOROSCOPE");
		map.put(jun, "CANCER ZODIAC SIGN CANCER HOROSCOPE");
		map.put(jul, "LEO ZODIAC SIGN LEO HOROSCOPE");
		map.put(aug, "VIRGO ZODIAC SIGN VIRGO HOROSCOPE");
		map.put(sep, "LIBRA ZODIAC SIGN LIBRA HOROSCOPE");
		map.put(oct, "SCORPIO ZODIAC SIGN SCORPIO HOROSCOPE");
		map.put(nov, "SAGITTARIUS ZODIAC SIGN SAGITTARIUS HOROSCOPE");
		map.put(dec, "CAPRICORN ZODIAC SIGN CAPRICORN HOROSCOPE");
		//print each of one
		String monthOne = map.get(jan);
		System.out.println("Your Astrology is " + monthOne.toLowerCase());
		
		String monthTwo = map.get(feb);
		System.out.println("Your Astrology is " + monthTwo.toLowerCase());
		
		String monthThree = map.get(mar);
		System.out.println("Your Astrology is " + monthThree.toLowerCase());
		
		String monthFour = map.get(apr);
		System.out.println("Your Astrology is " + monthFour.toLowerCase());
		
		String monthFive = map.get(may);
		System.out.println("Your Astrology is " + monthFive.toLowerCase());
		
		String monthSix = map.get(jun);
		System.out.println("Your Astrology is " + monthSix.toLowerCase());
		
		String monthSeven = map.get(jul);
		System.out.println("Your Astrology is " + monthSeven.toLowerCase());
		
		String monthEight = map.get(aug);
		System.out.println("Your Astrology is " + monthEight.toLowerCase());
		
		String monthNine = map.get(sep);
		System.out.println("Your Astrology is " + monthNine.toLowerCase());
		
		String monthTen = map.get(oct);
		System.out.println("Your Astrology is " + monthTen.toLowerCase());
		
		String monthEleven = map.get(nov);
		System.out.println("Your Astrology is " + monthEleven.toLowerCase());
		
		String monthTwelve = map.get(dec);
		System.out.println("Your Astrology is " + monthTwelve.toLowerCase());
		
		
		
		//print all of it 
		Set<Entry<String, String>> set=map.entrySet();  
		  
		java.util.Iterator<Entry<String, String>> itr=set.iterator();  
		while(itr.hasNext()){  
		Entry<String, String> e=itr.next();//no need to typecast  
		System.out.println(e.getKey()+" "+e.getValue()); 
	}
		
		System.out.println("would you like to know your astrology");
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);
		
		String knowAstrology = keyboard.nextLine();
		 if(knowAstrology.equalsIgnoreCase("No")) {
			System.out.println("ugh ...No. I would love to tell you your astrology. But still lets play next.Next time be postive atleast so i dont scrach my head again");
		}
		 
		if( knowAstrology.equalsIgnoreCase("YES")){
			System.out.println("Enter your month of birth");
			
			
			String dateOfMonth = keyboard.nextLine();
			if(dateOfMonth.equalsIgnoreCase(jan)) {
				System.out.println("Your Astrology is " + monthOne.toLowerCase());
			}
			else if(dateOfMonth.equalsIgnoreCase(feb)) {
				System.out.println("Your Astrology is " + monthTwo.toLowerCase());
			}
			else if(dateOfMonth.equalsIgnoreCase(mar)) {
				System.out.println("Your Astrology is " + monthThree.toLowerCase());
			}
			
			else if(dateOfMonth.equalsIgnoreCase(apr)) {
				System.out.println("Your Astrology is " + monthFour.toLowerCase());
			}
			
			else if(dateOfMonth.equalsIgnoreCase(may)) {
				System.out.println("Your Astrology is " + monthFive.toLowerCase());
			}
			
			else if(dateOfMonth.equalsIgnoreCase(jun)) {
				System.out.println("Your Astrology is " + monthSix.toLowerCase());
			}
			
			else if(dateOfMonth.equalsIgnoreCase(jul)) {
				System.out.println("Your Astrology is " + monthSeven.toLowerCase());
			}
			
			else if(dateOfMonth.equalsIgnoreCase(aug)) {
				System.out.println("Your Astrology is " + monthEight.toLowerCase());
			}
			
			else if(dateOfMonth.equalsIgnoreCase(sep)) {
				System.out.println("Your Astrology is " + monthNine.toLowerCase());
			}
			
			else if(dateOfMonth.equalsIgnoreCase(oct)) {
				System.out.println("Your Astrology is " + monthTen.toLowerCase());
			}
			
			else if(dateOfMonth.equalsIgnoreCase(nov)) {
				System.out.println("Your Astrology is " + monthTwelve.toLowerCase());
			}
			
			else if(dateOfMonth.equalsIgnoreCase(dec)) {
				System.out.println("Your Astrology is " + monthEleven.toLowerCase());
			}
			
			else if(dateOfMonth.equalsIgnoreCase(feb)) {
				System.out.println("Your Astrology is " + monthTwelve.toLowerCase());
			}
			
			
			
			
			
			
		}
		
		
	}
}
