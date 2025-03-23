package esercizi_java.marzo_2025.mar24.binary_tree;
import esercizi_java.marzo_2025.mar24.Obj;

public class BTNode{
	protected Obj data;
	protected BTNode psx;
	protected BTNode pdx;

	public BTNode(Obj data){
		this.data = data;
		psx = null;
		pdx = null;
	}

	public BTNode getPsx(){
		return psx;
	}

	public BTNode getPdx(){
		return pdx;
	}

	public void setPsx(BTNode psx){
		this.psx = psx;
	}

	public void setPdx(BTNode pdx){
		this.pdx = pdx;
	}
}
