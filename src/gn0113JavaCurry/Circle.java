/**
 * ����Java256�{�m�b�N for Java 5.0
 * Java�T���v���\�[�X ver0.2C "JavaCurry"
 * Circle.java �u�J���[�̃p�b�P�[�W���I�u�W�F�N�g�w���ŕ\���v
 *
 * 2005/09/23 ����F���i�m���J�Y
 *
 * �y�R���p�C�������s���@�z
 *     >javac *.java
 *     >java JavaCurry
 * �y�L�[���[�h�z
 *     �ȉ~(oval)�̕`��
 * �y�����Ă݂悤�z
 *     JavaCurry.java�Q�ƁB
 */
import java.awt.Color;
import java.awt.Graphics;

public class Circle implements Parts {
    int I00;
    int I01;
    int I02;
    Color I03;

    Circle(int A00, int A01, int A02, Color A03) {
        this.I00 = A00;
        this.I01 = A01;
        this.I02 = A02;
        this.I03 = A03;
    }

    public void M00(Graphics A00) {
        A00.setColor(I03);
        A00.fillOval(I00, I01, I02, I02);
    }
}

/* �� �N���X�̊O�ł�����ƈꌾ ��
���̃T���v�������ɂ�����A�u�{���J���[�̃p�b�P�[�W���Ăǂ�Ȃ񂾂�
���H�v�Ƃ������ƂŁA�����A�ߏ��̃X�[�p�[�i��߃^�E���@���X�j�֒����ɍs��
�܂����B�������A�l�̋L���ɂ���w�{���J���[ �S�[���h�x�͂��������ɂ͂�
���A�w�{���J���[ �S�[���h�Q�P�x�ւƃo�[�W�����A�b�v���Ă�ł͂Ȃ��ł�
���I�@�������A�p�b�P�[�W�́u�ہv���A�����ɗ��̓I�ŁA�e�J���܂œ����Ă�
����Ȃ��ł����I

�Ƃ肠�������Ȃ��������Ƃɂ��āA�X�[�p�[����ɂ��܂����c�c�B
 */
