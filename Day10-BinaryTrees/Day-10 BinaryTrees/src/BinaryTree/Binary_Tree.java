package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//CREATING CLASS FOR BINARY TREE
public class Binary_Tree {
	TreeNode root = null;

	class TreeNode {
		int data;
		TreeNode left;
		TreeNode right;

		public TreeNode(int data, TreeNode left, TreeNode right) {
			this.data = data;
			this.left = left;
			this.right = right;
		}

	}

//	INSERTING THE VALUES INTO THE TREE

	public void insert() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the root value :");
		int val = sc.nextInt();
		if (val != -1) {
			TreeNode treeNode = new TreeNode(val, null, null);
			root = treeNode;
			insert(root, sc);
		}
	}

	private void insert(TreeNode curr, Scanner sc) {
		System.out.print("Enter the leftNode of " + curr.data + ":");
		int leftVal = sc.nextInt();
		if (leftVal != -1) {
			TreeNode treeNode = new TreeNode(leftVal, null, null);
			curr.left = treeNode;
			insert(curr.left, sc);
		}

		System.out.print("Enter the rightNode of " + curr.data + ":");
		int rightVal = sc.nextInt();
		if (rightVal != -1) {
			TreeNode treeNode = new TreeNode(rightVal, null, null);
			curr.right = treeNode;
			insert(curr.right, sc);
		}

	}

//	PREOREDR TRAVERSAL

	public void preorder() {
		preOrder(root);
	}

	private void preOrder(TreeNode curr) {
		if (curr == null) {
			return;
		}
		System.out.print(curr.data + " ");
		preOrder(curr.left);
		preOrder(curr.right);

	}

//	SEARCHING

	public boolean search(int key) {
		return search(key, root);
	}

	private boolean search(int key, TreeNode curr) {
		int count = 0;
		if (curr == null) {
			return false;
		} else if (curr.data == key) {
			return true;
		}
		count++;
		return search(key, curr.left) || search(key, curr.right);
	}

//	INOREDR TRAVERSAL

	public void inorder() {
		inOrder(root);
	}

	private void inOrder(TreeNode curr) {
		if (curr == null) {
			return;
		}
		inOrder(curr.left);
		System.out.print(curr.data + " ");
		inOrder(curr.right);

	}

//	POSTOREDR TRAVERSAL

	public void postorder() {
		postOrder(root);
	}

	private void postOrder(TreeNode curr) {
		if (curr == null) {
			return;
		}
		postOrder(curr.left);
		postOrder(curr.right);
		System.out.print(curr.data + " ");

	}

//	COUNTING THE NUMBER OF NODES

	public int nodeCount() {
		return nodecount(root);
	}

	private int nodecount(TreeNode curr) {
		if (curr == null) {
			return 0;
		}
		return 1 + nodecount(curr.left) + nodecount(curr.right);
	}

//	SUM THE NODE VALUES

	public int sumNode() {
		return sumnode(root);
	}

	private int sumnode(TreeNode curr) {
		if (curr == null) {
			return 0;
		}
		return sumnode(curr.left) + sumnode(curr.right) + curr.data;
	}

//	COUNT THE LEAF NODES

	public int leafCount() {
		return leafcount(root);
	}

	private int leafcount(TreeNode curr) {
		if (curr == null) {
			return 0;
		} else if (curr.left == null && curr.right == null) {
			return curr.data;

		}
		return leafcount(curr.left) + leafcount(curr.right);

	}
	

	public void leaf() {
		leaf(root);
	}

	private void leaf(TreeNode curr) {
		if (curr == null) {
			return;
		} 
		else if (curr.left == null && curr.right == null) {
			System.out.print(curr.data);
			return;

		}
		leaf(curr.left);
		leaf(curr.right);

	}

//	LEVELORDER TRAVERSAL (BFS)

	public void levelOrder() {
		if (root != null) {
			Queue<TreeNode> que = new LinkedList<TreeNode>();
			que.add(root);
			while (!que.isEmpty()) {
				TreeNode curr = que.poll();

				System.out.print(curr.data + " ");
				if (curr.left != null) {
					que.add(curr.left);
				}
				if (curr.right != null) {
					que.add(curr.right);
				}
			}
		}

	}

//	BFS INSERTION

	public void levelOredrInsertion(int[] arr) {
		if (arr.length > 0) {
			int i = 0;
			TreeNode treeNode = new TreeNode(arr[i], null, null);
			i++;
			root = treeNode;
			Queue<TreeNode> que = new LinkedList<TreeNode>();
			que.add(root);

			while (!que.isEmpty()) {
				TreeNode curr = que.poll();
				if (arr[i] != -1) {
					curr.left = new TreeNode(arr[i], null, null);
					que.add(curr.left);
				}
				i++;
				if (arr[i] != -1) {
					curr.right = new TreeNode(arr[i], null, null);
					que.add(curr.right);
				}
				i++;
			}
		}
	}

//	FINDING THE HEIGHT OF TREE

	public int height() {
		return height(root) - 1;
	}

	private int height(TreeNode curr) {
		if (curr == null) {
			return 0;
		}
		return 1 + Math.max(height(curr.left), height(curr.right));
	}

}
