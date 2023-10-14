package src.functions.java;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Ordena {
    
    public ArrayList<Object> bubbleSort(ArrayList<String> arrName, ArrayList<Integer> arrAge, ArrayList<String> arrCpf, ArrayList<String> arrCountry, ArrayList<byte[]> arrImageCountry, int opc){

        int n = arrAge.size();

        ArrayList<Object> auxArray = new ArrayList<Object>();

        ArrayList<Object> arr = new ArrayList<Object>();

        if(opc == 0){

            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < n - i - 1; j++) {
                    
                    if (arrName.get(j).compareToIgnoreCase(arrName.get(j + 1)) > 0) {

                        auxArray.add(arrAge.get(j));
                        arrAge.set(j, arrAge.get(j + 1));
                        arrAge.set(j + 1, (Integer) auxArray.get(0));

                        auxArray.clear();

                        auxArray.add(arrName.get(j));
                        arrName.set(j, arrName.get(j + 1));
                        arrName.set(j + 1, (String) auxArray.get(0));

                        auxArray.clear();

                        auxArray.add(arrCpf.get(j));
                        arrCpf.set(j, arrCpf.get(j + 1));
                        arrCpf.set(j + 1, (String) auxArray.get(0));

                        auxArray.clear();

                        auxArray.add(arrCountry.get(j));
                        arrCountry.set(j, arrCountry.get(j + 1));
                        arrCountry.set(j + 1, (String) auxArray.get(0));

                        auxArray.clear();

                        auxArray.add(arrImageCountry.get(j));
                        arrImageCountry.set(j, arrImageCountry.get(j + 1));
                        arrImageCountry.set(j + 1, (byte[]) auxArray.get(0));

                        auxArray.clear();

                    }
                }
            }

        } else if(opc == 1){

            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < n - i - 1; j++) {
        
                    if (arrAge.get(j) > arrAge.get(j + 1)) {

                        auxArray.add(arrAge.get(j));
                        arrAge.set(j, arrAge.get(j + 1));
                        arrAge.set(j + 1, (Integer) auxArray.get(0));

                        auxArray.clear();

                        auxArray.add(arrName.get(j));
                        arrName.set(j, arrName.get(j + 1));
                        arrName.set(j + 1, (String) auxArray.get(0));

                        auxArray.clear();

                        auxArray.add(arrCpf.get(j));
                        arrCpf.set(j, arrCpf.get(j + 1));
                        arrCpf.set(j + 1, (String) auxArray.get(0));

                        auxArray.clear();

                        auxArray.add(arrCountry.get(j));
                        arrCountry.set(j, arrCountry.get(j + 1));
                        arrCountry.set(j + 1, (String) auxArray.get(0));

                        auxArray.clear();

                        auxArray.add(arrImageCountry.get(j));
                        arrImageCountry.set(j, arrImageCountry.get(j + 1));
                        arrImageCountry.set(j + 1, (byte[]) auxArray.get(0));

                        auxArray.clear();

                    }
                }
            }
        } else if(opc == 2){
            
            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < n - i - 1; j++) {
                    
                    if (arrCpf.get(j).compareToIgnoreCase(arrCpf.get(j + 1)) > 0) {

                        auxArray.add(arrAge.get(j));
                        arrAge.set(j, arrAge.get(j + 1));
                        arrAge.set(j + 1, (Integer) auxArray.get(0));

                        auxArray.clear();

                        auxArray.add(arrName.get(j));
                        arrName.set(j, arrName.get(j + 1));
                        arrName.set(j + 1, (String) auxArray.get(0));

                        auxArray.clear();

                        auxArray.add(arrCpf.get(j));
                        arrCpf.set(j, arrCpf.get(j + 1));
                        arrCpf.set(j + 1, (String) auxArray.get(0));

                        auxArray.clear();

                        auxArray.add(arrCountry.get(j));
                        arrCountry.set(j, arrCountry.get(j + 1));
                        arrCountry.set(j + 1, (String) auxArray.get(0));

                        auxArray.clear();

                        auxArray.add(arrImageCountry.get(j));
                        arrImageCountry.set(j, arrImageCountry.get(j + 1));
                        arrImageCountry.set(j + 1, (byte[]) auxArray.get(0));

                        auxArray.clear();

                    }
                }
            }

        } else if(opc == 3){

            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < n - i - 1; j++) {
                    
                    if (arrCountry.get(j).compareToIgnoreCase(arrCountry.get(j + 1)) > 0) {

                        auxArray.add(arrAge.get(j));
                        arrAge.set(j, arrAge.get(j + 1));
                        arrAge.set(j + 1, (Integer) auxArray.get(0));

                        auxArray.clear();

                        auxArray.add(arrName.get(j));
                        arrName.set(j, arrName.get(j + 1));
                        arrName.set(j + 1, (String) auxArray.get(0));

                        auxArray.clear();

                        auxArray.add(arrCpf.get(j));
                        arrCpf.set(j, arrCpf.get(j + 1));
                        arrCpf.set(j + 1, (String) auxArray.get(0));

                        auxArray.clear();

                        auxArray.add(arrCountry.get(j));
                        arrCountry.set(j, arrCountry.get(j + 1));
                        arrCountry.set(j + 1, (String) auxArray.get(0));

                        auxArray.clear();

                        auxArray.add(arrImageCountry.get(j));
                        arrImageCountry.set(j, arrImageCountry.get(j + 1));
                        arrImageCountry.set(j + 1, (byte[]) auxArray.get(0));

                        auxArray.clear();

                    }
                }
            }

        } else if(opc == 4){

            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < n - i - 1; j++) {
                    
                    if (arrImageCountry.get(j).length > arrImageCountry.get(j + 1).length) {

                        auxArray.add(arrAge.get(j));
                        arrAge.set(j, arrAge.get(j + 1));
                        arrAge.set(j + 1, (Integer) auxArray.get(0));

                        auxArray.clear();

                        auxArray.add(arrName.get(j));
                        arrName.set(j, arrName.get(j + 1));
                        arrName.set(j + 1, (String) auxArray.get(0));

                        auxArray.clear();

                        auxArray.add(arrCpf.get(j));
                        arrCpf.set(j, arrCpf.get(j + 1));
                        arrCpf.set(j + 1, (String) auxArray.get(0));

                        auxArray.clear();

                        auxArray.add(arrCountry.get(j));
                        arrCountry.set(j, arrCountry.get(j + 1));
                        arrCountry.set(j + 1, (String) auxArray.get(0));

                        auxArray.clear();

                        auxArray.add(arrImageCountry.get(j));
                        arrImageCountry.set(j, arrImageCountry.get(j + 1));
                        arrImageCountry.set(j + 1, (byte[]) auxArray.get(0));

                        auxArray.clear();

                    }
                }
            }

        }

        arr.add(arrName);
        arr.add(arrAge);
        arr.add(arrCpf);
        arr.add(arrCountry);
        arr.add(arrImageCountry);
        
        return arr;

    }

    public ArrayList<Object> binaryTree(ArrayList<String> arrName, ArrayList<Integer> arrAge, ArrayList<String> arrCpf, ArrayList<String> arrCountry, ArrayList<byte[]> arrImageCountry, int opc){

        BinaryTreeSort bin = BinaryTreeSort.getInstance();

        bin.binaryTreeSort(arrName, arrAge, arrCpf, arrCountry, arrImageCountry, opc);

        ArrayList<Object> arr = bin.treeOrdered();

        return arr;

    }

    public void searchInTree(String search, int opc){

        BinaryTreeSort bin = BinaryTreeSort.getInstance();

        try{

            bin.search(BinaryTreeSort.nodeList.get(0), search, opc);

        }catch(NullPointerException e){
        
            JOptionPane.showMessageDialog(null, search + " não encontrado");
        
        }
        
        
    }

}


