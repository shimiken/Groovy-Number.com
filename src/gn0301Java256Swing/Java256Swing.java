/**
 * ����Java256�{�m�b�N for Java 5.0
 * Java�T���v���\�[�X ver0.2C "Java256Swing"
 * Java256Swing.java �uJPanel�ɐF���w�肵�ĕ�����`�悷��v
 *
 * 2005/09/23 ����F���i�m���J�Y
 *
 * �y�R���p�C�������s���@�z
 *     >javac Java256Swing.java
 *     >java Java256Swing
 * �y�L�[���[�h�z
 *     �R���e���c���(content pane), Look & Feel, �I�[�o�[���C�h(override:�㏑��) *     �R���|�[�l���g(component:���i), �R���e�i(container:���ꕨ)
 * �y�����Ă݂悤�z
 *     setDynamicLayout���R�����g�A�E�g���A�ǂ��������ω����邩���ׂ�B *     �i���ɁA�E�B���h�E�̃T�C�Y��ύX�����Ƃ��ɒ��Ӂj *     ���������ł͂Ȃ��A�}�`���`�悷��B *     JPanel�ł͂Ȃ��AJLabel���g���ĐԂ�������\������B
 */
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.lang.String;
import java.lang.System;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Java256Swing extends JFrame {
    public Java256Swing() {
        add(new DrawPanel());
    }

    static public void main(String[] A00) {
        Toolkit.getDefaultToolkit().setDynamicLayout(true);

        JFrame L00 = new Java256Swing();
        L00.setTitle("������\��");
        L00.setDefaultCloseOperation(EXIT_ON_CLOSE);
        L00.setBackground(Color.white);
        L00.setSize(300, 100);
        L00.setVisible(true);
    }
}

class DrawPanel extends JPanel {
    public DrawPanel() {
        setBackground(Color.white);
    }

    public void paintComponent(Graphics A00) {
        super.paintComponent(A00);
        A00.setColor(Color.red);
        A00.drawString("�R����j�̐Ԃ�Java256�A���ꂪ���O�����B", 10, 30);
    }
}

/* �� �N���X�̊O�ł�����ƈꌾ ��
Swing�v���O���~���O�ł́AJFrame�i������E�B���h�E�j�Ȃǂ̓y��ƂȂ��
�ꕨ(�R���e�i)�ɁA�l�X�ȕ��i(�R���|�[�l���g)��ǉ����Ă������ƂŁA�@�\��
�g�ݍ���ł����܂��B

���̃T���v���ł́A�F���̕�����\������̂ɁAJPanel���g�����A�����\���@
�\����������DrawPanel�N���X�����A�����ŁA�`�惁�\�b�h�ł���
paintComponent���㏑��(�I�[�o�[���C�h)���邱�ƂŁA������\�����鏈������
�����܂����B

���̃v���O���������܂ŁASwing�ɑ΂��āA�u���g��\�����Ȃ���A�E�B���h
�E�̃T�C�Y���ς����Ȃ��̂���A���̃^�R�I�v�Ƃ��A�u���������w�i��h���
��������x���񂾂�A�����C�����o�J���I�v�Ƃ��A����΂���������Ă���ł�
��B�ł����́A�l������̕��@��m��Ȃ������̂��Ƃł����BSwing����S����
�Ȃ����B
 */
