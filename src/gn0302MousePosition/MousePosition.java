/**
 * ����Java256�{�m�b�N for Java 5.0
 * Java�T���v���\�[�X ver0.2C "MousePosition"
 * MousePosition.java �u�}�E�X�C�x���g�ŃJ�[�\���̍��W���擾�v
 *
 * 2005/09/23 ����F���i�m���J�Y
 *
 * �y�R���p�C�������s���@�z
 *     >javac MousePosition.java
 *     >java MousePosition
 * �y�L�[���[�h�z
 *     �C���^�[�t�F�[�X(interface), implements(����),  *     MouseListener, MouseMotionListener *     
 * �y�����Ă݂悤�z
 *     �}�E�X�h���b�O���͕����̐F��ς��č��W��\������B *     �}�E�X�J�[�\�����[�����ɍs���Ă���������ʂ���͂ݏo���Ȃ��悤�ɂ���B *     MouseMotionAdapter�ŃC�x���g����������B *      *     
 */
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.Toolkit;
import java.lang.String;
import java.lang.System;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MousePosition extends JFrame {

    public MousePosition() {
        add(new DrawPanel());
    }

    public static void main(String[] A00) {
        Toolkit.getDefaultToolkit().setDynamicLayout(true);

        JFrame L00 = new MousePosition();
        L00.setTitle("�}�E�X�̍��W��\��");
        L00.setDefaultCloseOperation(EXIT_ON_CLOSE);
        L00.setBackground(Color.white);
        L00.setSize(320, 240);
        L00.setVisible(true);
    }
}

class DrawPanel extends JPanel implements MouseMotionListener {
    int I00;
    int I01;

    public DrawPanel() {
        setBackground(Color.white);
        addMouseMotionListener(this);
    }

    public void paintComponent(Graphics A00) {
        super.paintComponent(A00);
        String L00 = String.format("(%d, %d)", I00, I01);
        A00.drawString(L00, I00, I01);
    }

    public void mouseMoved(MouseEvent A00) {
        I00 = A00.getX();
        I01 = A00.getY();
        repaint();
    }

    public void mouseDragged(MouseEvent A00) {}
}

/* �� �N���X�̊O�ł�����ƈꌾ ��
�}�E�X�C�x���g�̃��X�i�[�ɂ́AMouseListener��MouseMotionListener�������
���BMouseListener�̓}�E�X�̃{�^������A�R���|�[�l���g�ւ̏o����ɑΉ�
���AMouseMotionListener�̓J�[�\���̈ړ��A�h���b�O�̒ǐՂɑΉ����܂��B

���̃v���O�����̃|�C���g��repaint()�ł��ˁB�}�E�X�J�[�\���̈ړ������m��
����A�N���X�ϐ��ɂ��̍��W�������A�������g�̍ĕ`��v�����o���Ă܂��B��
������ƁA���paintComponent���Ă΂�A�J�[�\���̈ʒu�ɕ������`�悳���d
�g�݂ł��B

�}�E�X���[�V�����͒Z���Ԃɔ��ɂ������񔭐�����̃C�x���g�ł��̂ŁA
mouseMoved���\�b�h�AmouseDragged���\�b�h�ɏd���������L�q���邱�Ƃ͔�����
�ׂ��ł��傤�B
 */
