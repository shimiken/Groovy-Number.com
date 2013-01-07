/**
 * ����Java256�{�m�b�N for Java 5.0
 * Java�T���v���\�[�X ver0.2C "ImageRotation"
 * ImageRotation.java �u�摜����]������v
 *
 * 2005/09/23 ����F���i�m���J�Y
 *
 * �y�R���p�C�������s���@�z
 *     >javac ImageRotation.java
 *     >java ImageRotation
 * �y�L�[���[�h�z
 *     Java2D, java.awt.geom�p�b�P�[�W, AffineTransform�N���X, ���W�A��(radian)
 * �y�����Ă݂悤�z
 *     ��]���x���グ�A�u������葽���v�񂷁B *     �摜�̒��S�Ɖ�]�̒��S�����炵�A�u�������傫���v�񂷁B *     ������}�`�ȂǁA�u�����ƈႤ���v���񂷁B
 */
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.String;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;
import static java.lang.Math.PI;

public class ImageRotation extends JFrame {
    final static int C00 = 30;

    public ImageRotation() {
        DrawPanel L00 = new DrawPanel();
        add(L00);

        new Timer(C00, L00).start();
    }

    public static void main(String[] A00) {
        Toolkit.getDefaultToolkit().setDynamicLayout(true);

        JFrame L00 = new ImageRotation();
        L00.setTitle("���߂łƂ��������܁`���I");
        L00.setDefaultCloseOperation(EXIT_ON_CLOSE);
        L00.setBackground(Color.white);
        L00.setSize(320, 240);
        L00.setVisible(true);
    }
}

class DrawPanel extends JPanel implements ActionListener {
    static final String C00 = "image/rotation.gif";
    Image I00;
    int I01;
    int I02;
    int I03 = 0;

    public DrawPanel() {
        setBackground(Color.white);

        I00 = new ImageIcon(C00).getImage();
        I01 = I00.getWidth(this);
        I02 = I00.getHeight(this);
    }

    public void actionPerformed(ActionEvent A00) {
        I03 = ++I03 % 360;
        repaint();
    }

    public void paintComponent(Graphics A00) {
        Graphics2D L00 = (Graphics2D)A00;
        L00.setColor(Color.white);
        L00.fillRect(0, 0, getWidth(), getHeight());

        L00.rotate(I03 * PI / 180, getWidth() / 2.0, getHeight() / 2.0);
        L00.drawImage(I00, (getWidth() - I01) / 2, (getHeight() - I02) / 2, this);
    }
}

/* �� �N���X�̊O�ł�����ƈꌾ ��
�摜�̉�]�Ƃ����ƁA���ƂȂ�摜����]�����āA���ꂩ��\������Ƃ����菇
���v�������ׂ����ł����A�����ł́A���W���̕�����]�����āA���񓯂��ʒu��
�摜��\��t����Ƃ�����@���Ƃ��Ă܂��B

��]�̒��S�p���p�l���̒��S�ɐݒ肵�A����ɁA�p�l���̒��S�ɉ摜��\������
�܂��̂ŁA���ʓI�ɉ摜�̒��S�ŉ�]����Ƃ����킯�ł��ˁB

����rotate���\�b�h��Graphics2D�N���X�̂��̂ł����AJ2SE1.2�ȍ~�Apaint�ɓn
�����Graphics�I�u�W�F�N�g�́AGraphics2D�̃T�u�N���X�ł��̂ŁA���̂܂�
�L���X�g���邱�Ƃɂ����Graphics2D�Ƃ��ė��p���邱�Ƃ��o���܂��B
 */
