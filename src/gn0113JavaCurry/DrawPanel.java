/**
 * ����Java256�{�m�b�N for Java 5.0
 * Java�T���v���\�[�X ver0.2C "JavaCurry"
 * DrawPanel.java �u�J���[�̃p�b�P�[�W���I�u�W�F�N�g�w���ŕ\���v
 *
 * 2005/09/23 ����F���i�m���J�Y
 *
 * �y�R���p�C�������s���@�z
 *     >javac *.java
 *     >java JavaCurry
 * �y�L�[���[�h�z
 *     �A���`�G�C���A�X(antialias)
 * �y�����Ă݂悤�z
 *     JavaCurry.java�Q�ƁB
 */
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JPanel;
import static java.awt.RenderingHints.KEY_ANTIALIASING;
import static java.awt.RenderingHints.VALUE_ANTIALIAS_ON;

public class DrawPanel extends JPanel {
    static final int C00 = 280;
    static final int C01 = 360;
    static final Color C02 = new Color(170, 0, 0);
    static final Color C03 = new Color(250, 190, 20);
    static final Color C04 = new Color(240, 30, 0);
    static final Color C05 = new Color(240, 70, 0);
    List<Parts> I00;

    public DrawPanel() {
        setBackground(Color.white);
        setPreferredSize(new Dimension(C00, C01));

        I00 = new ArrayList<Parts>();

        I00.add(new Box(10, 10, 260, 340, C03));
        I00.add(new Text("�W���o�J���[", 25, 62, C02, 36));
        I00.add(new Text("JAVA CURRY GOLD �S�[���h", 30, 84, C02, 16));
        I00.add(new Text("�h��256�{", 176, 100, Color.red, 16));
        I00.add(new Text("200g�E1�l��", 25, 330, Color.black, 10));
        I00.add(new Circle(30, 105, 220, C02));
        I00.add(new Circle(60, 135, 160, C04));
        I00.add(new Circle(80, 155, 120, C05));
        I00.add(new Circle(100, 175, 80, C03));
    }

    public void paintComponent(Graphics A00) {
        super.paintComponent(A00);
        Graphics2D L00 = (Graphics2D)A00;
        L00.setRenderingHint(KEY_ANTIALIASING, VALUE_ANTIALIAS_ON);

        for (Parts L01 : I00) {
            L01.M00(L00);
        }
    }
}

/* �� �N���X�̊O�ł�����ƈꌾ ��
�uJava�J���[�S�[���h�v�̕\���́A�u�l�p�v�u�����v�u�~�v��3��ނ̃p�[�c��
�g�ݍ��킹�Ď������Ă��܂��B�\������Ă��镶���́A���ׂ�Text�N���X�̃C��
�X�^���X�ŁA���S�~�́ACircle�N���X�̃C���X�^���X��4�d�˂����̂ł��B

����ȋ�ɁA�Ⴄ�N���X����h�������C���X�^���X�ł����A�ŏI�I�ɂ͂ǂ��
Parts�^�Ƃ��Ĉꊇ�Ǘ�����Ă��܂��B����́ABox, Text, Circle���ꂼ��̃N
���X��Parts�C���^�[�t�F�[�X���������Ă��邩�炱���Ȃ���킴�B�ʁX�̃N��
�X�ł��A���ʗv�f���C���^�[�t�F�[�X�ɒ��o���邱�ƂŁu������ނ��́v�Ƃ���
�Ǘ����邱�Ƃ��o���܂��B

�Ƃɂ����A�I�u�W�F�N�g�w���𗝉����Ă��炤�̂ɁA����ȃT���v�����̂́A
�������炢�̂��񂾂낤�ƁA���Â��i�ł�������҂�ւ�Ɂj�v���Ă��܂��B
���N����ɁuJavaCurry�ŃI�u�W�F�N�g�w���̈Ӗ��𗝉����܂����v�Ƃ����v��
�O���}������邱�Ƃ��A�S������Ă�݂܂���B
 */
