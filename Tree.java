import java.util.*;

public class Tree {
	static class Node {
		int data;
		Node Left;
		Node Right;
		
		Node (int data) {
			this.data = data;
			this.Left = null;
			this.Right = null;
		}
	}
	
	static class BinaryTree {
		static int idx = -1;
		public static Node buildTree(int nodes[]) {
			idx++;
			if(nodes[idx] == -1) {
				return null;
			}
			Node newNode = new Node(nodes[idx]);
			newNode.Left = buildTree(nodes);
			newNode.Right = buildTree(nodes);
			return newNode;
		}
	}
	
	public static void preorder (Node root) {
		if(root == null) {
			return ;
		}
		System.out.print(root.data +" ");
		preorder(root.Left);
		preorder(root.Right);
	}
	
	public static void inorder(Node root) {
		if(root == null) {
			return;
		}
		inorder(root.Left);
		System.out.print(root.data + " ");
		inorder(root.Right);
	}
	
	public static void postorder(Node root) {
		if(root == null) {
			return;
		}	
		postorder(root.Left);
		postorder(root.Right);
		System.out.print(root.data+ " ");
	}
	
	public static void levelorder(Node root) {
		if(root == null) {
			return;
		}
		Queue <Node> q = new LinkedList<>();
		q.add(root);
		q.add(null);
		
		while(!q.isEmpty()) {
			Node currNode = q.remove();
			if(currNode == null) {
				System.out.println();
				if(q.isEmpty()) {
					break;
				} else {
				q.add(null);
				} 
			} else {
					System.out.print(currNode.data + " ");
					if(currNode.Left != null) {
						q.add(currNode.Left);
					}
					if(currNode.Right != null) {
						q.add(currNode.Right);
					}
				}
			}
		}
	
	public static int countofNodes(Node root) {
		if(root == null) {
			return 0;
		}
		int LeftNodes = countofNodes(root.Left);
		int RightNodes = countofNodes(root.Right);
		
		return LeftNodes + RightNodes + 1;
	}
	
	public static void main (String[] args) {
		int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
		BinaryTree tree = new BinaryTree();
		Node root = tree.buildTree(nodes);
		System.out.println(root.data);
		System.out.println();
		preorder(root);
		System.out.println();
		inorder(root);
		System.out.println();
		postorder(root);
		System.out.println();
		System.out.println();
		levelorder(root);
		System.out.println();
		System.out.println();
		System.out.println(countofNodes(root));
	}
}