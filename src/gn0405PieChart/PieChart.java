/**
 * ����Java256�{�m�b�N for Java 5.0
 * Java�T���v���\�[�X ver0.2C "PieChart"
 * PieChart.java �u�A���`�G�C���A�X�ŉ~�O���t�����ꂢ�ɕ\���v
 *
 * 2005/09/23 ����F���i�m���J�Y
 *
 * �y�R���p�C�������s���@�z
 *     >javac PieChart.java
 *     >java PieChart
 * �y�L�[���[�h�z
 *     ��(arc)�̓h��Ԃ�, Java2D, �A���`�G�C���A�X(antialias), *     Map�C���^�[�t�F�[�X
 * �y�����Ă݂悤�z
 *     �f�[�^��ǉ����Ă݂�B *     �f�[�^�̊Ǘ���HashMap���g���Ƃǂ��Ȃ邩�����Ă݂�B *     �O���t�ɁA�l��p�[�Z���e�[�W���\������B
 */
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.lang.String;
import java.lang.System;
import java.util.Map;
import java.util.LinkedHashMap;
import javax.swing.JFrame;
import javax.swing.JPanel;
import static java.awt.RenderingHints.KEY_ANTIALIASING;
import static java.awt.RenderingHints.VALUE_ANTIALIAS_ON;

public class PieChart extends JFrame {

    public PieChart() {
        add(new DrawPanel());
    }

    public static void main(String[] A00) {
        JFrame L00 = new PieChart();
        L00.setTitle("�~�O���t");
        L00.setDefaultCloseOperation(EXIT_ON_CLOSE);
        L00.setBackground(Color.white);
        L00.pack();
        L00.setResizable(false);
        L00.setVisible(true);
    }
}

class DrawPanel extends JPanel {
    private static final int C00 = 200;
    private static final int C01 = 200;
    private static final int C02 = 20;  // �O���t�̕\���ʒu(x�����Ay�������p)
    private static final int C03 = 5;   // �e�̂��炵�Ԋu(x�����Ay�������p)
    private static final int C04 = 150;
    private Color I00 = new Color(64, 64, 64);    // �e�Ƃӂ��̐F

    private Map<Color, Integer> I01;
    private int I02;

    public DrawPanel() {
        setBackground(Color.white);
        setPreferredSize(new Dimension(C00, C01));

        I01 = new LinkedHashMap<Color, Integer>();
        I01.put(new Color(255, 32, 32), 50);
        I01.put(new Color(64, 192, 32), 18);
        I01.put(new Color(96, 32, 255), 32);
        I01.put(new Color(255, 192, 0), 42);
        I01.put(new Color(0, 192, 255), 15);

        I02 = 0;
        for (int L01 : I01.values()) {
            I02 += L01;
        }
    }

    public void paintComponent(Graphics A00) {
        super.paintComponent(A00);

        Graphics2D L00 = (Graphics2D)A00;
        L00.setRenderingHint(KEY_ANTIALIASING, VALUE_ANTIALIAS_ON);

        L00.setColor(I00);
        L00.fillOval(C02 + C03, C02 + C03, C04, C04);

        int L01 = 90;   // �~�O���t�̕`��J�n�p�x
        int L02 = 0;    // ��`�̒��S�p
        
        for (Color L03 : I01.keySet()) {
            L02 = Math.round(360f * I01.get(L03) / I02);
            L01 -= L02;
            L00.setColor(L03);
            L00.fillArc(C02, C02, C04, C04, L01, L02);
        }
        // �l�̌ܓ��̓s���œh��c�����o���ꍇ�̑Ώ�
        L00.fillArc(C02, C02, C04, C04, -270, L02);

        L00.setColor(I00);
        L00.drawOval(C02, C02, C04, C04);
    }
}

/* �� �N���X�̊O�ł�����ƈꌾ ��
�ʏ�A�~�O���t�́A�^��i���v��12���j����E���ɍ��ڂ�z�u���܂����A
fillArc���\�b�h�ł́A�E�����̐������i���v��3���j��0�x�Ƃ��āA�����ɒ�
�S�p���w�肵�܂��B���̓s���ŁA���̃T���v���ł́A90�x(�^��)����`����n��
�āA-270�x(�^��)�ŏI���Ƃ����\���ɂȂ��Ă܂��B���G�ł����A�q���g�𑽂�
�ɓ���Ă܂���ŁA�撣���ĉ�͂��Ă��������B

�O���t�ɗ��p����f�[�^�́A�F�Ɛ��l�g�ݍ��킹��Map�ŊǗ����Ă��܂��BMap��
�͒ǉ��������Ԃ�ێ�����LinkedHashMap���̗p���܂����B���Ȃ݂ɁA�F���L�[
�ɂ��Ă܂��̂ŁAMap�̓�����A�����F��2�x�g�����Ƃ͏o���܂���B

�E�B���h�E�T�C�Y�̎w��ɂ́A������Ƃ����d�|��������܂��BJFrame�ɑ΂���
setSize���\�b�h�ŃT�C�Y���w�肷��ƁA�g��^�C�g���o�[���݂̃T�C�Y�ɂȂ�
�Ă��܂��܂���ˁB����̃T���v���̂悤�ɁA�\���̈�𒆐S�ɐ��@�����߂���
�ꍇ�́A�\���p�l���ɑ΂��āAsetPreferredSize���\�b�h�ŕK�v�ȃT�C�Y���w��
���āA�t���[����pack���\�b�h���Ăׂ΁A���̕\���̈悪���܂�A�œK�ȃt���[
���T�C�Y�ɂȂ��Ă���܂��B

�A���`�G�C���A�X��������ƁA�`�摬�x���x���Ȃ�܂����A����̂悤�ȃA�j
���[�V�����𔺂�Ȃ��}�`�`��Ȃ�A��肠��܂���̂ŁA�����ڗD��łǂ��
�񗘗p���Ă����Ă����Ǝv���܂��B
 */
