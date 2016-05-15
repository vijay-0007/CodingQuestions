import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Snack {

	public static class Vertex {
		int dist;
		int vertex;

	}

	public static void main(String[] args) {

		int moves[] = new int[30];

		Arrays.fill(moves, -1);

		moves[2] = 21;
		moves[4] = 7;
		moves[10] = 25;
		moves[19] = 28;

		// Snakes
		moves[26] = 0;
		moves[20] = 8;
		moves[16] = 3;
		moves[18] = 6;

		minMove(moves);

	}

	private static void minMove(int[] moves) {

		int N = moves.length;
		boolean visited[] = new boolean[N];
		Queue<Vertex> q = new LinkedList<>();

		Vertex v = new Vertex();
		v.dist = 0;
		v.vertex = 0;
		visited[0] = true;
		q.add(v);

		while (!q.isEmpty()) {

			Vertex vv = q.poll();

			if (vv.vertex == N - 1) {
				System.out.println("dist is = " + vv.dist);
				break;
			}

			for (int i = vv.vertex + 1; i <= vv.vertex + 6 && i < N; i++) {

				if (!visited[i]) {

					Vertex vvv = new Vertex();
					vvv.dist = vv.dist + 1;

					if (moves[i] != -1)
						vvv.vertex = moves[i];
					else
						vvv.vertex = i;
					q.add(vvv);

					visited[i] = true;
				}

			}

		}

	}

}
