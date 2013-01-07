/**
 * ����Java256�{�m�b�N for Java 5.0
 * Java�T���v���\�[�X ver0.2C "LoopString"
 * LoopString.java �u�~����ɕ�����z�u����v
 *
 * 2005/09/23 ����F���i�m���J�Y
 *
 * �y�R���p�C�������s���@�z
 *     >javac LoopString.java
 *     >java LoopString
 * �y�L�[���[�h�z
 *     �A���`�G�C���A�X(antialias), �A�t�B���ϊ�(affine transform),  *     �v���|�[�V���i���t�H���g(proportional font) *     
 * �y�����Ă݂悤�z
 *     ���~��ɕ�����z�u����B *     �T�C���J�[�u��ɕ�����z�u����B
 */
import java.awt.Color;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Toolkit;
import java.lang.String;
import javax.swing.JFrame;
import javax.swing.JPanel;
import static java.lang.Math.PI;
import static java.awt.RenderingHints.KEY_ANTIALIASING;
import static java.awt.RenderingHints.VALUE_ANTIALIAS_ON;

public class LoopString extends JFrame {

    public LoopString() {
        DrawPanel L00 = new DrawPanel();
        add(L00);
    }

    public static void main(String[] A00) {
        Toolkit.getDefaultToolkit().setDynamicLayout(true);

        LoopString L00 = new LoopString();
        L00.setTitle("�i���ɑ�������");
        L00.setDefaultCloseOperation(EXIT_ON_CLOSE);
        L00.setBackground(Color.white);
        L00.setSize(320, 240);
        L00.setVisible(true);
    }
}

class DrawPanel extends JPanel {
    static final String C00 =
            "�T�U�G���񂪔��������悤�ƒ��܂łł���������z��Y��Ė�����";

    public DrawPanel() {
        setBackground(Color.white);
    }

    public void paintComponent(Graphics A00) {
        super.paintComponent(A00);
        Graphics2D L00 = (Graphics2D)A00;

        L00.setRenderingHint(KEY_ANTIALIASING, VALUE_ANTIALIAS_ON);

        FontMetrics L01 = A00.getFontMetrics();

        for (int L02 = 0; L02 < C00.length(); L02++) {
            int L03 = L01.charWidth(C00.charAt(L02));
            // Y���W��30�h�b�g�ɌŒ�
            L00.drawString(C00.substring(L02, L02 + 1), (getWidth() - L03) / 2, 30);
            L00.rotate(2.0 * PI / C00.length(), getWidth() / 2.0, getHeight() / 2.0);
        }
    }
}

/* �� �N���X�̊O�ł�����ƈꌾ ��
������������Ɣz�u�����邱�ƂŁA�ǂ�����n�܂��Ăǂ��ŏI��邩�������
�����͂�����Ă݂܂����B

�t���[�Y�́w�T�U�G����x�̃I�[�v�j���O������p�B���́w�T�U�G����x���Ă�
�ɂ́A�ꉞ�̗��R������܂��B�w�T�U�G����x��30�N�ȏ㑱�������A�j���B����
���o��l���̒N��l�A�΂����܂���B�܂�Ŏ��Ԃ��~�܂������̂悤�ȉi����
���E�ł��B���́w�T�U�G����x�ɔ�߂�ꂽ�i�������A���[�v���镶����ŕ\��
�����Ƃ����킯�ł��B�[���Ȃ��A������Ȃ����ǁB

�v���O�����I�ɂ́A�����񂩂�1���������o���ĕ`��A���̌��ʂ���]������
�܂��`��Ƃ����̂��J��Ԃ��Ă܂��B����������̂́A������\������ʒu�B��
����Ɖ�]�̒��S�̐^��ɗ���悤�AFontMetrics���擾���ĕ����̕������߂�
���܂��BFontMetrics�̓t�H���g�Ɋւ���`�����񋟂��Ă��N���X�B����
�̕\���ʒu���ׂ����w�肷��Ƃ��ɗ��p���܂��B
 */
