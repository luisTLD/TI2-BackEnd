package exercicio02.demo;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        DAO dao = new DAO();
        dao.conectar();

        Scanner scanner = new Scanner(System.in);

        int opcao;
        do {
            System.out.println("\nMenu de Opções:");
            System.out.println("1 - Listar usuários");
            System.out.println("2 - Inserir usuário");
            System.out.println("3 - Excluir usuário");
            System.out.println("4 - Atualizar usuário");
            System.out.println("5 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    listarUsuarios(dao);
                    break;
                case 2:
                    inserirUsuario(dao, scanner);
                    break;
                case 3:
                    excluirUsuario(dao, scanner);
                    break;
                case 4:
                    atualizarUsuario(dao, scanner);
                    break;
                case 5:
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

        } while (opcao != 5);

        dao.close();
        scanner.close();
    }

    private static void listarUsuarios(DAO dao) {
        System.out.println("==== Mostrar todos os usuários === ");
        Usuario[] usuarios = dao.getUsuarios();
        for (int i = 0; i < usuarios.length; i++) {
            System.out.println(usuarios[i].toString());
        }
    }

    private static void inserirUsuario(DAO dao, Scanner scanner) {
        System.out.print("Digite o código do usuário: ");
        int codigo = scanner.nextInt();
        System.out.print("Digite o login do usuário: ");
        String login = scanner.next();
        System.out.print("Digite a senha do usuário: ");
        String senha = scanner.next();
        System.out.print("Digite o sexo do usuário (M/F): ");
        char sexo = scanner.next().charAt(0);

        Usuario usuario = new Usuario(codigo, login, senha, sexo);

        if (dao.inserirUsuario(usuario)) {
            System.out.println("Inserção com sucesso -> " + usuario.toString());
        } else {
            System.out.println("Erro ao inserir usuário.");
        }
    }

    private static void excluirUsuario(DAO dao, Scanner scanner) {
        System.out.print("Digite o código do usuário a ser excluído: ");
        int codigoExcluir = scanner.nextInt();

        if (dao.excluirUsuario(codigoExcluir)) {
            System.out.println("Usuário excluído com sucesso.");
        } else {
            System.out.println("Erro ao excluir usuário. Verifique o código.");
        }
    }

    private static void atualizarUsuario(DAO dao, Scanner scanner) {
        System.out.print("Digite o código do usuário a ser atualizado: ");
        int codigoAtualizar = scanner.nextInt();

        Usuario usuario = dao.getUsuarioPorCodigo(codigoAtualizar);

        if (usuario != null) {
            System.out.println("Usuário encontrado: " + usuario.toString());

            System.out.print("Digite o novo login do usuário: ");
            String novoLogin = scanner.next();
            System.out.print("Digite a nova senha do usuário: ");
            String novaSenha = scanner.next();
            System.out.print("Digite o novo sexo do usuário (M/F): ");
            char novoSexo = scanner.next().charAt(0);

            usuario.setLogin(novoLogin);
            usuario.setSenha(novaSenha);
            usuario.setSexo(novoSexo);

            if (dao.atualizarUsuario(usuario)) {
                System.out.println("Usuário atualizado com sucesso.");
            } else {
                System.out.println("Erro ao atualizar usuário.");
            }
        } else {
            System.out.println("Usuário não encontrado. Verifique o código.");
        }
    }
}
