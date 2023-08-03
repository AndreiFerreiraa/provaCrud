package provacrud;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {

        List<Produto> estoque = new ArrayList<>();
        int opcao;

        do {
            String menu = "---- Menu --- \n"
                    + "1. Adicionar Produto \n"
                    + "2. Excluir Produto \n"
                    + "3. Consultar Produto\n"
                    + "4. Atualizar Produto\n"
                    + "5. Listar Estoque\n"
                    + "6. Sair\n"
                    + "Escolha uma opção: ";
            opcao = Integer.parseInt(JOptionPane.showInputDialog(null, menu));

            switch (opcao) {
                case 1:
                    adicionaProduto(estoque);
                    break;
                case 2:
                    excluiProduto();
                    break;
                case 3:
                    consultaProduto();
                    break;
                case 4:
                    atualizaProduto();
                    break;
                case 5:
                    listarEstoque();
                    break;
                case 6:
                    JOptionPane.showMessageDialog(null, "Encerrando o programa...");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida. Tente novamente.");
                    break;
            }
        } while (opcao != 6);
    }

    static void adicionaProduto(List<Produto> estoque) {
        String nome = JOptionPane.showInputDialog("Nome do Produto:");
        double valorUnitario = Double.parseDouble(JOptionPane.showInputDialog("Preço desejado:"));
        int qtdDisp = Integer.parseInt(JOptionPane.showInputDialog("Quantidade a  adicionar:"));
        int qtdRes = Integer.parseInt(JOptionPane.showInputDialog("Quantidade reserva:"));

        Produto item = new Produto(nome, valorUnitario, qtdDisp, qtdRes);
        estoque.add(item);

        JOptionPane.showMessageDialog(null, "Produto adicionado no estoque!");

    }

    static void excluiProduto() {
        String nome = JOptionPane.showInputDialog("Informe o produdo que deseja excluir:");
        Produto produtoEncontrado = buscarProdNome(nome);
        
        if(produtoEncontrado != null){
            estoque.remove(produtoEncontrado);
            JOptionPane.showMessageDialog(null, "Produto removido de estoque!");
        }
    }

    static void consultaProduto() {
    }

    static void atualizaProduto() {

    }

    static void listarEstoque() {
       
    }

}
