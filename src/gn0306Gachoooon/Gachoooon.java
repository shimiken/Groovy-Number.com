/**
 * ����Java256�{�m�b�N for Java 5.0
 * Java�T���v���\�[�X ver0.2C "Gachoooon"
 * Gachoooon.java �uJScrollBar�ŉ摜���g��k���v
 *
 * 2005/09/23 ����F���i�m���J�Y
 *
 * �y�R���p�C�������s���@�z
 *     >javac Gachoooon.java
 *     >java Gachoooon
 * �y�L�[���[�h�z
 *     �ő�l(maximum), �ŏ��l(minimum), ���ݒl(current value), �͈�(extent),  *     ����(orientation), ����(vertical), ����(horizontal), �J�[
 * �y�����Ă݂悤�z
 *     ���X�N���[���o�[�Łu�K�`���[���v�B *     JScrollBar�̍ő�l�A�ŏ��l�A�c�}�~�̒�����ς��Ă݂�B
 */
package gn0306Gachoooon;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import java.lang.String;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollBar;

public class Gachoooon extends JFrame implements AdjustmentListener {
    DrawPanel I00;

    public Gachoooon() {
        JScrollBar L00 = new JScrollBar(JScrollBar.VERTICAL);
        L00.addAdjustmentListener(this);
        add(L00, BorderLayout.EAST);

        I00 = new DrawPanel(L00.getMaximum() - L00.getVisibleAmount());
        add(I00, BorderLayout.CENTER);
    }
    
    public void adjustmentValueChanged(AdjustmentEvent A00) {
        I00.M00(A00.getValue());
        I00.repaint();
    }

    public static void main(String[] A00) {
        Toolkit.getDefaultToolkit().setDynamicLayout(true);

        Gachoooon L00 = new Gachoooon();
        L00.setTitle("�J�[�ɂȂ�������ŁI");
        L00.setDefaultCloseOperation(EXIT_ON_CLOSE);
        L00.setBackground(Color.white);
        L00.pack();
        L00.setVisible(true);
    }
}

class DrawPanel extends JPanel {
    static final String C00 = "image/gachoooon.gif";
    private Image I00;
    private int I01;    // ��
    private int I02;    // ����
    private int I03;    // �ő�l
    private int I04;    // ���ݒl

    public DrawPanel(int A00) {
        this.I03 = A00;

        setBackground(Color.white);

        I00 = new ImageIcon(C00).getImage();
        I01 = I00.getWidth(this);
        I02 = I00.getHeight(this);

        setPreferredSize(new Dimension(I01, I02));
    }

    public void paintComponent(Graphics A00) {
        super.paintComponent(A00);

        int L00 = I01 * I04 / I03;
        int L01 = I02 * I04 / I03;

        A00.drawImage(I00,(getWidth() - L00) / 2, (getHeight() - L01) / 2,
                L00, L01, this);
    }

    public void M00(int A00) {
        this.I04 = A00;
    }
}

/* �� �N���X�̊O�ł�����ƈꌾ ��
JScrollBar���\������v�f�́A�ŏ��l�A�ő�l�A���ݒl�A�\���͈�(=�c�}�~�̒�
��)�̂S�B�c�}�~�𓮂�����AdjustmentEvent���������A���̃C�x���g�Ńc�}�~
�̈ʒu���擾���邱�Ƃ��ł��܂��B

�f�t�H���g�ł́A�ŏ��l=0�A�ő�l=100�A���ݒn=0�A�c�}�~�̒���=10�̃X�N
���[���o�[����������܂��B�ł́A���̃f�t�H���g�̃X�N���[���o�[���Ԃ��ő�
�̒l�͂����ɂȂ�ł��傤�H�@�����́A�ő�l(100)�|�c�}�~�̒���(10)��90
�ł��B

���������X�N���[���o�[�Ƃ́A�L���̈�̈ꕔ����\�����邽�߂ɂ�����́B�c
�}�~�̒����͕\������͈͂�\���܂��B�ł��̂ŁA���̗�ł����΁A90�̈ʒu��
��10�̕��ʂ�\������΁A�S�̂�100��\�����邱�Ƃ��\�ŁA�X�N���[���o�[
�̋@�\�Ƃ��Ă͂���ŏ[���Ȃ킯�ł��B

���������ϓ_���炷��ƁA�摜�̊g��k���ɃX�N���[���o�[���g���͎̂ד��ŁA
�X���C�_�[(JSlider)�̕����K�؂Ǝv���܂��B�ł�����́A�E�B���h�E�̉E��
�ɂ��錩���ꂽ�X�N���[���o�[�Łu�K�`���[���v������̂��ʔ����Ȃ�ŁA����
�ق��B

�Ō�ɁA�ߍ��̎Ⴂ����ɒ����B�����Y���b�ƃX�N���[���o�[��������Ȃ�Ė�
��ȃ}�l�͂��Ȃ��悤�ɁB���̕��ōׂ����㉺�ɓ������āu�K�`���[���v�̃J��
�����[�N���Č�����񂾂��B���ނ���ȁB
 */