class TreeNode {

    String name;
    Integer age;
    String cpf;
    String country;
    byte[] imageCountry;
    TreeNode left;
    TreeNode right;

    public TreeNode(String name, Integer age, String cpf, String country, byte[] imageCountry) {
        this.name = name;
        this.age = age;
        this.cpf = cpf;
        this.country = country;
        this.imageCountry = imageCountry;
        this.left = null;
        this.right = null;
    }
}


class BinaryTreeSort {

    private static BinaryTreeSort instance;

    public static ArrayList<TreeNode> nodeList = new ArrayList<>();

    public void binaryTreeSort(ArrayList<String> arrName, ArrayList<Integer> arrAge, ArrayList<String> arrCpf, ArrayList<String> arrCountry, ArrayList<byte[]> arrImageCountry, int opc) {

        nodeList.clear();

        // Construa a árvore binária
        for (int i = 0; i < arrName.size(); i++) {
            TreeNode node = new TreeNode(arrName.get(i), arrAge.get(i), arrCpf.get(i), arrCountry.get(i), arrImageCountry.get(i));
            insert(nodeList, node, opc);
        }
        
    }


    public ArrayList<Object> treeOrdered(){

        ArrayList<Object> arr = new ArrayList<>();

        ArrayList<String> arrName = new ArrayList<>();
        ArrayList<Integer> arrAge = new ArrayList<>();
        ArrayList<String> arrCpf = new ArrayList<>();
        ArrayList<String> arrCountry = new ArrayList<>();
        ArrayList<byte[]> arrImageCountry = new ArrayList<>();

        // Percorra a árvore na ordem desejada para obter os elementos ordenados
        ArrayList<TreeNode> sortedList = new ArrayList<>();
        inorderTraversal(nodeList.get(0), sortedList);

        for (int i = 0; i < sortedList.size(); i++) {
            arrName.add(sortedList.get(i).name);
            arrAge.add(sortedList.get(i).age);
            arrCpf.add(sortedList.get(i).cpf);
            arrCountry.add(sortedList.get(i).country);
            arrImageCountry.add(sortedList.get(i).imageCountry);
        }

        arr.add(arrName);
        arr.add(arrAge);
        arr.add(arrCpf);
        arr.add(arrCountry);
        arr.add(arrImageCountry);

        return arr;

    }

