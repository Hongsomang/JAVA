
public class EnumExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Week today=Week.SUNDAY;
		String name=today.name();
		System.out.println(name);
		int ordinal=today.ordinal();
		System.out.println(ordinal);
		Week day1=Week.MONDAY;
		Week day2=Week.WENDESDAY;
		int result1=day1.compareTo(day2);
		int result2=day2.compareTo(day2);
		System.out.println(result1);
		System.out.println(result2);
		if(args.length==1){
			String strday=args[0];
			Week weekday=Week.valueOf(strday);
			if(weekday==Week.SATURDAY||weekday==Week.SUNDAY){
				System.out.println("쉬자");
			}
			else{
				System.out.println("공부하자");
			}
		}
		Week[] days=Week.values();
		for(Week day: days){
			System.out.println(day);
		}
	}

}
