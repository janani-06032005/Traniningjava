package Practice;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class Graph2 {
	LinkedList<Integer>[] arr;
	int vertex;

	Graph2(int vertex) {
		this.vertex = vertex;
		arr = new LinkedList[vertex];

		for (int i = 0; i < vertex; i++) {
			arr[i] = new LinkedList<>();
		}
	}

	void bfs(int src) {
		if (src >= 0 && src < vertex) {
			Queue<Integer> que = new LinkedList<>();
			boolean[] visited = new boolean[vertex];

			que.add(src);
			visited[src] = true;

			while (!que.isEmpty()) {
				int k = que.poll();
				System.out.println(k + " ");

				for (int li : arr[k]) {
					if (visited[li] == false) {
						visited[li] = true;
						que.add(li);
					}
				}
			}
		}
	}
	void dfs(int src) {
		if (src >= 0 && src < vertex) {
			Stack<Integer> stack = new Stack<>();
			boolean[] visited = new boolean[vertex];

			stack.push(src);
			visited[src] = true;

			while (!stack.isEmpty()) {
				int k = stack.pop();
				System.out.println(k + " ");

				for (int li : arr[k]) {
					if (visited[li] == false) {
						visited[li] = true;
						stack.push(li);
					}
				}
			}
		}
	}

	public void link(int src, int dest, boolean flag) {
		arr[src].add(dest);
		if (flag) {
			arr[dest].add(src);
		}
	}

}

public class Practice1 {

	public static void main(String[] args) {
		Graph2 g = new Graph2(4);
		g.link(0,1, true);
		g.link(0,1, true);
		g.link(0,1, true);
		g.link(0,1, true);
		g.bfs(0);

	}

}
