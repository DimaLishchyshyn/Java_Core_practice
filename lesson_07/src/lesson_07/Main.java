package lesson_07;

public class Main {

	public static void main(String[] args) {

		Cy_27 cy = new Cy_27(16400, 22, 14, 910, "—ин≥й");
		System.out.println(cy);

		System.out.println();

		cy.startMotors();
		cy.takeoffAirplane();

		System.out.println();

		System.out.println("–ухаЇмось");
		cy.moveUp(0);
		cy.moveLeft(0);
		cy.moveRight(0);
		cy.moveDown(0);

		System.out.println();

		cy.StealthTechnology();
		cy.NuclearStrike();
		cy.TurboAcceleration();

		System.out.println();

		cy.landingAirplane();

	}

}
