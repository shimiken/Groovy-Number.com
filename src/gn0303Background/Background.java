/**
 * ����Java256�{�m�b�N for Java 5.0
 * Java�T���v���\�[�X ver0.2C "Background"
 * Background.java �u�E�C���h�E�̔w�i�ɉ摜��~���l�߂�v
 *
 * 2005/09/23 ����F���i�m���J�Y
 *
 * �y�R���p�C�������s���@�z
 *     >javac Background.java
 *     >java Background
 * �y�L�[���[�h�z
 *     �w�i(background)�̓h��Ԃ�, BorderLayout, do while���[�v, *     ImageIcon
 * �y�����Ă݂悤�z
 *     �{�^���ȊO�̃R���|�[�l���g��z�u���Ă݂�B *     OK�{�^�����������тɔw�i�̉摜���ς��悤�ɂ���B *     �iimage�t�H���_��"dot.gif"�Ƃ����摜��p�ӂ��Ă܂��j
 */
import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.lang.String;
import java.lang.System;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Background extends JFrame {

    public Background() {
        JPanel L00 = new BgPanel();
        L00.setLayout(new BorderLayout());
        JPanel L01 = new JPanel();
        L01.setOpaque(false);
        L01.add(new JButton("OK"));
        L00.add(L01, BorderLayout.SOUTH);

        setContentPane(L00);
    }

    static public void main(String[] A00) {
        Toolkit.getDefaultToolkit().setDynamicLayout(true);
        System.setProperty("sun.awt.noerasebackground", "true");

        JFrame L00 = new Background();
        L00.setTitle("�w�i�ɉ摜��~���l�߂Ă܂�");
        L00.setDefaultCloseOperation(EXIT_ON_CLOSE);
        L00.setSize(320, 240);
        L00.setVisible(true);
    }
}

class BgPanel extends JPanel {
    static final String C00 = "image/raster.gif";
    Image I00;
    int I01;
    int I02;

    public BgPanel() {
        I00 = new ImageIcon(C00).getImage();
        I01 = I00.getWidth(this);
        I02 = I00.getHeight(this);
    }

    public void paintComponent(Graphics A00) {
        if (I01 <= 0 || I02 <= 0) {
            return;
        }

        int L00 = 0;
        do {
            int L01 = 0;
            do {
                A00.drawImage(I00, L00, L01, this);
                L01 += I02;
            } while (L01 < getHeight());
            L00 += I01;
        } while (L00 < getWidth());
    }
}

/* �� �N���X�̊O�ł�����ƈꌾ ��
�w�i�̉摜��ImageIcon�N���X���g���ēǂݍ���ł܂��B���̃N���X�̃R���X�g
���N�^�[�́A���f�B�A�g���b�J�[(java.awt.MediaTracker)���g���āA�C���[�W
�����S�ɓǂݍ��܂��܂őҋ@���Ă����̂ŁA�֗��ł��ˁB���Ȃ݂ɁA�摜
�t�H�[�}�b�g��GIF�AJPEG�APNG�ɑΉ����Ă܂��B

�V�X�e���v���p�e�B���g���āA�w�i�̓h��Ԃ���}�����Ă܂��B������i���I
�ɒ񋟂���邱�Ƃ��ۏ؂���Ă���@�\�ł͂���܂��񂪁A5.0�ł�����������
�����ꂽ�̂ŁA���΂炭�͎g�������ȗ\���ł��B

�{�^���p�̃p�l���́A���ɕ~�����w�i�p�p�l����������悤�ɁA
setOpaque(false)�œ����ɂ��Ă܂����A����"Opaque"�́u�s�����ȁv�Ƃ����Ӗ�
�ŁA�u�I�E�y�C�N�v�Ɣ������܂��B�ł��l�́A�ŏ�������u�I�p�L���[�v�Ɠǂ�
�ł��܂��A�ȗ������ƁA�u�I�o�L���[���I�o�P�̂p���Y�������v�̘A�z��
�usetOpaque(true)�œ������I�v�Ƃ����������瓦���ꂸ�ɂ��܂��B

�Ƃ������ƂŁASun Microsystems�l�ցB�����Z�̐܂Ƃ͑����グ�܂����A
JComponent�Ɉȉ��̂悤�ȃ��\�b�h��ǉ����Ă���������ƁA�l�͂Ƃ��Ă��K��
�ł��B

public void setObaque(boolean isObaque) {
    setOpaque(!isObaque);
}
 */
