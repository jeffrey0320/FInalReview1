public class BinarySearchTree {
    BSTNode root;

    public BinarySearchTree (){
        root = null;
    }

    public void search(int target){
        search(root, target);
    }

    public BSTNode search(BSTNode root, int target){
        if(root==null)
            return null;
        if(root.key==target)
            return root;
        if(target<root.key)
            return search(root.left, target);
        else
            return search(root.right, target);
    }

    public void add(int key){
        root = add(root, key);
    }

    public BSTNode add(BSTNode root, int elem){
        if(root==null){
            root = new BSTNode();
            root.key = elem;
            root.left = null;
            root.right = null;
        }else if(elem<root.key){
            root.left = add(root.left, elem);
        }else {
            root.right = add(root.right, elem);
        }
        return root;
    }

    public void inOrder(){
        inOrder(root);
    }

    public void inOrder(BSTNode root){
        if(root==null)
            return;

        inOrder(root.left);
        System.out.println(root.key);
        inOrder(root.right);
    }

    public void preOrder(){
        preOrder(root);
    }

    public void preOrder(BSTNode root){
        if(root==null)
            return;

        System.out.println(root.key);
        preOrder(root.left);
        preOrder(root.right);
    }

    public void postOrder(){
        postOrder(root);
    }

    public void postOrder(BSTNode root){
        if(root==null)
            return;

        postOrder(root.left);
        postOrder(root.right);
        System.out.println(root.key);
    }
}
