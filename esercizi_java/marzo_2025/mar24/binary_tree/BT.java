package esercizi_java.marzo_2025.mar24.binary_tree;
import esercizi_java.marzo_2025.mar24.Obj;

public class BT{
	protected BTNode root;

	public BT(){
		root = null;
	}

	public void addNode(Obj data){
		BTNode newNode = new BTNode(data), curNode, prevNode;
		if(root == null){
			root = newNode;
		}else{
			prevNode = root;
			if(data.getValue() < root.data.getValue()){
				curNode = prevNode.getPsx();
			}else{
				curNode = prevNode.getPdx();
			}
			while(curNode != null){
				prevNode = curNode;
				if(data.getValue() < curNode.data.getValue()){
					curNode = curNode.getPsx();
				}else{
					curNode = curNode.getPdx();
				}
			}
			// System.out.println("newNode Value: " + data.getValue());
			if(data.getValue() < prevNode.data.getValue()){
				prevNode.setPsx(newNode);
				// System.out.println("prevNode Value: " + prevNode.data.getValue() + "\nLoc. Sinistra.");
			}else{
				prevNode.setPdx(newNode);
				// System.out.println("prevNode Value: " + prevNode.data.getValue() + "\nLoc. Destra.");
			}

		}
	}

	public void visitaAnticipata(BTNode root){
		if(root == null){
			return;
		}
		root.data.printObj();
		if(root.getPsx() != null){
			visitaAnticipata(root.getPsx());
		}
		if(root.getPdx() != null){
			visitaAnticipata(root.getPdx());
		}
	}

	// Senza dover specificare la root.
	public void visitaAnticipata(){
		visitaAnticipata(root);
	}

	public boolean findNode(BTNode root, Obj data){
		if(root == null){
			return false;
		}
		if(root.data.getValue() == data.getValue()){
			return true;
		}
		if(root.data.getValue() < data.getValue()){
			return findNode(root.getPdx(), data);
		}
		if(root.data.getValue() > data.getValue()){
			return findNode(root.getPsx(), data);
		}
		return false;
	}
}
