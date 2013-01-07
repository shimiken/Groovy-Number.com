/**
 * ����Java256�{�m�b�N for Java 5.0
 * Java�T���v���\�[�X ver0.2C "ButtonEvent"
 * ButtonEvent.java �u�{�^���C�x���g��JTextArea�ɕ�����ǉ��v
 *
 * 2005/09/23 ����F���i�m���J�Y
 *
 * �y�R���p�C�������s���@�z
 *     >javac ButtonEvent.java
 *     >java ButtonEvent
 * �y�L�[���[�h�z
 *     �C�x���g�쓮(event driven)�v���O����, Delegation(�㗝�l)�C�x���g���f��, *     �C���^�[�t�F�[�X(interface), implements(����), �L�[���[�hthis
 * �y�����Ă݂悤�z
 *     actionPerformed���킴�ƕʂ̖��O�ɕς��A�ǂ�ȃR���p�C���G���[���o�邩�m���߂�B *     JButton��getActionCommand���\�b�h���g���āA��̃{�^������ʂ��Ă݂�B
 */
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.String;
import java.lang.System;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class ButtonEvent extends JFrame implements ActionListener {
    JTextArea I00;
    JButton I01;
    JButton I02;
    int I03 = 0;

    public ButtonEvent() {
        I00 = new JTextArea();
        JScrollPane L00 = new JScrollPane(I00, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
                                JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        add(L00, BorderLayout.CENTER);

        JPanel L01 = new JPanel(new FlowLayout(FlowLayout.CENTER));
        I01 = new JButton("�m�b�N");
        I02 = new JButton("�N���A");
        L01.add(I01);
        L01.add(I02);
        add(L01, BorderLayout.SOUTH);

        I01.addActionListener(this);
        I02.addActionListener(this);
    }

    static public void main(String[] A00) {
        Toolkit.getDefaultToolkit().setDynamicLayout(true);

        JFrame L00 = new ButtonEvent();
        L00.setTitle("�{�^���������Ă����܂�");
        L00.setDefaultCloseOperation(EXIT_ON_CLOSE);
        L00.setBackground(Color.white);
        L00.setSize(320, 240);
        L00.setVisible(true);
    }

    public void actionPerformed(ActionEvent A00) {
        if (I01 == A00.getSource()) {
            String L00 = String.format("���̃m�b�N%d�{�ڂ��`�I%n", ++I03);
            I00.append(L00);
            I00.setCaretPosition(I00.getText().length());
        } else if (I02 == A00.getSource()){
            I00.setText("�����ǁ[��I�@�ŏ������炾�I�I\n");
            I03 = 0;
        }
    }
}

/* �� �N���X�̊O�ł�����ƈꌾ ��
Java�̃C�x���g�����ɂ͂������̎�@������܂����A�܂��͂��́A�`Listener
��implements�����������o����Ƃ����ł��傤�BJava�̃C�x���g���f����
������ɂ́A�ȉ��̂R�̃|�C���g���������邱�Ƃ��d�v�ł��B

���̂P�D�{�^���������ꂽ�ꍇ�́Ajava.awt.event.ActionEvent����������
���̂Q�DActionEvent�͂��炩���߁u�o�^���ꂽ�l�v�ɒʒm�����
���̂R�DActionEvent���ʒm�����ƁAactionPerformed���\�b�h���Ă΂��

���̂����v���O���}�[���L�q����̂́A���̂Q�Ƃ��̂R�ŁA�T���v���ł�
addActionListener(this)�ŁA���ꂼ��̃{�^���̃C�x���g�̒ʒm��ɁA������
�g�ւ̎Q��=this��o�^���Ă��܂��B���ꂪ�A���ł��o�^�ł�����Ă킯�����
���āA�C���^�[�t�F�[�XActionListener������(implements)�������̂������o�^
�ł���d�g�݂ɂȂ��Ă܂��B

actionPerformed���\�b�h�ɂ́A�{�^���������ꂽ�Ƃ��̏������L�q���܂��B��
�̃T���v���ł́A�ǂ����̃{�^����������Ă��������\�b�h���Ă΂��̂ŁA��
����̃{�^���������������C�x���g���𔻕ʂ��鏈�������Ă܂��B�u�����Ă�
�悤�v�ɂ������Ă܂����AgetActionCommand�ŁA�{�^���̃��x���̕�������擾
���Ĕ��肷����@������܂��̂ŁA���ׂĂ݂Ă��������B
 */
