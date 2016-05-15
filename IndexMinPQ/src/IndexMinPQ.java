import java.util.Arrays;
import java.util.NoSuchElementException;

public class IndexMinPQ<k extends Comparable<k>> {

	private int MAX;
	private int current;
	private int pq[];
	private int qp[];
	private k keys[];

	public IndexMinPQ(int value) {
		MAX = value;
		current = 0;
		pq = new int[MAX + 1];
		qp = new int[MAX + 1];
		keys = (k[]) new Comparable[MAX + 1];
		Arrays.fill(qp, -1);
	}

	public boolean contains(int index) {
		if (index < 0 || index >= MAX)
			throw new IndexOutOfBoundsException("index is not correct");
		return qp[index] != -1;
	}

	public void insert(int index, k value) {

		if (index < 0 || index >= MAX)
			throw new IndexOutOfBoundsException("index is not correct");

		if (contains(index))
			throw new IllegalArgumentException(
					"index is already in the priority queue");

		current++;

		qp[index] = current;
		pq[current] = index;
		keys[index] = value;
		swim(current);

	}

	private void swim(int i) {

		while (i > 1 && greater(i / 2, i)) {
			exch(i, i / 2);
			i = i / 2;
		}

	}

	private void exch(int i, int i2) {

		int temp = pq[i];
		pq[i] = pq[i2];
		pq[i2] = temp;

		qp[pq[i]] = i;
		qp[pq[i2]] = i2;

	}

	private boolean greater(int i, int i2) {
		return keys[pq[i]].compareTo(keys[pq[i2]]) > 0;
	}

	public k minKey() {
		if (current == 0)
			throw new NoSuchElementException("Priority queue underflow");
		return keys[pq[1]];
	}

	public int minIndex() {
		if (current == 0)
			throw new NoSuchElementException("Priority queue underflow");
		return pq[1];
	}

	public int deleteMin() {
		if (current == 0)
			throw new NoSuchElementException("Priority queue underflow");
		int min = pq[1];

		exch(1, current--);

		sink(1);

		qp[min] = -1;
		keys[pq[current + 1]] = null;

		return min;
	}

	public void delete(int i) {
		if (i < 0 || i >= MAX)
			throw new IndexOutOfBoundsException();
		if (!contains(i))
			throw new NoSuchElementException(
					"index is not in the priority queue");
		int index = qp[i];
		exch(index, current--);
		swim(index);
		sink(index);
		keys[i] = null;
		qp[i] = -1;
	}

	private void sink(int i) {

		while (i * 2 <= current) {

			int j = i * 2;

			if (j < current && greater(j, j + 1))
				j = j + 1;

			if (!greater(i, j))
				break;

			exch(i, j);
			i = j;
		}

	}

	public k keyOf(int i) {
		if (i < 0 || i >= MAX)
			throw new IndexOutOfBoundsException();
		if (!contains(i))
			throw new NoSuchElementException(
					"index is not in the priority queue");
		else
			return keys[i];
	}

	public void changeKey(int i, k key) {

		if (i < 0 || i >= MAX)
			throw new IndexOutOfBoundsException();
		if (!contains(i))
			throw new NoSuchElementException(
					"index is not in the priority queue");
		keys[i] = key;
		swim(qp[i]);
		sink(qp[i]);
	}

	public void decreaseKey(int i, k key) {
		if (i < 0 || i >= MAX)
			throw new IndexOutOfBoundsException();
		if (!contains(i))
			throw new NoSuchElementException(
					"index is not in the priority queue");
		if (keys[i].compareTo(key) <= 0)
			throw new IllegalArgumentException(
					"Calling decreaseKey() with given argument would not strictly decrease the key");

		keys[i] = key;
		swim(qp[i]);
	}

	public void increaseKey(int i, k key) {
		if (i < 0 || i >= MAX)
			throw new IndexOutOfBoundsException();
		if (!contains(i))
			throw new NoSuchElementException(
					"index is not in the priority queue");
		if (keys[i].compareTo(key) >= 0)
			throw new IllegalArgumentException(
					"Calling decreaseKey() with given argument would not strictly increse the key");

		keys[i] = key;
		sink(qp[i]);
	}
	
}
