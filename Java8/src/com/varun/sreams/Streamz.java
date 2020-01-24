/*package com.varun.sreams;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import practz.utilz.constructionz.Lazy;

public class Streamz {
	
	// sorting
	// 	by id (default & needs no action)
	// 	by age
	//	by name
	//	by department
	// 	by department and then sub-sorting by name
	//	by last name
	
	// filtering
	// 	from a given department
	//	of a given age
	//	above/below a given age
	//	living nearby airport & from USA
	//	dynamically clubbed conditions (either of 2 departments & not around high-court)
	
	// map
	//	create hybrid id as [First 3 letters of name, all caps]-[3 digit id]
	//	from above, show only the ones ending with 0
	//	list all addresses
	//	from above, show in non repeating manner, i.e. unique
	
	// select
	//	group by departments and return in a map
	//	student with earliest id in given department
	//	anyone from the youngest age in a department
	//	average of ages after last (filter) point
	//	get a comma separated list of all department names
	//	create a cache-type map with ID as key and student's name as value
	//	get all US students in a List & in a Set
	
	// checks
	//	check if anyone is from Europe
	//	check if no one is from Japan
	//	check if everyone is below 30 (or below 24)
	
	// calculations
	//	get the sum of all even numbers from 1 to 50
	//	get the multiplication of all numbers between 20 and 60 that are divisible by 7
	//	I want to know the average of all positive odd numbers (reuse even number condition) below 50.
	//	- what if I keep adding them in averaging manner, i.e. sum 2 adjacent and divide by 2, how much it'll deviate from actual average
	
	// hybrid
	//	create hybrid id as [DEPT]-[4 digit id^2] & show sorted
	//	get count of students in each department

	public static void main(String[] args) {
		
		List<Student> students = DataGenerator.students();
		
		List<String> s = students.stream().map(Student::getDepartment).distinct().sorted().collect(toList());
		System.out.println(s);
	}
	
}

@Data
class Student {
	
	private static final String toStringFormat = "%03d - %" + DataGenerator.maxLengthOfName() + "s [ ages %02d, in %4s, from %s ]";
	
	private final int id;
	private final String name;
	private final int age;
	private final String department;
	private final Address address;

	@Override
	public String toString() {
		return String.format(toStringFormat, id, name, age, department, address);
	}
}

@Data
@RequiredArgsConstructor
class Address {
	
	private static final String toStringFormat = "%" + DataGenerator.maxLengthOfArea() + "s, %"+ DataGenerator.maxLengthOfState() + "s, %"+ DataGenerator.maxLengthOfCountry() + "s, %06d";
	
	private final String area;
	private final String state;
	private final String country;
	private final int pinCode;
	
	Address(String area, String[] location) {
		this(area, location[0], location[1], Integer.parseInt(location[2]));
	}
	
	@Override
	public String toString() {
		return String.format(toStringFormat, area, state, country, pinCode);
	}
}

class DataGenerator {
	
	private static final Randomizer random = new Randomizer();
	private static final String[] areas = {"Mindspace", "National Highway", "Central Park", "Railway Station", "International Airport", "Domestic Airport", "Eastern Bypass", "Pentagon Cross", "Hi Court", "University Campus"};
	private static final String[][] locations = {
			{"Maharastra", "India", "400701"}, {"West Bengal", "India", "733001"}, {"UP", "India", "548632"}, {"Gujrat", "India", "798956"}, {"Kerala", "India", "241560"}, {"Odissa", "India", "645465"},
			{"Assam", "India", "857496"}, {"Delhi", "India", "100241"}, {"Hariyana", "India", "512151"}, {"Telengana", "India", "789651"}, {"Bihar", "India", "587421"},
			{"Washington", "USA", "100024"}, {"Olkahoma", "USA", "100258"}, {"Kurugai", "USA", "500214"}
	};
	private static final String[] departments = {"ME", "ECE", "CS", "IT", "EE", "AEIE", "CE"};
	private static final String[] firstNames = {"Liam", "Noah", "William", "James", "Oliver", "Benjamin", "Elijah", "Lucas", "Mason", "Logan", "Alexander", "Ethan", "Jacob", "Michael", "Daniel", "Henry", "Jackson", "Sebastian", "Aiden", "Matthew", "Samuel", "David", "Joseph", "Carter", "Owen", "Wyatt", "John", "Jack", "Luke", "Jayden", "Dylan", "Grayson", "Levi", "Isaac", "Gabriel", "Julian", "Mateo", "Anthony", "Jaxon", "Lincoln", "Joshua", "Christopher", "Andrew", "Theodore", "Caleb", "Ryan", "Asher", "Nathan", "Thomas", "Leo", "Isaiah", "Charles", "Josiah", "Hudson", "Christian", "Hunter", "Connor", "Eli", "Ezra", "Aaron", "Landon", "Adrian", "Jonathan", "Nolan", "Jeremiah", "Easton", "Elias", "Colton", "Cameron", "Carson", "Robert", "Angel", "Maverick", "Nicholas", "Dominic", "Jaxson", "Greyson", "Adam", "Ian", "Austin", "Santiago", "Jordan", "Cooper", "Brayden", "Roman", "Evan", "Ezekiel", "Xavier", "Jose", "Jace", "Jameson", "Leonardo", "Bryson", "Axel", "Everett", "Parker", "Kayden", "Miles", "Sawyer", "Jason", "Declan", "Weston", "Micah", "Ayden", "Wesley", "Luca", "Vincent", "Damian", "Zachary", "Silas", "Gavin", "Chase", "Kai", "Emmett", "Harrison", "Nathaniel", "Kingston", "Cole", "Tyler", "Bennett", "Bentley", "Ryker", "Tristan", "Brandon", "Kevin", "Luis", "George", "Ashton", "Rowan", "Braxton", "Ryder", "Gael", "Ivan", "Diego", "Maxwell", "Max", "Carlos", "Kaiden", "Juan", "Maddox", "Justin", "Waylon", "Calvin", "Giovanni", "Jonah", "Abel", "Jayce", "Jesus", "Amir", "King", "Beau", "Camden", "Alex", "Jasper", "Malachi", "Brody", "Jude", "Blake", "Emmanuel", "Eric", "Brooks", "Elliot", "Antonio", "Abraham", "Timothy", "Finn", "Rhett", "Elliott", "Edward", "August", "Xander", "Alan", "Dean", "Lorenzo", "Bryce", "Karter", "Victor", "Milo", "Miguel", "Hayden", "Graham", "Grant", "Zion", "Tucker", "Jesse", "Zayden", "Joel", "Richard", "Patrick", "Emiliano", "Avery", "Nicolas", "Brantley", "Dawson", "Myles", "Matteo", "River", "Steven", "Thiago", "Zane", "Matias", "Judah", "Messiah", "Jeremy", "Preston", "Oscar", "Kaleb", "Alejandro", "Marcus", "Mark", "Peter", "Maximus", "Barrett", "Jax", "Andres", "Holden", "Legend", "Charlie", "Knox", "Kaden", "Paxton", "Kyrie", "Kyle", "Griffin", "Josue", "Kenneth", "Beckett", "Enzo", "Adriel", "Arthur", "Felix", "Bryan", "Lukas", "Paul", "Brian", "Colt", "Caden", "Leon", "Archer", "Omar", "Israel", "Aidan", "Theo", "Javier", "Remington", "Jaden", "Bradley", "Emilio", "Colin", "Riley", "Cayden", "Phoenix", "Clayton", "Simon", "Ace", "Nash"};
	private static final String[] lastNames = {"Smith", "Johnson", "Williams", "Brown", "Jones", "Garcia", "Miller", "Davis", "Rodriguez", "Martinez", "Hernandez", "Lopez", "Gonzalez", "Wilson", "Anderson", "Thomas", "Taylor", "Moore", "Jackson", "Martin", "Lee", "Perez", "Thompson", "White", "Harris", "Sanchez", "Clark", "Ramirez", "Lewis", "Robinson", "Walker", "Young", "Allen", "King", "Wright", "Scott", "Torres", "Nguyen", "Hill", "Flores", "Green", "Adams", "Nelson", "Baker", "Hall", "Rivera", "Campbell", "Mitchell", "Carter", "Roberts", "Gomez", "Phillips", "Evans", "Turner", "Diaz", "Parker", "Cruz", "Edwards", "Collins", "Reyes", "Stewart", "Morris", "Morales", "Murphy", "Cook", "Rogers", "Gutierrez", "Ortiz", "Morgan", "Cooper", "Peterson", "Bailey", "Reed", "Kelly", "Howard", "Ramos", "Kim", "Cox", "Ward", "Richardson", "Watson", "Brooks", "Chavez", "Wood", "James", "Bennett", "Gray", "Mendoza", "Ruiz", "Hughes", "Price", "Alvarez", "Castillo", "Sanders", "Patel", "Myers", "Long", "Ross", "Foster", "Jimenez", "Powell", "Jenkins", "Perry", "Russell", "Sullivan", "Bell", "Coleman", "Butler", "Henderson", "Barnes", "Gonzales", "Fisher", "Vasquez", "Simmons", "Romero", "Jordan", "Patterson", "Alexander", "Hamilton", "Graham", "Reynolds", "Griffin", "Wallace", "Moreno", "West", "Cole", "Hayes", "Bryant", "Herrera", "Gibson", "Ellis", "Tran", "Medina", "Aguilar", "Stevens", "Murray", "Ford", "Castro", "Marshall", "Owens", "Harrison", "Fernandez", "Mcdonald", "Woods", "Washington", "Kennedy", "Wells", "Vargas", "Henry", "Chen", "Freeman", "Webb", "Tucker", "Guzman", "Burns", "Crawford", "Olson", "Simpson", "Porter", "Hunter", "Gordon", "Mendez", "Silva", "Shaw", "Snyder", "Mason", "Dixon", "Munoz", "Hunt", "Hicks", "Holmes", "Palmer", "Wagner", "Black", "Robertson", "Boyd", "Rose", "Stone", "Salazar", "Fox", "Warren", "Mills", "Meyer", "Rice", "Schmidt", "Garza", "Daniels", "Ferguson", "Nichols", "Stephens", "Soto", "Weaver", "Ryan", "Gardner", "Payne", "Grant", "Dunn", "Kelley", "Spencer", "Hawkins", "Arnold", "Pierce", "Vazquez", "Hansen", "Peters", "Santos", "Hart", "Bradley", "Knight", "Elliott", "Cunningham", "Duncan", "Armstrong", "Hudson", "Carroll", "Lane", "Riley", "Andrews", "Alvarado", "Ray", "Delgado", "Berry", "Perkins", "Hoffman", "Johnston", "Matthews", "Pena", "Richards", "Contreras", "Willis", "Carpenter", "Lawrence", "Sandoval", "Guerrero", "George", "Chapman", "Rios", "Estrada", "Ortega", "Watkins", "Greene", "Nunez", "Wheeler", "Valdez", "Harper", "Burke", "Larson", "Santiago", "Maldonado", "Morrison", "Franklin", "Carlson", "Austin", "Dominguez", "Carr", "Lawson"};
	
	private static final Lazy<List<Address>> generateAddresses = Lazy.of(() -> {
		final int limit = 20;
		
		return Stream.generate(() -> new Address(random.pick(areas), random.pick(locations)))
				.limit(limit)
				.collect(toList());
	});
	
	private static final Lazy<List<Student>> generateStudents = Lazy.of(() -> {
		final int limit = 200;
		
		List<Address> addresses = addresses();
		
		return IntStream.rangeClosed(1, limit)
				.mapToObj(id -> new Student(id,
						String.format("%s %s", random.pick(firstNames), random.pick(lastNames)),
						random.pick(6) + 20,
						random.pick(departments), random.pick(addresses)))
				.collect(toList());
	});

	public static List<Address> addresses() {
		return generateAddresses.get();
	}
	public static List<Student> students() {
		return generateStudents.get();
	}
	
	public static int maxLengthOfName() {
		return maxLengthOf(firstNames) + maxLengthOf(lastNames) + 1;
	}
	public static int maxLengthOfArea() {
		return maxLengthOf(areas);
	}
	public static int maxLengthOfState() {
		return maxLengthOf(locations, 0);
	}
	public static int maxLengthOfCountry() {
		return maxLengthOf(locations, 1);
	}

	private static int maxLengthOf(String[] ss) {
		return Arrays.stream(ss).mapToInt(String::length).max().getAsInt();
	}
	private static int maxLengthOf(String[][] ss, int col) {
		return Arrays.stream(ss).map(sss -> sss[col]).mapToInt(String::length).max().getAsInt();
	}
}

class Randomizer {
	private Random random = new Random();
	@SuppressWarnings("unchecked")
	public <T> T pick(T...ts) {
		return ts[random.nextInt(ts.length)];
	}
	public <T> T pick(List<T> ts) {
		return ts.get(random.nextInt(ts.size()));
	}
	public int pick(int limit) {
		return random.nextInt(limit);
	}
}
*/