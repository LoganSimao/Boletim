import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class boletimGui {

    public boletimGui() {
        // adição do wing para uso
        JFrame frame = new JFrame();
        JPanel painel = new JPanel();

        //config frame
        frame.setTitle("Notas");
        frame.setSize(400,500);
        frame.setResizable(false);
        frame.add(painel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //config painel
        painel.setLayout(null);

        //configlabel boletim de notas
        JLabel label = new JLabel("Boletim de notas!");
        label.setBounds(150,20,100,25);
        painel.add(label);

        //configlabel Nome
        JLabel labelname = new JLabel("Nome: ");
        labelname.setBounds( 40, 60, 100, 25);
        painel.add(labelname);

        //config textfield do nome
        JTextField textname = new JTextField();
        textname.setBounds(100, 60,200,25);
        painel.add(textname);

        //config label da nota1
        JLabel labelnota1 = new JLabel("1ªNota: ");
        labelnota1.setBounds(40, 120, 100, 25);
        painel.add(labelnota1);

        //config texfield da nota1
        JTextField textnota1 = new JTextField();
        textnota1.setBounds( 100, 120, 200, 25);
        painel.add(textnota1);

        //config label da nota2
        JLabel labelnota2 = new JLabel("2ªNota: ");
        labelnota2.setBounds(40, 180, 100, 25);
        painel.add(labelnota2);

        //config texfield da nota2
        JTextField textnota2 = new JTextField();
        textnota2.setBounds( 100, 180, 200, 25);
        painel.add(textnota2);

        //config label da nota3
        JLabel labelnota3 = new JLabel("3ªNota: ");
        labelnota3.setBounds(40, 240, 100, 25);
        painel.add(labelnota3);

        //config texfield da nota3
        JTextField textnota3 = new JTextField();
        textnota3.setBounds( 100, 240, 200, 25);
        painel.add(textnota3);

        //config botao de calc
        JButton botao = new JButton();
        botao.setText("Calcular");
        botao.setBounds(120, 300, 150, 30);
        painel.add(botao);

        //config label média
        JLabel media = new JLabel("Resultado: ");
        media.setBounds(40, 360,400, 20);
        painel.add(media);
        //função do botão
        botao.addActionListener(new ActionListener() {
            // @Override
            public void actionPerformed (ActionEvent e){
                int n1, n2, n3, total;
                String aluno, resultado;
                //receber input
                aluno = textname.getText();
                n1 = (int) (Double.parseDouble(textnota1.getText()));
                n2 = (int) (Double.parseDouble(textnota2.getText()));
                n3 = (int) (Double.parseDouble(textnota3.getText()));
                total = n1 + n2 + n3;
                total /= 3;
                resultado = String.format("Resultado: Aluno %s, Média %d", aluno, total);//
                media.setText(resultado);
            }

        });
        frame.setVisible(true);//final
    }


}


