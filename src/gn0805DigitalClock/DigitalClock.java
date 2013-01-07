/**
 * ����Java256�{�m�b�N for Java 5.0
 * Java�T���v���\�[�X ver0.2C "DigitalClock"
 * DigitalClock.java �u���Ԃ𕶎���ɐ��`���ăf�W�^�����v�v
 *
 * 2005/09/23 ����F���i�m���J�Y
 *
 * �y�R���p�C�������s���@�z
 *     >javac DigitalClock.java
 *     >java DigitalClock
 * �y�L�[���[�h�z
 *     ����������(format string), �x�[�X���C��(base line:���),  *     �A�Z���g(ascent:�㏸), �f�B�Z���g(descent:���~),
 * �y�����Ă݂悤�z
 *     java.text.SimpleDateFormat���g���Ď����𐮌`���� *     �N�������\������B *     �A�i���O���v�����B
 */
import java.awt.Color;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.lang.String;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class DigitalClock extends JFrame {
    final static int C00 = 1000;

    public DigitalClock() {
        DrawPanel L00 = new DrawPanel();
        add(L00);

        new Timer(C00, L00).start();
    }

    public static void main(String[] A00) {
        Toolkit.getDefaultToolkit().setDynamicLayout(true);

        DigitalClock L00 = new DigitalClock();
        L00.setTitle("�f�W�^�����v");
        L00.setDefaultCloseOperation(EXIT_ON_CLOSE);
        L00.setBackground(Color.white);
        L00.setSize(200, 100);
        L00.setVisible(true);
    }
}

class DrawPanel extends JPanel implements ActionListener {

    public DrawPanel() {
        setBackground(Color.white);
    }

    public void actionPerformed(ActionEvent A00) {
        repaint();
    }

    public void paintComponent(Graphics A00) {
        super.paintComponent(A00);

        String L00 = String.format("%1$tp %1$tI:%1$tM:%1$tS", new Date());

        FontMetrics L01 = A00.getFontMetrics();

        A00.drawString(L00, (getWidth() - L01.stringWidth(L00)) / 2,
                (getHeight() + L01.getAscent() - L01.getDescent()) / 2);
    }
}

/* �� �N���X�̊O�ł�����ƈꌾ ��
���������A���^�C���ŕ\������ɂ́A����I�ɉ�ʂ��X�V���Ȃ��Ƃ����܂���B
���̂��߂ɗ��p���Ă���̂��Ajavax.swing.Timer�N���X�B1�b���ƂɃC�x���g��
���������A�C�x���g�������\�b�h�ŉ�ʂ̍ĕ`��v�����o���Ă��܂��B

�����̕�������擾����ɂ́Ajava.text.SimpleDateFormat�A��������
String.format���\�b�h���g���܂��B�����J2SE 5.0�œ������ꂽ�����������
�g���āAString.format���\�b�h�Ńt�H�[�}�b�g������@���̗p���܂����B

"%1$tp %1$tI:%1$tM:%1$tS"�Ƃ��������͈ꌩ���G�ł����A���̈Ӗ���m���Ă�
�΋����ɑ��炸�B�܂�"%"�Ŏn�܂镶���񂪏����̎w����\���܂��B���̌��
����"1$"�́A�P�Ԗڂ̈���(= new Date())�Ƃ����Ӗ��B�܂�4�ӏ���"%"�̕���
���ADate�I�u�W�F�N�g�𕶎��񉻂������̂ɒu���������܂��B

"t"�Ƃ����w��́A�u���t/�����v�ɕϊ�����Ƃ����Ӗ��B"p"�͌ߑO���ߌ�A"I"
��12���Ԑ��̎��A"M"�͕��A"S"�͕b��\���܂��B":"�̂悤�ɏ����Ƃ��ĉ��߂�
��Ȃ��������̂́A���̂܂ܕ\������܂��B����ŁA"�ߑO���ߌ�@���F���F�b"
�Ƃ��������̕����񂪊����B�ڂ�����API�h�L�������g��java.util.Formatter��
����A����������̉�����Q�Ƃ��Ă��������B

��������ʂ̒��S�ɕ\�����邽�߂ɁA�t�H���g�̏ڍׂȏ����擾���Ă܂��B��
���ŏd�v�ɂȂ�̂��A�t�H���g�ɂ�����u�x�[�X���C���v�Ƃ����T�O�B�w�Z�ŏ�
�߂ăA���t�@�x�b�g���K�����Ƃ��̉p��̃m�[�g���v���o���Ă��������B4�{��
�̉�����2�Ԗڂ��Ԃ��Ȃ��Ă܂�����ˁB���ꂪ�u�x�[�X���C���v�B'A'�͂��̐�
�����ɁA'y'��'g'�͉��ɂ͂ݏo���悤�ɔz�u����܂��B���́u�x�[�X���C���v
����̍������u�A�Z���g�v�A���̍������u�f�B�Z���g�v�ƌĂԂ̂ŁA������o
���Ă����Ă��������B
 */
