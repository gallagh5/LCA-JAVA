	// Recursive Java program to print lca of two nodes 
	   
	// A binary tree node 
	import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.fail;

import org.junit.Test;



	
	// Recursive Java program to print lca of two nodes 
	   
	// A binary tree node 
	import java.util.ArrayList;
	import java.util.Iterator;
	import java.util.LinkedList;
	import java.util.List; 

	// make Binary tree node 
	class Node { 
		int data; 
		Node left, right; 

		Node(int nodeNumber) { 
			data = nodeNumber; 
			left = right = null; 
		} 
	} 

	public class LCA {
		Node root; 
		private List<Integer> L1 = new ArrayList<>(); 
		private List<Integer> L2 = new ArrayList<>(); 

		// Find path from root node to given root of tree. 
		int findLCA(int node1, int node2) { 
			L1.clear(); 
			L2.clear(); 
			return findLCA(root, node1, node2); 
		} 

		private int findLCA(Node LCAroot, int node1, int node2) { 

			if (!findPath(LCAroot, node1, L1) || !findPath(LCAroot, node2, L1)) { 
				System.out.println((L1.size() > 0) ? "node1 is present" : "node1 is missing"); 
				System.out.println((L2.size() > 0) ? "node2 is present" : "node2 is missing"); 
				return -1; 
			} 

			int index; 
			for (index = 0; index < L1.size() && index < L2.size(); index++) {  
				if (!L1.get(index).equals(L2.get(index))) 
					break; 
			} 

			return L1.get(index-1); 
		} 

		// Find path from root node to given root of tree
		// Stores path in vector path[]
		// Return true if path exists, otherwise return false 
		private boolean findPath(Node root, int node, List<Integer> pathList) 
		{ 
			// if no path return false
			if (root == null) { 
				return false;  
			} 

			// Stores node
			// Node deleted if not in path from root to n. 
			pathList.add(root.data); 

			if (root.data == node) { 
				return true; 
			} 

			if (root.left != null && findPath(root.left, node, pathList)) { 
				return true; 
			} 

			if (root.right != null && findPath(root.right, node, pathList)) { 
				return true; 
			} 

			// If not present in subtree rooted with root, remove root from 
			
			pathList.remove(pathList.size()-1); 

			return false; 
		} 
	}
   
