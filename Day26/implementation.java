package Day26;

public class implementation {
    public static void main(String[] args) {
        BinaryTrees bt = new BinaryTrees();
        // bt.Display();
        // System.out.println(bt.findMax(bt.root));
        // System.out.println(bt.height(bt.root));

        bt.prefix(bt.root);
        System.out.println();

        bt.infix(bt.root);
        System.out.println();

        bt.postfix(bt.root);
        System.out.println();

    }


    
    
}
