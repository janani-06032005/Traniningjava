import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class Graph {
	int[][] matrix;
	int n;

	public Graph(int n) {
		this.n = n;
		matrix = new int[n][n];
	}

	void display() {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}

	void link(int src, int dest) {
		if (src >= 0 && src < n && dest >= 0 && dest < n) {
			matrix[src][dest] = 1;
			matrix[dest][src] = 1;
		}
	}

	void bfs(int src) {
		if (src >= 0 && src < n) {
			boolean[] visited = new boolean[n];
			Queue<Integer> que = new LinkedList<>();

			que.add(src);
			visited[src] = true;

			while (!que.isEmpty()) {
				int t = que.remove();
				System.out.print(t + " ");

				for (int i = 0; i < n; i++) {
					if (matrix[t][i] == 1 && visited[i] == false) {
						que.add(i);
						visited[i] = true;
					}
				}

			}
			System.out.println();

		}
	}

	void dfs(int src) {
		if (src >= 0 && src < n) {
			boolean[] visited = new boolean[n];
			Stack<Integer> stack = new Stack<>();

			stack.push(src);
			visited[src] = true;

			while (!stack.isEmpty()) {
				int t = stack.pop();
				System.out.print(t + " ");

				for (int i = 0; i < n; i++) {
					if (matrix[t][i] == 1 && visited[i] == false) {
						stack.push(i);
						visited[i] = true;
					}
				}

			}
			System.out.println();

		}
	}

}

public class Practice {

	public static void main(String[] args) {
		Graph graph = new Graph(4);

		graph.link(0, 1);
		graph.link(1, 2);
		graph.link(2, 3);
		graph.link(3, 0);
		graph.link(3, 1);

		graph.display();
		System.out.println();

		System.out.println("the bfs of the following graph is ");
		graph.bfs(0);

		System.out.println("the dfs of the following graph is ");
		graph.dfs(0);

	}

}
