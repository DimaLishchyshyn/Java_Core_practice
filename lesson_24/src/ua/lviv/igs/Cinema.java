package ua.lviv.igs;

import java.util.ArrayList;
import java.util.Optional;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Cinema {

	TreeMap<Days, Schedule> schedules;
	static ArrayList<Movie> moviesLibrary = new ArrayList<Movie>();

	@SuppressWarnings("unused")
	private Time open;
	@SuppressWarnings("unused")
	private Time close;

	public Cinema(Time open, Time close) {
		super();
		this.open = open;
		this.close = close;
	}
	// Data entry
	static Supplier<Movie> createMovie = () -> {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("������ ����� ���������");
		String title = sc.next();
		System.out.println("������ ��� ����������� ���������");
		System.out.println("������");
		int hour = sc.nextInt();
		System.out.println("�������");
		int min = sc.nextInt();

		try {
			return new Movie(title, new Time(hour, min));
		} catch (TimeException e) {
			e.printStackTrace();
		}
		return null;

	};
	// Data entry
	static Supplier<Movie> getMovie = () -> {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("������ ����� ���������");
		String title = sc.next();

		return new Movie(title);
	};

	static void addMovie() throws TimeException {

		Movie movie = createMovie.get();

		moviesLibrary.add(movie);
		System.out.println("" + movie.toString() + " ������ ����������� �� ��������");
	}

	static void allMovies() {
		System.out.println("ʳ��������, �� ����������� � ��������");
		moviesLibrary.forEach(System.out::println);
	}
	
	static void removeMovie() {
		Movie movieRemove = getMovie.get();

		// Search and remove object 
		Predicate<Movie> isEqualTitle = movie -> movie.getTitle().equalsIgnoreCase(movieRemove.getTitle())
				&& movie.getTitle().equalsIgnoreCase(movieRemove.getTitle());
		Optional<Movie> movieFound = moviesLibrary.stream().filter(isEqualTitle).findFirst();

		if (movieFound.isPresent()) {
			moviesLibrary.remove(movieFound.get());
			System.out.println("ʳ�������� " + movieFound.get().toString() + " ������� �������� � ��������.");

		} else {
			System.out.println("���������� �������� ��� � ������ �������!");
		}
	}

	static void addSeance() {

	}

	static void removeSeance() {

	}

}
