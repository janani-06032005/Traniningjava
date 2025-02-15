
public class Practice1 {

	public static void main(String[] args) {
		Binary_Search_Tree bst = new Binary_Search_Tree();
		bst.insert(50);
		bst.insert(20);
		bst.insert(30);
		bst.insert(10);
		bst.insert(60);
		bst.insert(55);
		bst.insert(70);
		
//		bst.inorder();
//		System.out.println(bst.search(60));
//		
//		bst.inorderinrange(10,60);
		
		System.out.println(bst.findmax());
		 System.out.println(bst.leafCount());

	}

}
