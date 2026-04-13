// Generic Node
/*class Node<T> {
    T data;
    Node<T> left;
    Node<T> right;

    Node(T data) {
        this.data = data;
    }
}
Node<String> node = new Node<>("amit");
*/

// Step - 1 Create a Node

import java.util.Scanner;

// Coding Standards
/*
1. Class Name PascalCase e.g TreeNode
2. Method Name/ Variable Name camelCase e.g buildTree
3. method name / variable name must be close to  meaning ful english
e.g buildTree, left, right, data
4. DRY Principle
5. SRP Principle
*/
class TreeNode {
    int data; // default value 0
    TreeNode left; // default value null
    TreeNode right;// default value null

    TreeNode(int data) {
        this.data = data;
    }
}

class TreeExample {
    static Scanner scanner = new Scanner(System.in);

    static TreeNode buildTree() {
        System.out.println("Enter the Data of Node");
        int data = scanner.nextInt();
        if (data == -1) {
            return null;
        }
        TreeNode node = new TreeNode(data);
        System.out.println(data + ": Create Left Node");
        node.left = buildTree();
        System.out.println(data + ": Create Right Node");
        node.right = buildTree();
        return node;
    }

    // Preorder - DLR
    static void print(TreeNode root) {
        if (root == null) {
            return;
        }
        System.out.println(root.data);
        print(root.left);
        print(root.right);
    }

    // Inorder - LDR
    static void printInOrder(TreeNode root) {
        if (root == null) {
            return;
        }

        print(root.left);
        System.out.println(root.data);
        print(root.right);
    }

    // PostOrder - LRD
    static void printPostOrder(TreeNode root) {
        if (root == null) {
            return;
        }

        print(root.left);

        print(root.right);
        System.out.println(root.data);
    }

    public static void main(String args[]) {
        TreeNode root = buildTree();
        print(root);
        scanner.close();
    }
}