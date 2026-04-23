package br.com.hospital.menu;

import java.awt.*;
import javax.swing.*;

public class Menu {

    private static final String TITULO = "SISTEMA DE GESTAO HOSPITALAR - Sist.NF";

    // ─────────────────────────────────────────────
    //  DETECCAO DE TELA E ESCALA
    // ─────────────────────────────────────────────
    private static final float ESCALA;
    private static final int FONTE_NORMAL;
    private static final int FONTE_TITULO;
    private static final int PADDING;
    private static final int LARGURA_DIALOGO;
    private static final int ALTURA_DIALOGO;

    static {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension tela   = toolkit.getScreenSize();
        int dpi          = toolkit.getScreenResolution();

        // Fator baseado no DPI do sistema (96 = padrao, 192 = HiDPI/Retina)
        float escalaDpi  = dpi / 96f;
        // Fator baseado na resolucao vertical (1080 = referencia)
        float escalaRes  = tela.height / 1080f;
        // Usa o maior para garantir legibilidade em qualquer monitor
        ESCALA           = Math.max(escalaDpi, escalaRes);

        FONTE_NORMAL     = Math.round(13 * ESCALA);
        FONTE_TITULO     = Math.round(15 * ESCALA);
        PADDING          = Math.round(12 * ESCALA);
        // Dialogo ocupa 40% da largura e 50% da altura da tela
        LARGURA_DIALOGO  = (int) (tela.width  * 0.40);
        ALTURA_DIALOGO   = (int) (tela.height * 0.50);

        configurarUI();
    }

    private static void configurarUI() {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception ignored) {}

        Font fonteGeral  = new Font("Monospaced", Font.PLAIN, FONTE_NORMAL);
        Font fonteBotao  = new Font("Monospaced", Font.BOLD,  FONTE_NORMAL);

