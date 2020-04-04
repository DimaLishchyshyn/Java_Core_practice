package ua.lviv.igs.min;

public interface Iterator {

	boolean hasNext();

	Integer next();

	class Collection {
		private Integer[] namber;

		Collection(Integer[] namber) {
			this.namber = namber;
		}

		public class Forward implements Iterator {
			private int count = 0;
			
			

			@Override
			public boolean hasNext() {

				return count < namber.length;
			}

			@Override
			public Integer next() {
				return namber[count++];
			}

		}

		public Forward createForward() {
			return new Forward();
		}

		public class Backward implements Iterator {
			int count = namber.length - 1;

			@Override
			public boolean hasNext() {
				count--;
				return count >= 0;

			}

			@Override
			public Integer next() {
				return namber[count--];
			}
		}

		public Backward createBackward() {
			return new Backward();
		}
	}
}
