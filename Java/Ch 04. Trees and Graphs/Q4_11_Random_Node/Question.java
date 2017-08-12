package Q4_11_Random_Node;

/**
 * Random Node: You are implementing a binary tree class from scratch which, in addition to inser, find, and delete,
 * has a method getRandomNode() which returns a random node from the tree. All nodes should be equally likely to ben chosen.
 * Design and implement an algorithm for getRanfomNode, and explain how you would implment the rest of the methods.
 * Hints: 42, 54, 62, 75, 89, 99, 112, 119
 */
public class Question {

	public static void main(String[] args) {
		int[] counts = new int[10];
		for (int i = 0; i < 1000000; i++) {
			Tree tree = new Tree();
			int[] array = {1, 0, 6, 2, 3, 9, 4, 5, 8, 7};
			for (int x : array) {
				tree.insertInOrder(x);
			}
			int d = tree.getRandomNode().data;
			counts[d]++;
		}
		
		for (int i = 0; i < counts.length; i++) {
			System.out.println(i + ": " + counts[i]);
		}
	}

}