        // Aplica as fontes globalmente em todos os componentes do JOptionPane
        UIManager.put("OptionPane.messageFont",   fonteGeral);
        UIManager.put("OptionPane.buttonFont",     fonteBotao);
        UIManager.put("Button.font",               fonteBotao);
        UIManager.put("Label.font",                fonteGeral);
        UIManager.put("TextField.font",            fonteGeral);
        UIManager.put("TextArea.font",             fonteGeral);
        UIManager.put("ComboBox.font",             fonteGeral);
        UIManager.put("OptionPane.minimumSize",    new Dimension(LARGURA_DIALOGO, 0));
    }

    // ─────────────────────────────────────────────
    //  HELPER: painel de mensagem responsivo
    // ─────────────────────────────────────────────
    private JPanel criarPainel(String mensagem) {
        JTextArea texto = new JTextArea(mensagem);
        texto.setFont(new Font("Monospaced", Font.PLAIN, FONTE_NORMAL));
        texto.setEditable(false);
        texto.setOpaque(false);
        texto.setLineWrap(false);
        texto.setBorder(BorderFactory.createEmptyBorder(PADDING, PADDING, PADDING, PADDING));

        JPanel painel = new JPanel(new BorderLayout());
        painel.setPreferredSize(new Dimension(LARGURA_DIALOGO, ALTURA_DIALOGO / 3));
        painel.add(texto, BorderLayout.CENTER);
        return painel;
    }

    // ─────────────────────────────────────────────
    //  HELPER: botoes com fonte e tamanho escalados
    // ─────────────────────────────────────────────
    private JButton[] criarBotoes(String... rotulos) {
        JButton[] botoes = new JButton[rotulos.length];
        Font fonteBotao  = new Font("Monospaced", Font.BOLD, FONTE_NORMAL);
        int alturaBotao  = Math.round(32 * ESCALA);
        int larguraBotao = Math.round(220 * ESCALA);

        for (int i = 0; i < rotulos.length; i++) {
            JButton b = new JButton(rotulos[i]);
            b.setFont(fonteBotao);
            b.setPreferredSize(new Dimension(larguraBotao, alturaBotao));
            botoes[i] = b;
        }
        return botoes;
    }

    // ─────────────────────────────────────────────
    //  HELPER: exibe dialogo com botoes escalados
    // ─────────────────────────────────────────────
    private int mostrarOpcoes(String mensagem, String subtitulo, String... rotulos) {
        return JOptionPane.showOptionDialog(
            null,
            criarPainel(mensagem),
            subtitulo,
            JOptionPane.DEFAULT_OPTION,
            JOptionPane.PLAIN_MESSAGE,
            null,
            criarBotoes(rotulos),
            criarBotoes(rotulos)[0]
        );
    }

    // ─────────────────────────────────────────────
    //  MENU PRINCIPAL
    // ─────────────────────────────────────────────
    public void exibirMenuPrincipal() {
        boolean executando = true;

        while (executando) {
            String[] opcoes = {
                "[ 1 ]  INICIAR SISTEMA",
                "[ 2 ]  CONFIGURACOES DE BANCO DE DADOS",
                "[ 3 ]  SOBRE O SOFTWARE",
                "[ 4 ]  SAIR (EXIT)"
            };

            int escolha = JOptionPane.showOptionDialog(
                null,
                "Desenvolvido por: >>> G R U P O   5 <<<",
                TITULO,
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.PLAIN_MESSAGE,
                null,
                opcoes,
                opcoes[0]
            );

            switch (escolha) {
                case 0 -> menuSistema();
                case 1 -> menuConfiguracoes();
                case 2 -> menuSobre();
                case 3, JOptionPane.CLOSED_OPTION -> {
                    int confirmar = JOptionPane.showConfirmDialog(
                        null,
                        "Deseja realmente sair do sistema?",
                        TITULO,
                        JOptionPane.YES_NO_OPTION,
                        JOptionPane.QUESTION_MESSAGE
                    );
                    if (confirmar == JOptionPane.YES_OPTION) {
                        JOptionPane.showMessageDialog(null, "Sistema encerrado.\nAte logo!", TITULO, JOptionPane.INFORMATION_MESSAGE);
                        executando = false;
                    }
                }
                default -> executando = false;
            }
        }
    }

    // ─────────────────────────────────────────────
    //  MENU SISTEMA (submenus das entidades)
    // ─────────────────────────────────────────────
    private void menuSistema() {
        boolean voltar = false;

        while (!voltar) {
            String[] opcoes = {
                "[ 1 ]  PACIENTES",
                "[ 2 ]  MEDICOS",
                "[ 3 ]  ATENDIMENTOS",
                "[ 4 ]  INTERNACOES",
                "[ 5 ]  LEITOS",
                "[ 6 ]  EXAMES E LAUDOS",
                "[ 7 ]  RECEITAS MEDICAS",
                "[ 8 ]  MEDICAMENTOS",
                "[ 9 ]  SETORES",
                "[ 10 ] FATURAMENTO / NOTAS FISCAIS",
                "[ 0 ]  VOLTAR"
            };

            int escolha = JOptionPane.showOptionDialog(
                null,
                "Selecione um modulo:",
                TITULO + " | SISTEMA",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.PLAIN_MESSAGE,
                null,
                opcoes,
                opcoes[0]
            );

            switch (escolha) {
                case 0  -> menuCrud("PACIENTES");
                case 1  -> menuCrud("MEDICOS");
                case 2  -> menuCrud("ATENDIMENTOS");
                case 3  -> menuCrud("INTERNACOES");
                case 4  -> menuCrud("LEITOS");
                case 5  -> menuCrud("EXAMES E LAUDOS");
                case 6  -> menuCrud("RECEITAS MEDICAS");
                case 7  -> menuCrud("MEDICAMENTOS");
                case 8  -> menuCrud("SETORES");
                case 9  -> menuCrud("FATURAMENTO / NOTAS FISCAIS");
                case 10, JOptionPane.CLOSED_OPTION -> voltar = true;
                default -> voltar = true;
            }
        }
    }

    // ─────────────────────────────────────────────
    //  MENU CRUD GENERICO
    // ─────────────────────────────────────────────
    private void menuCrud(String modulo) {
        boolean voltar = false;

        while (!voltar) {
            String[] opcoes = {
                "[ 1 ]  CADASTRAR",
                "[ 2 ]  LISTAR TODOS",
                "[ 3 ]  BUSCAR POR ID",
                "[ 4 ]  ATUALIZAR",
                "[ 5 ]  EXCLUIR",
                "[ 0 ]  VOLTAR"
            };

            int escolha = JOptionPane.showOptionDialog(
                null,
                "Modulo: " + modulo + "\nEscolha uma operacao:",
                TITULO + " | " + modulo,
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.PLAIN_MESSAGE,
                null,
                opcoes,
                opcoes[0]
            );

            switch (escolha) {
                case 0 -> JOptionPane.showMessageDialog(null, "Funcao CADASTRAR de " + modulo + " em desenvolvimento.", TITULO, JOptionPane.INFORMATION_MESSAGE);
                case 1 -> JOptionPane.showMessageDialog(null, "Funcao LISTAR de " + modulo + " em desenvolvimento.", TITULO, JOptionPane.INFORMATION_MESSAGE);
                case 2 -> JOptionPane.showMessageDialog(null, "Funcao BUSCAR de " + modulo + " em desenvolvimento.", TITULO, JOptionPane.INFORMATION_MESSAGE);
                case 3 -> JOptionPane.showMessageDialog(null, "Funcao ATUALIZAR de " + modulo + " em desenvolvimento.", TITULO, JOptionPane.INFORMATION_MESSAGE);
                case 4 -> JOptionPane.showMessageDialog(null, "Funcao EXCLUIR de " + modulo + " em desenvolvimento.", TITULO, JOptionPane.INFORMATION_MESSAGE);
                case 5, JOptionPane.CLOSED_OPTION -> voltar = true;
                default -> voltar = true;
            }
        }
    }

    // ─────────────────────────────────────────────
    //  CONFIGURACOES DE BANCO DE DADOS
    // ─────────────────────────────────────────────
    private void menuConfiguracoes() {
        String[] opcoes = {
            "[ 1 ]  TESTAR CONEXAO",
            "[ 0 ]  VOLTAR"
        };

        int escolha = JOptionPane.showOptionDialog(
            null,
            "Configuracoes de conexao com o banco de dados:",
            TITULO + " | CONFIGURACOES",
            JOptionPane.DEFAULT_OPTION,
            JOptionPane.PLAIN_MESSAGE,
            null,
            opcoes,
            opcoes[0]
        );

        if (escolha == 0) {
            try {
                br.com.hospital.conexao.ConnectionFactory cf = new br.com.hospital.conexao.ConnectionFactory();
                java.sql.Connection conn = cf.getConnection();
                if (conn != null && !conn.isClosed()) {
                    JOptionPane.showMessageDialog(null, "Conexao com o banco de dados estabelecida com sucesso!", TITULO, JOptionPane.INFORMATION_MESSAGE);
                    conn.close();
                } else {
                    JOptionPane.showMessageDialog(null, "Nao foi possivel conectar ao banco de dados.", TITULO, JOptionPane.ERROR_MESSAGE);
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro ao conectar:\n" + e.getMessage(), TITULO, JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    // ─────────────────────────────────────────────
    //  SOBRE O SOFTWARE
    // ─────────────────────────────────────────────
    private void menuSobre() {
        String info =
            "╔══════════════════════════════════════════╗\n" +
            "║   SISTEMA DE GESTAO HOSPITALAR - Sist.NF ║\n" +
            "╠══════════════════════════════════════════╣\n" +
            "║  Versao: 1.0.0                           ║\n" +
            "║  Desenvolvido por: G R U P O   5         ║\n" +
            "║  Disciplina: Programacao Orientada a     ║\n" +
            "║              Objetos - SERRATEC          ║\n" +
            "║  Linguagem: Java                         ║\n" +
            "║  Banco de dados: PostgreSQL              ║\n" +
            "╚══════════════════════════════════════════╝";

        JOptionPane.showMessageDialog(null, info, TITULO + " | SOBRE", JOptionPane.INFORMATION_MESSAGE);
    }
}
