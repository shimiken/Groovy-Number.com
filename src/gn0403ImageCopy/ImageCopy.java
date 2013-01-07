/**
 * ����Java256�{�m�b�N for Java 5.0
 * Java�T���v���\�[�X ver0.2C "ImageCopy"
 * ImageCopy.java �u�摜���X���[�Y�Ɋg��k���v
 *
 * 2005/09/23 ����F���i�m���J�Y
 *
 * �y�R���p�C�������s���@�z
 *     >javac ImageCopy.java
 *     >java ImageCopy
 * �y�L�[���[�h�z
 *     �X�P�[�����O(scaling:�g��k��), �񓯊�(asynchronous), 
 * �y�����Ă݂悤�z
 *     �k�����Ă݂�B *     SCALE_SMOOTH�Ƒ��̃X�P�[�����O�A���S���Y�����r����B
 */
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.lang.String;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ImageCopy extends JFrame {

    public ImageCopy() {
        add(new DrawPanel());
    }

    public static void main(String[] A00) {
        Toolkit.getDefaultToolkit().setDynamicLayout(true);

        JFrame L00 = new ImageCopy();
        L00.setTitle("�C���[�W���g��R�s�[");
        L00.setDefaultCloseOperation(EXIT_ON_CLOSE);
        L00.setSize(400, 400);
        L00.setVisible(true);
    }
}

class DrawPanel extends JPanel {
    static final String C00 = "image/image.gif";
    static final int C01 = 130;        // �X�P�[����(%)
    Image I00;
    int I01;
    int I02;
    Image I03;

    public DrawPanel() {
        setBackground(Color.white);

        I00 = new ImageIcon(C00).getImage();
        I01 = I00.getWidth(this);
        I02 = I00.getHeight(this);

        I03 = I00.getScaledInstance(I01 * C01 / 100, -1, Image.SCALE_SMOOTH);

        MediaTracker L00 = new MediaTracker(this);
        L00.addImage(I03, 1);
        try {
            L00.waitForAll();
        } catch (InterruptedException L01) {
        }
    }

    public void paintComponent(Graphics A00) {
        super.paintComponent(A00);

        A00.drawString("����", 10, 20);
        A00.drawImage(I00, 10, 25, this);

        A00.drawString("�P���Ɋg��(" + C01 + "%)", 10, 180);
        A00.drawImage(I00, 10, 185, I01 * C01 / 100, I02 * C01 / 100, this);

        A00.drawString("�X���[�Y�Ɋg��(" + C01 + "%)", 200, 180);
        A00.drawImage(I03, 200, 185, this);
    }
}
/* �� �N���X�̊O�ł�����ƈꌾ ��
�摜�̊g��\���Ƃ����΁Ajava.awt.Graphics��drawImage�ŁA���ƍ������w�肷
����@���L���ł����A�掿�͂��܂�ǂ�����܂���B���Ɍ��摜���C���X�g�^�b
�`�̗֊s�̂������肵���G���ƁA���̃A���͖ڗ����܂��BGraphics2D�ŃA���`�G
�C���A�X���w�肵�Ă��A�}�`����̕`��ɂ����K�p����܂���̂őΏ��s�\�B

�����œo�ꂷ��̂�java.awt.Image��getScaledInstance���\�b�h�B����́A��
�̉摜���g��k�������V����Image�I�u�W�F�N�g������Ă���܂��B���̍ۂ�
�u�掿�D��v�u���x�D��v�ȂǃA���S���Y�����w�肷�邱�Ƃ��ł��܂��B

���̃T���v���Ŏw�肵���uSCALE_SMOOTH�v�͂����Ƃ����炩�ȉ掿�Ŋg��k����
����́B���̕��A�����͒x���Ȃ��Ă܂��B����́A�R���X�g���N�^�[�łP�x����
���邾���ł����ApaintComponent�Ȃǂŕp�ɂɍs���\��������ꍇ�́A�掿��
���Ƃ��ď������x��D�悷��I�������l�����Ă��������B

getScaledInstance���\�b�h�ŁA������-1���w�肵�Ă�̂́A�uwidth �� height
�̂ǂ��炩�����̐��l�̏ꍇ�A���̃C���[�W���@�̏c������ێ�����(API�h�L��
�����g���)�v����ł��B

���̃��\�b�h�ŋC�����Ȃ���΂����Ȃ��̂́A�񓯊��ɃC���[�W�����[�h����
�Ƃ������ƁB�܂�AMediaTracker���g���ă��[�h�̏I����҂K�v�������
���BJava�ł́A�񓯊��ɉ摜��ǂݍ��ނ��Ƃ������̂ŁA���̑Ώ����@���o����
�����Ă��������B
 */
