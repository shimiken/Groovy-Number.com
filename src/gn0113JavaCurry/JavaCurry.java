/**
 * ����Java256�{�m�b�N for Java 5.0
 * Java�T���v���\�[�X ver0.2C "JavaCurry"
 * JavaCurry.java �u�J���[�̃p�b�P�[�W���I�u�W�F�N�g�w���ŕ\���v
 *
 * 2005/09/23 ����F���i�m���J�Y
 *
 * �y�R���p�C�������s���@�z
 *     >javac *.java
 *     >java JavaCurry
 * �y�L�[���[�h�z
 *     ��ːH�i, �{���J���[�S�[���h
 * �y�����Ă݂悤�z
 *     Box�ACircle�AText����肭�g�ݍ��킹�A�E����JAS�}�[�N������B *     http://www.jasnet.or.jp/
 */
import java.awt.Color;
import java.lang.String;
import java.lang.System;
import javax.swing.JFrame;

public class JavaCurry extends JFrame {

    public JavaCurry() {
        add(new DrawPanel());
    }

    public static void main(String[] A00) {
        JFrame L00 = new JavaCurry();
        L00.setTitle("�I�u�W�F�N�g�w�����g���g�J���[");
        L00.setDefaultCloseOperation(EXIT_ON_CLOSE);
        L00.setBackground(Color.white);
        L00.pack();
        L00.setResizable(false);
        L00.setVisible(true);
    }
}

/* �� �N���X�̊O�ł�����ƈꌾ ��
�{���́A�n�E�X�w�W�����J���[�x�̃p�b�P�[�W����肽��������ł����A���Ȃ�
���G�ŁA�ƂĂ��v���~�e�B�u�Ȑ}�`�̑g�ݍ��킹�ł͕\���s�\�Ȃ��߁A�f����
�v���ŁA��ːH�i�w�{���J���[ �S�[���h�x���ނɂ��܂����B

���g���g�J���[�}�j�A�ɂ����܂��O�ɁA�����󂵂Ă����܂��B
 */
