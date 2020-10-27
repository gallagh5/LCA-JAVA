import static org.junit.Assert.*;

import org.junit.Test;





public class LCATest {

	Node root;
	@Test
	public void test() {
		fail("Not yet implemented");
	}
		@Test
		public void testEmptyTree() {
			//testing funcion for empty tree
			LCA tree = new LCA();
			assertNull("Testing empty tree", tree.root);
		}

		@Test 
		public void testSingleNodeBT() {
			//testing function and findLCA() for a Binary tree with only one node
			LCA tree = new LCA();
			tree.root = new Node(1);
			assertEquals("Testing a tree with only one node", tree.findLCA(1, 2), -1);
		}

		@Test
		public void test2NodeBT() {
			//testing function and findLCA() for a BT with only two nodes
			LCA tree = new LCA();
			tree.root = new Node(1);
			tree.root.left = new Node(2);
			assertEquals("seeing if binary tree with two nodes", tree.findLCA(1, 2), 1);
		}

		@Test
		public void testLCA() {
			//testing that the correct LCA is works 
			LCA tree = new LCA();
			tree.root = new Node(1);
			tree.root.left = new Node(2);
			tree.root.right = new Node(3);
			assertEquals("Data value is correct:",1,tree.root.data);
			assertEquals("Data value is correct:",2,tree.root.left.data);
			assertEquals("Data value is correct:",3,tree.root.right.data);
		}

		@Test
		public void testFindPath() {
			//testing that the correct path is found and followed 
			LCA tree = new LCA(); 
			
			tree.root= new Node(1); 
			tree.root.left = new Node(2); 
			tree.root.right = new Node(3); 
			tree.root.left.left = new Node(4); 
			tree.root.left.right = new Node(5); 
			tree.root.right.left = new Node(6); 
			tree.root.right.right = new Node(7); 
			
			assertEquals("tree with no root.",tree.findLCA(4, 0),-1);

			assertEquals("LCA(2,3) should be 1.", tree.findLCA(2, 3),1);
			assertEquals("LCA(3,6) should be 3.", tree.findLCA(3, 6),3);
			assertEquals("LCA(3,4) should be 1.", tree.findLCA(3, 4),1);
			assertEquals("LCA(2,4) should be 2.", tree.findLCA(2, 4),2);
		}

		@Test
		public void testForAbsentNode() 
		{
			//test findLCA() for a node that doesn't exist in the BT
			LCA tree = new LCA(); 
			tree.root= new Node(1); 
			tree.root.left = new Node(2); 
			tree.root.right = new Node(3); 
			tree.root.left.left = new Node(4); 
			assertEquals("LCA of a node that does not exist",tree.findLCA(8, 7),-1);
		}

		@Test
		public void testForNoRoot()
		{
			//test findLCA() for a binary tree with no root
			LCA tree = new LCA(); 
			tree.root= new Node(1); 
			tree.root.left = new Node(2); 
			tree.root.right = new Node(3); 
			tree.root.left.left = new Node(4);
			assertEquals(" a binary tree with no root.",tree.findLCA(4, 0),-1);
		}

	

	
	
	
	}
	
	
	


