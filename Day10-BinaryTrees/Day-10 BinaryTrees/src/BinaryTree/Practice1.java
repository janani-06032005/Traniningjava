package BinaryTree;

public class Practice1 {

	public static void main(String[] args) {
		Binary_Tree bt = new Binary_Tree();
//		bt.insert();
//		bt.preorder();
//		System.out.println();
//		bt.inorder();
//		System.out.println();
//		bt.postorder();
//		System.out.println();
//		
//		System.out.println(bt.nodeCount());
//		System.out.println(bt.sumNode());
		
		
		int [] arr = {10,20,30,40,50,-1,60,-1,-1,-1,-1,-1,-1};
		bt.levelOredrInsertion(arr);
		bt.levelOrder();
		System.out.println();
		
		System.out.println(bt.height());
		
		System.out.println(bt.search(60));

	}

}
