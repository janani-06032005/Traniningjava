import java.util.LinkedList;
import java.util.Queue;



class Binary_Search_Tree {
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

//	INSERTION

	public void insert(int data) {
		root = insert(root, data);
	}

	private TreeNode insert(TreeNode curr, int data) {
		if (curr == null) {
			return new TreeNode(data, null, null);
		} else if (data < curr.data) {
			curr.left = insert(curr.left, data);
		} else if (data > curr.data) {
			curr.right = insert(curr.right, data);
		}
		return curr;
	}

//	PRINTING

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

//	SEARCHING

	public boolean search(int key) {
		return search(root, key);
	}

	private boolean search(TreeNode curr, int key) {
		if (curr == null) {
			return false;
		} else if (curr.data == key) {
			return true;

		} else if (key < curr.data) {
			return search(curr.left, key);
		} else {
			return search(curr.right, key);
		}
	}

//	INORDER TRAVERSAL

	public void inorder() {
		inorder(root);
	}

	private void inorder(TreeNode curr) {
		if (curr == null) {
			return;
		}

		inorder(curr.left);
		System.out.print(curr.data + " ");
		inorder(curr.right);

	}
	
	
//	INORDERINRANGE TRAVERSAL

	public void inorderinrange(int start, int end) {
		inorder(root, start, end);
	}

	private void inorder(TreeNode curr, int start, int end) {
		if (curr == null) {
			return;
		}

		inorder(curr.left, start, end);
		if (curr.data >= start && curr.data <= end) {
			System.out.print(curr.data + " ");
		}

		inorder(curr.right, start, end);

	}
	
	
	public int findmax() {
		if(root == null) {
			return -1;
		}
		return findmax(root);
	}

	private int findmax(TreeNode curr) {
		if(curr.right == null) {
			return curr.data;
		}
		return findmax(curr.right);
	}
	
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

}
