package algortimoID3;

import Constantes.Constantes;
import arbolStackOverflow.TreeNode;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode<String> root = new TreeNode<String>("raiz");
		{
		    TreeNode<String> node0 = root.addChild("node0");
		    TreeNode<String> node1 = root.addChild("node1");
		    TreeNode<String> node2 = root.addChild("node2");
		    {
		        TreeNode<String> node20 = node2.addChild(null);
		        TreeNode<String> node21 = node2.addChild("node21");
		        {
		            TreeNode<String> node210 = node20.addChild("node210");
		        }
		    }
		}

	}

}