    public static void insert(ArrayList<TreeNode> nodeList, TreeNode newNode, int opc) {
        
        if (nodeList.isEmpty()) {
            nodeList.add(newNode);
            return;
        }

        TreeNode current = nodeList.get(0);

        while (true) {

            if(opc == 0){

                if (newNode.name.compareToIgnoreCase(current.name) < 0) {
                    if (current.left == null) {
                        current.left = newNode;
                        break;
                    }
                    current = current.left;
                } else {
                    if (current.right == null) {
                        current.right = newNode;
                        break;
                    }
                    current = current.right;
                }
            } else if(opc == 1){

                if (newNode.age < current.age) {
                    if (current.left == null) {
                        current.left = newNode;
                        break;
                    }
                    current = current.left;
                } else {
                    if (current.right == null) {
                        current.right = newNode;
                        break;
                    }
                    current = current.right;
                }

            } else if(opc == 2){

                if (newNode.cpf.compareToIgnoreCase(current.cpf) < 0) {
                    if (current.left == null) {
                        current.left = newNode;
                        break;
                    }
                    current = current.left;
                } else {
                    if (current.right == null) {
                        current.right = newNode;
                        break;
                    }
                    current = current.right;
                }

            } else if(opc == 3){

                if (newNode.country.compareToIgnoreCase(current.country) < 0) {
                    if (current.left == null) {
                        current.left = newNode;
                        break;
                    }
                    current = current.left;
                } else {
                    if (current.right == null) {
                        current.right = newNode;
                        break;
                    }
                    current = current.right;
                }

            } else if(opc == 4){

                if (newNode.imageCountry.length < current.imageCountry.length) {
                    if (current.left == null) {
                        current.left = newNode;
                        break;
                    }
                    current = current.left;
                } else {
                    if (current.right == null) {
                        current.right = newNode;
                        break;
                    }
                    current = current.right;
                }

            }
            
        }
    }

    public static void inorderTraversal(TreeNode root, ArrayList<TreeNode> sortedList) {



        if (root != null) {
            inorderTraversal(root.left, sortedList);
            sortedList.add(root);
            inorderTraversal(root.right, sortedList);
        }
    }

    public TreeNode search(TreeNode root, String key, int opc) {

        if(opc == 0){

            if (root == null || root.name.equals(key)) {
                JOptionPane.showMessageDialog(null, "Encontrado: " + root.name);
                return root;
            }

            if (key.compareToIgnoreCase(root.name) < 0) {
                return search(root.left, key, 0);
            }

            return search(root.right, key, 0);

        }else if(opc == 1){

            if (root == null || root.age == Integer.parseInt(key)) {
                JOptionPane.showMessageDialog(null, "Encontrado: " + root.age);
             return root;
            }

            if (Integer.parseInt(key) < root.age) {
                return search(root.left, key, 1);
            }

            return search(root.right, key, 1);

        }else if(opc == 2){

            if (root == null || root.cpf.equals(key)) {
                JOptionPane.showMessageDialog(null, "Encontrado: " + root.cpf);
             return root;
            }

            if (key.compareToIgnoreCase(root.cpf) < 0) {
                return search(root.left, key, 2);
            }

            return search(root.right, key, 2);

        }else if(opc == 3){

            if (root == null || root.country.equals(key)) {
                JOptionPane.showMessageDialog(null, "Encontrado: " + root.country);
             return root;
            }

            if (key.compareToIgnoreCase(root.country) < 0) {
                return search(root.left, key, 3);
            }

            return search(root.right, key, 3);

        }else if(opc == 4){

            if (root == null || root.imageCountry.equals(key)) {
                JOptionPane.showMessageDialog(null, "Encontrado: " + root.imageCountry);
             return root;
            }

            if (key.compareToIgnoreCase(root.imageCountry.toString()) < 0) {
                return search(root.left, key, 4);
            }

            return search(root.right, key, 4);

        }

        return root;

        
    }

    //=> Metodo responsavel por retornar uma unica instancia da classe BinaryTreeSort
    public static BinaryTreeSort getInstance() {
        if (instance == null) {
            instance = new BinaryTreeSort();
        }
        return instance;
    }

}
